package com.eduDashboardProject.member.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eduDashboardProject.member.service.MemberInfoService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping("memberinfo/*")
public class MemberInfoController {

	@Resource(name = "MemberInfoService")
	private MemberInfoService memberinfoService;
	
	
	
	
	
	
	
	
	
}
