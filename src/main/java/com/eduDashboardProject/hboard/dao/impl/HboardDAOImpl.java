package com.eduDashboardProject.hboard.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.eduDashboardProject.hboard.dao.HboardDAO;
import com.eduDashboardProject.hboard.vo.HboardVO;

@Repository("HboardDAO")
public class HboardDAOImpl implements HboardDAO {

	@Resource(name = "sqlsessionTemplate")
	private SqlSessionTemplate sqlSession;
	
	@Override
	public int insert(HboardVO vo) {
		int result = sqlSession.insert("hboardMapper.insert", vo);
		return result;
	}

	@Override
	public List<HboardVO> selectList() {
		
		return sqlSession.selectList("hboardMapper.selectList");
	}

	@Override
	public HboardVO read(int bno) {
		
		return sqlSession.selectOne("hboardMapper.read", bno);
	}

	@Override
	public int update(HboardVO vo) {
		
		return sqlSession.update("hboardMapper.update", vo);
	}
	
	@Override
	public int delete(int bno) {
		
		return sqlSession.delete("hboardMapper.delete", bno);
	}


}
