package com.eduDashboardProject.mentoring.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.eduDashboardProject.mentoring.dao.MentoringDAO;
import com.eduDashboardProject.mentoring.vo.MentoringVO;

@Repository("MentoringDAO")
public class MentoringDAOImpl implements MentoringDAO {

	@Resource(name = "sqlsessionTemplate")
	private SqlSessionTemplate sqlSession;
	
	@Override
	public List<MentoringVO> selectList() {

		return sqlSession.selectList("mentoringMapper.selectList");
	}

}
