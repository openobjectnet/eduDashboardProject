package com.eduDashboardProject.yboard.web.service;

import java.util.List;

import com.eduDashboardProject.yboard.web.domain.YboardDto;

public interface YboardService {

	public void register(YboardDto board);
	
	public YboardDto get(Long bno);
	
	public boolean modify(YboardDto board);
	
	public boolean remove(Long bno);
	
	public List<YboardDto> getList();
	
	
	
	
	
}
