package com.eduDashboardProject.hboard.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.eduDashboardProject.hboard.dao.HboardDAO;
import com.eduDashboardProject.hboard.service.HboardService;
import com.eduDashboardProject.hboard.vo.HboardVO;

@Service("HboardService")
public class HboardServiceImpl implements HboardService {

	@Resource(name = "HboardDAO")
	private HboardDAO hboardDAO;

	@Override
	public int insert(HboardVO vo) {
		vo.setContent(vo.getContent().replace("\\r\\n", "<br>"));
		
		return hboardDAO.insert(vo);
	}

	@Override
	public List<HboardVO> selectList() {
		
		return hboardDAO.selectList();
	}

	@Override
	public HboardVO read(int bno) {
		
		return hboardDAO.read(bno);
	}

	@Override
	public int update(HboardVO vo) {
		
		return hboardDAO.update(vo);
	}
	
	@Override
	public int delete(int bno) {
		
		return hboardDAO.delete(bno);
	}

	
	
	
}
