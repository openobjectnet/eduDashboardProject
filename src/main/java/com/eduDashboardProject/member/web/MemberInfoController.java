package com.eduDashboardProject.member.web;

import javax.annotation.Resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
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
/*	
	@GetMapping("/modify")
	public void updateGet(Model model, @RequestParam("mno")int mno){
		model.addAttribute("info",memberinfoService.read(mno));
	}
*/	/*
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
	
	@PostMapping(value="/modify")
	public ResponseEntity<MemberInfoVO> updatePost(MemberInfoVO mvo,MemberVO vo){
		log.info("chg email = " + mvo.getEmail());
		  int result = memberinfoService.update(mvo);
		  log.info("result = " + result);
		  if(result==1){
			  MemberInfoVO info = memberinfoService.read(vo);
			  log.info("info = " + info.getEmail());
			  
			  return new ResponseEntity<MemberInfoVO>(info, HttpStatus.OK);
		  }
		  return new ResponseEntity<MemberInfoVO>(HttpStatus.INTERNAL_SERVER_ERROR);
		  
		  
		  //return memberinfoService.update(vo) == 1 ? new ResponseEntity<MemberInfoVO>(HttpStatus.OK) : new ResponseEntity<MemberInfoVO>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	
	
	
	
	@GetMapping("/get")
	public void readPost(Model model,MemberVO vo){
		
		
		MemberInfoVO member = memberinfoService.read(vo);
		model.addAttribute("info", member);
	}

	/*
	@GetMapping(value="/get" , produces={MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_UTF8_VALUE})
	public ResponseEntity<MemberInfoVO> getPost(MemberVO vo){		
		
		return new ResponseEntity<MemberInfoVO>(memberinfoService.read(vo), HttpStatus.OK);
	}*/

	
	
	
	
	
	
	
	
	
}
