package com.eduDashboardProject.mentoring.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eduDashboardProject.mentoring.service.MentoringService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping("mentoring/*")
public class MentoringController {

	@Resource(name ="MentoringService")
	private MentoringService mentoringService;
	
	@RequestMapping(value = "/list")
	public void list(Model model){
		
		log.info("list .....");
		
		model.addAttribute("list", mentoringService.selectList());
	
	}
	
	
	
}
