package com.eduDashboardProject.yboard.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eduDashboardProject.yboard.web.domain.YboardDto;
import com.eduDashboardProject.yboard.web.mapper.yBoardMapper;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@AllArgsConstructor
public class YboardServiceImpl implements YboardService {

	@Setter(onMethod_ = @Autowired)
	private yBoardMapper mapper;

	// 게시물 등록
	@Override
	public void register(YboardDto board) {

		log.info("register......" + board);

		mapper.insert(board);
	}

	// 게시물 상세보기
	@Override
	public YboardDto get(Long bno) {

		log.info("get...." + bno);

		return mapper.read(bno);
	}

	// 게시물 수정하기
	@Override
	public boolean modify(YboardDto board) {

		log.info("modify......" + board);
		
		return mapper.update(board) == 1;
	}

	// 게시물 삭제하기
	@Override
	public boolean remove(Long bno) {

		log.info("remove..... "+bno);
		
		return mapper.delete(bno) == 1;
	}

	// 게시물 조회하기
	@Override
	public List<YboardDto> getList() {

		log.info("List.....");
		
		return mapper.getList();
	}

}
