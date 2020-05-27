package com.eduDashboardProject.common.service.dao;

import java.util.List;
	
public interface BaseDAO {

	public Object selectObject(String id, Object object);
	
	public List<?> selectList(String id, Object object);
	
	public int insert(String id, Object object);

	public int update(String id, Object object);
	
	public int delete(String id, Object object);
	
}
