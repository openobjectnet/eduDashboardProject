package com.eduDashboardProject.hitstable.dao;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.eduDashboardProject.hitstable.vo.HistTable;
import com.eduDashboardProject.hyo.vo.HyoboardVO;

@Repository("HistDAO")
public class HistDAOImpl implements HistDAO {

	public static final String namespace = "histMapper";
	
	@Resource(name="sqlsessionTemplate")
	private SqlSessionTemplate sqlSession;
	
	@Override
	public int insertHist(HistTable ht) {
		return sqlSession.insert(namespace + ".insertHist",ht);
	}

}
