package com.eduDashboardProject.hboard.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping("hboard/*")
public class HboardController {

	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public void listGET() {
		log.info("list.....");
	}
	
}
