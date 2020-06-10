package com.eduDashboardProject.member.service;

import com.eduDashboardProject.member.vo.MemberInfoVO;
import com.eduDashboardProject.member.vo.MemberVO;

public interface MemberInfoService {

	public int insert(MemberInfoVO vo);
	
	public MemberInfoVO update(MemberInfoVO vo);
	
	public MemberInfoVO read(MemberVO vo);
}
