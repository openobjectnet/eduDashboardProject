package com.eduDashboardProject.member.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.eduDashboardProject.member.service.MemberInfoService;
import com.eduDashboardProject.member.service.dao.MemberInfoDAO;
import com.eduDashboardProject.member.vo.MemberInfoVO;
import com.eduDashboardProject.member.vo.MemberVO;

@Service("MemberInfoService")
public class MemberInfoServiceImpl implements MemberInfoService {

	@Resource(name = "MemberInfoDAO")
	private MemberInfoDAO memberinfoDAO;
	
	//상세 정보 등록하기
	@Override
	public int insert(MemberInfoVO vo) {
		return memberinfoDAO.insert(vo);
		
	}
	
	//상세 정보 읽기
	@Override
	public MemberInfoVO read(MemberVO vo) {
		return memberinfoDAO.read(vo);
	}
	
	
	//상세 정보 수정하기
	@Override
	public MemberInfoVO update(MemberInfoVO vo) {
		System.out.println("결과입니당: "+memberinfoDAO.update(vo));
		return memberinfoDAO.update(vo);
	}

	

}
