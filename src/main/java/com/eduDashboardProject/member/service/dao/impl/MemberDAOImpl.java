package com.eduDashboardProject.member.service.dao.impl;


import java.util.Date;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.eduDashboardProject.member.service.dao.MemberDAO;
import com.eduDashboardProject.member.vo.MemberVO;

@Repository("MemberDAO")
public class MemberDAOImpl implements MemberDAO {

	@Resource(name = "sqlsessionTemplate")
	private SqlSessionTemplate sqlSession;
	
	@Override
	public int insert(MemberVO vo){
		
		try {
			sqlSession.insert("memberMapper.insert", vo);
		} catch (Exception e) {
			e.printStackTrace();
			return 1;
		}
		
		return 0;
	}

	@Override
	public MemberVO login(MemberVO vo) {
		
		return sqlSession.selectOne("memberMapper.login", vo);
	}

	@Override
	public Long idCheck(String id) {
		
		return sqlSession.selectOne("memberMapper.idCheck", id);
	}


	

}
