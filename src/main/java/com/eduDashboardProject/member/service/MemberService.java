package com.eduDashboardProject.member.service;

import javax.servlet.http.HttpSession;

import com.eduDashboardProject.member.vo.MemberVO;

public interface MemberService {

	public int insert(MemberVO vo);
	
	public MemberVO login(MemberVO vo, HttpSession session);
	
	public boolean idCheck(String id);
	
}
