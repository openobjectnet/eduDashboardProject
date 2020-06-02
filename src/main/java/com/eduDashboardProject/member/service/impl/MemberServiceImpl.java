package com.eduDashboardProject.member.service.impl;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import com.eduDashboardProject.member.service.MemberService;
import com.eduDashboardProject.member.service.dao.MemberDAO;
import com.eduDashboardProject.member.vo.MemberVO;

@Service("MemberService")
public class MemberServiceImpl implements MemberService {

	@Resource(name = "MemberDAO")
	private MemberDAO memberDAO;
	
	@Override
	public int insert(MemberVO vo){
		try {
			memberDAO.insert(vo);
		} catch (Exception e) {
			e.printStackTrace();
			return 1;
		}
		
		return 0;
	}

	@Override
	public MemberVO login(MemberVO vo, HttpSession session) {
		MemberVO member = memberDAO.login(vo);
		
//		boolean result = (check == null) ? false : true;
		
//		if(result) {
//			session.setAttribute("member", check);
//		}
		
		
		return member;
	}

	@Override
	public boolean idCheck(String id) {
		Long cnt = memberDAO.idCheck(id);
		
		boolean result = (cnt == 0) ? true : false;
		
		return result;
	}


}
