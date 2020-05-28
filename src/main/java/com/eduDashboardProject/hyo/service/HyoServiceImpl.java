package com.eduDashboardProject.hyo.service;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.eduDashboardProject.hyo.dao.HyoDAO;
import com.eduDashboardProject.hyo.vo.HyoboardVO;

@Service("HyoService")
public class HyoServiceImpl implements HyoService {

	@Resource(name="HyoDAO")
	private HyoDAO hDAO;
	
	@Override
	public int getListCount() throws Exception {
		return 0;
	}

	@Override
	public ArrayList<HyoboardVO> selectList() throws Exception {
		return hDAO.selectList();
	}


	@Override
	public int insertBoard(HyoboardVO hb) {
		return hDAO.insertBoard(hb);
	}

	@Override
	public HyoboardVO boardselect(int bno) {
		return hDAO.boardselect(bno);
	}

	@Override
	public int updateBoard(HyoboardVO hb) {
		return hDAO.updateBoard(hb);
	}

	@Override
	public int deleteBoard(int bno) {
		return hDAO.deleteBoard(bno);
	}

	@Override
	public ArrayList<HyoboardVO> selectOne(String id) {
		return hDAO.selectOne(id);
	}


	

}
