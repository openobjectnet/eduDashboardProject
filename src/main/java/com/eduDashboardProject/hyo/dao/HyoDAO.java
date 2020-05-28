package com.eduDashboardProject.hyo.dao;

import java.util.ArrayList;

import com.eduDashboardProject.hyo.vo.HyoboardVO;

public interface HyoDAO {

	public ArrayList<HyoboardVO> selectList();

	public int insertBoard(HyoboardVO hb);

	public HyoboardVO boardselect(int bno);
}
