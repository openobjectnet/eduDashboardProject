package com.eduDashboardProject.member.service.dao;

import com.eduDashboardProject.member.vo.MemberInfoVO;

public interface MemberInfoDAO {

	public int insert(MemberInfoVO vo);
	
	public MemberInfoVO read(int mno);
	
	public int update(MemberInfoVO vo);
	
}
