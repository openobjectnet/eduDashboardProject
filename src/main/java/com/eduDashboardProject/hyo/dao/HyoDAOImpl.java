package com.eduDashboardProject.hyo.dao;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.eduDashboardProject.hyo.vo.HyoboardVO;

@Repository("HyoDAO")
public class HyoDAOImpl implements HyoDAO {

	private static final String namespace = "hyoMapper";
	
	@Resource(name = "sqlsessionTemplate")
	private SqlSessionTemplate sqlSession;
	
	@Override
	public ArrayList<HyoboardVO> selectList() {
		return (ArrayList)sqlSession.selectList(namespace+".selectList");
	}

	@Override
	public int insertBoard(HyoboardVO hb) {
		return sqlSession.insert(namespace+".insertBoard",hb);
	}

	@Override
	public HyoboardVO boardselect(int bno) {
		return sqlSession.selectOne(namespace+".boardselect",bno);
	}

}
