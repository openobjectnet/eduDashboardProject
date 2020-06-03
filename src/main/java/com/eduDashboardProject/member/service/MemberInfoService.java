package com.eduDashboardProject.member.service;

import com.eduDashboardProject.member.vo.MemberInfoVO;

public interface MemberInfoService {

	public int insert(MemberInfoVO vo);
	
	public int update(MemberInfoVO vo);
	
	public MemberInfoVO read(int mno);
}
