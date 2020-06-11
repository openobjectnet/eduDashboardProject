package com.eduDashboardProject.mentoring.vo;

import java.sql.Date;

import lombok.Data;

@Data
public class MentoringVO {
	//날짜 적요 금액 비고
	private int idx;
	private Date orderdate;
	private String orderrecord;
	private int price;
	private String remark;
}
