package com.eduDashboardProject.yboard.web.mapper;

import java.util.List;

import com.eduDashboardProject.yboard.web.domain.YboardDto;

public interface yBoardMapper {

	public List<YboardDto> getList();
	
	public void insert(YboardDto board);
	
	public YboardDto read(Long bno);
	
	public int delete(Long bno);
	
	public int update(YboardDto board);
	
	
}
