package com.eduDashboardProject.member.web;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.eduDashboardProject.member.service.MemberService;
import com.eduDashboardProject.member.vo.MemberVO;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping("member/*")
public class MemberController {

	@Resource(name = "MemberService")
	private MemberService memberService;
	
	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	public void insertGET() {
		log.info("insert GET....");
	}
	
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public String insertPOST(MemberVO vo, RedirectAttributes rttr) {
		log.info("insert POST....");
		
		int result = memberService.insert(vo);
		
		if(result == 1) {
			rttr.addFlashAttribute("msg", "회원등록::실패");
		}
		
		rttr.addFlashAttribute("msg", "회원등록::성공");

		return "redirect:/";
	}
	
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView login(MemberVO vo, HttpSession session) {
		boolean result = memberService.login(vo, session);
		ModelAndView mav = new ModelAndView();
		
		if(result == true) {
			log.info("login Success");
			mav.setViewName("/main");
		} else {
			mav.setViewName("../../index");
			mav.addObject("msg", "Fail Login");
		}
		
		return mav;
	}
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpSession session) {
		Object obj = session.getAttribute("member");
		
		if(obj != null) {
			log.info("logout: session.invalidate()");
			
			session.removeAttribute("member");
			session.invalidate();
		}
		
		return "redirect:/";
		
	}
	
}
