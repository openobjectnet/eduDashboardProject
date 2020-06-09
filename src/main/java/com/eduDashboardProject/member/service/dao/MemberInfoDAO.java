package com.eduDashboardProject.member.service.dao;

import com.eduDashboardProject.member.vo.MemberInfoVO;
import com.eduDashboardProject.member.vo.MemberVO;

public interface MemberInfoDAO {

	public int insert(MemberInfoVO vo);
	
	public MemberInfoVO read(MemberVO vo);
	
	public int update(MemberInfoVO vo);
	
}
