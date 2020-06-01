package com.eduDashboardProject.hyo.vo;

import java.util.Date;

import com.eduDashboardProject.member.vo.MemberVO;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class HyoboardVO {

	private int bno;
	private String title;
	private String content;
	private Date reg_date;
	private Date mod_date;
	private String id;
	private int mno;
	
	
}
