package com.eduDashboardProject.mentoring.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.eduDashboardProject.mentoring.dao.MentoringDAO;
import com.eduDashboardProject.mentoring.service.MentoringService;
import com.eduDashboardProject.mentoring.vo.MentoringVO;

@Service("MentoringService")
public class MentoringServiceImpl implements MentoringService {

	@Resource(name = "MentoringDAO")
	private MentoringDAO mentoringDAO;
	
	@Override
	public List<MentoringVO> selectList() {
		return mentoringDAO.selectList();
	}
	
}
