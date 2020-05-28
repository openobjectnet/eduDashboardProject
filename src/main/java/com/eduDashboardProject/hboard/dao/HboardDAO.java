package com.eduDashboardProject.hboard.dao;

import java.util.List;

import com.eduDashboardProject.hboard.vo.HboardVO;

public interface HboardDAO {

	public int insert(HboardVO vo);
	
	public List<HboardVO> selectList();
	
	public HboardVO read(int bno);

	public int update(HboardVO vo);
	
	public int delete(int bno);
	
}
