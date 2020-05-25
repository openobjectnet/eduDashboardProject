package com.eduDashboardProject.common.service.dao;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository("BaseDAO")
public class BaseDAOImpl implements BaseDAO {
	
	@Resource(name = "sqlsessionTemplate")
	private SqlSessionTemplate sqlSession;

	public Object selectObject(String id, Object object) {
		return sqlSession.selectOne(id, object);
	}

	public List<?> selectList(String id, Object object) {
		return sqlSession.selectList(id, object);
	}
	
	public int insert(String id, Object object) {
		return sqlSession.insert(id, object);
	}

	public int update(String id, Object object) {
		return sqlSession.update(id, object);
	}
	
	public int delete(String id, Object object) {
		return sqlSession.delete(id, object);
	}

}
