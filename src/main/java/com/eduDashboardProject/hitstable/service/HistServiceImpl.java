package com.eduDashboardProject.hitstable.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.eduDashboardProject.hitstable.dao.HistDAO;
import com.eduDashboardProject.hitstable.vo.HistTable;

@Service("HistService")
public class HistServiceImpl implements HistService {

	@Resource(name="HistDAO")
	private HistDAO hDAO;
	
	@Transactional
	@Override
	public int insertHist(HistTable ht) {
		return hDAO.insertHist(ht);
	}

}
