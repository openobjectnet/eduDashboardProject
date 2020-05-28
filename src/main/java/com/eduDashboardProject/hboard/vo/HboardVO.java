package com.eduDashboardProject.hboard.vo;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class HboardVO {

	private int bno;
	private String title;
	private String content;
	private Date regdate;
	private Date moddate;
	private String id;

}
