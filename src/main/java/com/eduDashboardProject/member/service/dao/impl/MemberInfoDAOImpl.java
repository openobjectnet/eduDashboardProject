package com.eduDashboardProject.member.service.dao.impl;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.eduDashboardProject.member.service.dao.MemberInfoDAO;
import com.eduDashboardProject.member.vo.MemberInfoVO;

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
	public MemberInfoVO read(int mno) {
		return sqlSession.selectOne("memberInfoMapper.read", mno);
	}

	@Override
	public int update(MemberInfoVO vo) {
		return sqlSession.update("memberInfoMapper.update", vo);
	}

	

}
