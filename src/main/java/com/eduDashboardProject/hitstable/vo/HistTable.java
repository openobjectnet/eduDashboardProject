package com.eduDashboardProject.hitstable.vo;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 이력관리 테이블
 * @author sajuni
 *
 */
@Getter
@Setter
@ToString
public class HistTable {

	private int id;
	private String user_id;
	private String user_name;
	private Date reg_date;
	private String action;
	
	
}
