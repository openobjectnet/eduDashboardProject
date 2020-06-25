package com.eduDashboardProject.mentoring.web;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.eduDashboardProject.mentoring.service.MentoringService;
import com.eduDashboardProject.mentoring.vo.MentoringVO;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("mentoring/*")
public class MentoringController {

	@Resource(name = "MentoringService")
	private MentoringService mentoringService;

	/*
	 * @RequestMapping(value = "/list") public void list(Model model){
	 * 
	 * log.info("list .....");
	 * 
	 * model.addAttribute("list", mentoringService.selectList());
	 * 
	 * }
	 */

	@RequestMapping(value = "/list")
	public ModelAndView list(ModelAndView mav) {
		mav.setViewName("/mentoring/list");
		mav.addObject("list", mentoringService.selectList());
		return mav;
		

	}
	
	@RequestMapping(value = "/list2")
	public ResponseEntity<List<MentoringVO>> list2(Model model) {
		log.info("list2......");
		
		
		//response.setHeader( "Content-Type", "text/html;charset=utf-8" );
		model.addAttribute("list", mentoringService.selectList());

		return new ResponseEntity<List<MentoringVO>>(mentoringService.selectList(), HttpStatus.OK);

	}

	/*
	 * @RequestMapping(value = "/list") public ResponseEntity<List<MentoringVO>>
	 * list() {
	 * 
	 * log.info("list......");
	 * 
	 * ResponseEntity<List<MentoringVO>> entity = null; try { entity = new
	 * ResponseEntity<>(mentoringService.selectList(), HttpStatus.OK); } catch
	 * (Exception e) { e.printStackTrace(); entity = new
	 * ResponseEntity<>(HttpStatus.BAD_REQUEST); } return entity;
	 * 
	 * }
	 */

/*	@RequestMapping(value = "/list")
	public List<MentoringVO> list() {

		List<MentoringVO> mentoringlist = mentoringService.selectList();
		// Gson gson = new Gson(); gson.toJson(mentoringlist);

		return mentoringlist;

	}*/

}
