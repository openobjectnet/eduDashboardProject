package com.eduDashboardProject.member.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.eduDashboardProject.member.service.MemberInfoService;
import com.eduDashboardProject.member.vo.MemberInfoVO;

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
	
	@RequestMapping(value="/registerinfo", method = RequestMethod.POST)
	public String insertPost(MemberInfoVO vo, RedirectAttributes rttr){
		log.info("insert memberinfo.......");
		
		int result = memberinfoService.insert(vo);
		
		if(result != 1){
			rttr.addFlashAttribute("msg", "처리 실패");
		}
		rttr.addFlashAttribute("msg", "처리 완료");
		
		return "redirect:/";
	}
	
	@GetMapping("/modifyinfo")
	public void updateGet(Model model, @RequestParam("mno")int mno){
		model.addAttribute("vo",memberinfoService.read(mno));
	}
	
	@PostMapping("/modify")
	public String updatePost(MemberInfoVO vo,RedirectAttributes rttr){
		int result = memberinfoService.update(vo);
		
		if(result != 1){
			rttr.addFlashAttribute("msg", "처리 실패");
		}
		
		rttr.addFlashAttribute("msg", "처리 완료");
		
		return "redirect:/";
	}
	
	@GetMapping("/get")
	public void readPost(Model model,@RequestParam("mno") int mno){
		model.addAttribute("vo", memberinfoService.read(mno));
	}


	
	
	
	
	
	
	
	
	
}
