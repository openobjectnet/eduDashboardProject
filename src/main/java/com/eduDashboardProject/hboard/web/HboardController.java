package com.eduDashboardProject.hboard.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.eduDashboardProject.hboard.service.HboardService;
import com.eduDashboardProject.hboard.vo.HboardVO;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping("hboard/*")
public class HboardController {

	@Resource(name = "HboardService")
	private HboardService hboardService;
	
	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	public void insertGET() {
		log.info("insert GET.....");
	}
	
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public String insertPOST(HboardVO vo, RedirectAttributes rttr) {
		log.info("insert POST.....");
		
		int result = hboardService.insert(vo);
		
		if(result != 1) {
			rttr.addFlashAttribute("msg", "처리 실패");
		}
		
		rttr.addFlashAttribute("msg", "처리 완료");
		
		return "redirect:list";
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public void listGET(Model model) {
		log.info("list.....");
		
		model.addAttribute("list", hboardService.selectList());
		
	}
	
	@RequestMapping(value = "/read", method = RequestMethod.GET)
	public void read(Model model, @RequestParam("bno") int bno) {
		model.addAttribute("vo", hboardService.read(bno));
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public void updateGET(Model model, @RequestParam("bno") int bno) {
		model.addAttribute("vo", hboardService.read(bno));
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String updatePOST(HboardVO vo, RedirectAttributes rttr) {
		int result = hboardService.update(vo);
		
		if(result != 1) {
			rttr.addFlashAttribute("msg", "처리 실패");
		}
		
		rttr.addFlashAttribute("msg", "처리 완료");
		
		return "redirect:list";
		
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String delete(@RequestParam("bno") int bno, RedirectAttributes rttr) {
		int result = hboardService.delete(bno);
		
		if(result != 1) {
			rttr.addFlashAttribute("msg", "처리 실패");
		}
		
		rttr.addFlashAttribute("msg", "처리완료");
		
		return "redirect:list";
	}
	
}
