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

	/*@Override
	public int register(MentoringVO mentoring) {
		String SQL = "INSERT INTO mentoring VALUES(?, ?, ?, ?)";
		try{
			psmt = conn.prepareStatement(SQL);
			psmt.setString(1,user.getUsername());
			psmt.setInt(2,user.getAge());
			psmt.setString(3,user.getUserGender());
			return pstmt.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}
		return -1; //데이터베이스 오류
	}*/

}
