package com.eduDashboardProject.member.vo;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MemberInfoVO {

	private int mno;
	private Date birth;
	private String email;
	private String job;
}
