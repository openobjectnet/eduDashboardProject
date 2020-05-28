package com.eduDashboardProject.yboard.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.eduDashboardProject.yboard.web.domain.YboardDto;
import com.eduDashboardProject.yboard.web.service.YboardService;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/yboard")
@Slf4j
@AllArgsConstructor
public class YboardController {

	private YboardService service;

	@GetMapping("/list")
	public void list(Model model) {

		log.info("목록이얌");
		model.addAttribute("list", service.getList());
	}

	@PostMapping("register")
	public String register(YboardDto board, RedirectAttributes rttr) {

		log.info("register: " + board);

		service.register(board);

		rttr.addFlashAttribute("result", board.getBno());

		return "redirect:/yboard/list";

	}

	@GetMapping("/register")
	public void register() {

	}

	@GetMapping({ "/get", "/modify" })
	public void get(@RequestParam("bno") Long bno, Model model) {

		log.info("/get or modify");
		model.addAttribute("board", service.get(bno));
	}

	@PostMapping("/modify")
	public String modify(YboardDto board, RedirectAttributes rttr) {

		log.info("modify: " + board);

		if (service.modify(board)) {
			rttr.addFlashAttribute("result", "success");
		}
		return "redirect:/yboard/list";
	}
	
	@PostMapping("/delete")
	public String remove(@RequestParam("bno") Long bno,RedirectAttributes rttr){
		
		log.info("remove..."+bno);
		if(service.remove(bno)){
			rttr.addFlashAttribute("result", "success");
		}
		
		return "redirect:/yboard/list";
	}
	
	
	
	
	
	
	
	
	

}
