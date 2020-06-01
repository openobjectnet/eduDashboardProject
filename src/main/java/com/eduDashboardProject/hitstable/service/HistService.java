package com.eduDashboardProject.hitstable.service;

import org.springframework.transaction.annotation.Transactional;

import com.eduDashboardProject.hitstable.vo.HistTable;
import com.eduDashboardProject.hyo.vo.HyoboardVO;

public interface HistService {
	
	@Transactional
	int insertHist(HistTable ht);


	
}
