package com.eduDashboardProject.member.service.dao;

import java.util.Date;

import com.eduDashboardProject.member.vo.MemberVO;

public interface MemberDAO {

	public int insert(MemberVO vo);
	
	public MemberVO login(MemberVO vo);
	
	public Long idCheck(String id);
	
	
}
