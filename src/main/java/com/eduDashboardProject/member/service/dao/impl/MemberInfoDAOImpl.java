package com.eduDashboardProject.member.service.dao.impl;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.eduDashboardProject.member.service.dao.MemberInfoDAO;
import com.eduDashboardProject.member.vo.MemberInfoVO;
import com.eduDashboardProject.member.vo.MemberVO;

@Repository("MemberInfoDAO")
public class MemberInfoDAOImpl implements MemberInfoDAO {

	@Resource(name = "sqlsessionTemplate")
	private SqlSessionTemplate sqlSession;
	
	@Override
	public int insert(MemberInfoVO vo) {
		int result = sqlSession.insert("memberInfoMapper.insert", vo);
		return result;
	}

	@Override
	public MemberInfoVO read(MemberVO vo) {
		return sqlSession.selectOne("memberInfoMapper.read", vo);
	}

	@Override
	public int update(MemberInfoVO vo) {
		System.out.println("다오얌: "+vo);
		return sqlSession.update("memberInfoMapper.update", vo);
	}

	

}
