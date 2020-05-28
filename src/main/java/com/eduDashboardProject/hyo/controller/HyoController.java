package com.eduDashboardProject.hyo.controller;

import java.util.ArrayList;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.eduDashboardProject.hyo.service.HyoService;
import com.eduDashboardProject.hyo.vo.HyoboardVO;
import com.eduDashboardProject.member.vo.MemberVO;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping("hyoboard/*")
public class HyoController {

	@Resource(name="HyoService")
	private HyoService hService;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView listGet(ModelAndView mv) throws Exception {
		log.info("hyo_list.....");
		
		ArrayList<HyoboardVO> list = hService.selectList();
		
		mv.addObject("list",list);
		mv.setViewName("hyoboard/list");
		
		return mv;
	}
	
	@RequestMapping(value="/resisterView", method = RequestMethod.GET)
	public ModelAndView boardresister(ModelAndView mv,HttpSession session) throws Exception {
		
		MemberVO m = (MemberVO)session.getAttribute("member");
		
		mv.addObject("m", m);
		mv.setViewName("hyoboard/boardinsert");
		
		return mv;
	}
	
	@RequestMapping(value="/insertBoard", method = RequestMethod.POST)
	public String boardInsert(HyoboardVO hb,HttpSession session) throws Exception {
		
		MemberVO m = (MemberVO)session.getAttribute("member");
		hb.setId(m.getId());
		
		int result = hService.insertBoard(hb);
		
		if(result > 0) {
			return "redirect:/hyoboard/list";
		}else {
			return "ePage";
		}
		
		
	}
	
	@RequestMapping(value="/detailBoard", method = RequestMethod.GET)
	public ModelAndView boardDetail(ModelAndView mv,int bno,HttpSession session) {
		
		HyoboardVO hb = hService.boardselect(bno);
		
		
		return mv;
		
	}
	
	
	
	
}
