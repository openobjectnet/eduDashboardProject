package com.eduDashboardProject.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class MainController {

	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public void main() {
		log.info("main ...");
	}
	
	@RequestMapping(value = "/loginGuide", method = RequestMethod.GET)
	public void loginGuide() {
		log.info("loginGuide...");
	}
	
}
