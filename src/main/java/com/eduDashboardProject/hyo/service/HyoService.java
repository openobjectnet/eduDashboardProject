package com.eduDashboardProject.hyo.service;

import java.util.ArrayList;

import com.eduDashboardProject.hyo.vo.HyoboardVO;

public interface HyoService {
	
	/**
	 * 게시판 글 갯수 가져오기
	 * @return
	 * @throws Exception
	 */
	int getListCount()throws Exception;
	
	
	/**
	 * 게시판 리스트 불러오기
	 * @return
	 * @throws Exception
	 */
	ArrayList<HyoboardVO> selectList()throws Exception;


	/**
	 * 게시글 작성
	 * @return
	 */
	int insertBoard(HyoboardVO hb);


	/**
	 * 게시글 1개 선택
	 * @return
	 */
	HyoboardVO boardselect(int bno);
	
	
	
}
