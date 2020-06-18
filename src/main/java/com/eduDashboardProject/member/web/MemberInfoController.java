package com.eduDashboardProject.member.web;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.eduDashboardProject.member.service.MemberInfoService;
import com.eduDashboardProject.member.vo.MemberInfoVO;
import com.eduDashboardProject.member.vo.MemberVO;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping("info/*")
public class MemberInfoController {
	
	@Resource(name = "MemberInfoService")
	private MemberInfoService memberinfoService;
	
	@GetMapping(value = "/register")
	public void insertGet(){
		log.info("insert page.....");
	}
	
	@RequestMapping(value="/register", method = RequestMethod.POST)
	public String insertPost(MemberInfoVO vo, RedirectAttributes rttr){
		log.info("insert memberinfo......." + vo);
		
		int result = memberinfoService.insert(vo);
		
		if(result != 1){
			rttr.addFlashAttribute("msg", "처리 실패");
		}
		rttr.addFlashAttribute("msg", "처리 완료");
		
		return "redirect:/main";
	}
	
	/*@RequestMapping(value = "/register")
	public ResponseEntity<MemberInfoVO> insertPost()*/
	
	
	
	
/*	
	@GetMapping("/modify")
	public void updateGet(Model model, @RequestParam("mno")int mno){
		model.addAttribute("info",memberinfoService.read(mno));
	}
	
	@PostMapping("/modify")
	public String updatePost(MemberInfoVO vo,RedirectAttributes rttr){
		int result = memberinfoService.update(vo);
		
		if(result != 1){
			rttr.addFlashAttribute("msg", "처리 실패");
		}
		
		rttr.addFlashAttribute("msg", "처리 완료");
		
		ModelAndView mav = new ModelAndView();
		return "redirect:/main";
	}*/
	
	@RequestMapping(value="/modify")
	public ResponseEntity<MemberInfoVO> updatePost(MemberInfoVO mvo,MemberVO vo){
			  
		 /* MemberInfoVO result = memberinfoService.update(mvo);  
		  log.info("modified result: " + result);
		  return new ResponseEntity<MemberInfoVO>(result, HttpStatus.OK); */
		
		int result = memberinfoService.update(mvo);
		
		if(result == 1){
			log.info("vo: "+vo);
			MemberInfoVO info = memberinfoService.read(vo);
			
			log.info("info 수정 : "+info.getJob() + "info 2 " + info.getEmail());

			return new ResponseEntity<MemberInfoVO>(info,HttpStatus.OK);
			
		}else{
			return new ResponseEntity<MemberInfoVO>(HttpStatus.BAD_REQUEST); 
		}
		
		 
		  		
	}
	
	
	@GetMapping("/get")
	public void readPost(Model model,HttpSession session){

		/*Object obj = session.getAttribute("member");	
		MemberVO vo1 = (MemberVO)obj;*/
				
		MemberVO sessionInfo = (MemberVO)session.getAttribute("member");
		
		log.info("세션: "+sessionInfo);
		
		if(sessionInfo != null){
			MemberInfoVO member = memberinfoService.read(sessionInfo);
			model.addAttribute("info", member);
		}
		
		
	}

	/*
	@GetMapping(value="/get" , produces={MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_UTF8_VALUE})
	public ResponseEntity<MemberInfoVO> getPost(MemberVO vo){		
		
		return new ResponseEntity<MemberInfoVO>(memberinfoService.read(vo), HttpStatus.OK);
	}*/

	
	
	
	
	
	
	
	
	
}
