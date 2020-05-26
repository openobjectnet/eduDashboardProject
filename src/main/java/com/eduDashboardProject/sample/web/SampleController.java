package com.eduDashboardProject.sample.web;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eduDashboardProject.sample.service.SampleService;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping(value = "/sample")
@Slf4j
public class SampleController {
	
	@Resource(name = "SampleService")
	private SampleService sampleService;
	
	@RequestMapping(value = "/testReqest")
	public String testReqest(HttpServletRequest request, HttpServletResponse response, ModelMap model) throws Exception {
	
		String testStr = sampleService.getForDatabaseTest();
		log.info("testReqest request startd");
		
		model.addAttribute("title", "sampleView");
		model.addAttribute("name", "sehoon");
		model.addAttribute("dbResult", testStr);

		return "sample/sampleView";
	}
	
}
