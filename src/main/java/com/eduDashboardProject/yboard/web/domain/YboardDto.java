package com.eduDashboardProject.yboard.web.domain;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class YboardDto {

	private long bno;
	private String title;
	private String content;
	private Timestamp reg_date;
	private Timestamp mod_date;
	private String id;
}
