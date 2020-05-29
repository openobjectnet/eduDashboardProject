package com.eduDashboardProject.hyo.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.eduDashboardProject.hyo.service.HyoService;
import com.eduDashboardProject.hyo.vo.HyoboardVO;
import com.eduDashboardProject.member.vo.MemberVO;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping("hyoboard/*")
public class HyoController {

	@Resource(name="HyoService")
	private HyoService hService;
	
	@RequestMapping(value = "/list")
	public ModelAndView listGet(ModelAndView mv) throws Exception {
		log.info("hyo_list.....");
		
		ArrayList<HyoboardVO> list = hService.selectList();
		mv.addObject("list",list);
		mv.setViewName("hyoboard/list");
		
		return mv;
	}
	
	@RequestMapping(value="/resisterView")
	public ModelAndView boardresister(ModelAndView mv,HttpSession session) throws Exception {
		
		MemberVO m = (MemberVO)session.getAttribute("member");
		
		mv.addObject("m", m);
		mv.setViewName("hyoboard/boardinsert");
		
		return mv;
	}
	
	@RequestMapping(value="/insertBoard")
	public String boardInsert(HyoboardVO hb,HttpSession session,RedirectAttributes rttr) throws Exception {
		
		MemberVO m = (MemberVO)session.getAttribute("member");
		hb.setId(m.getId());
		
		int result = hService.insertBoard(hb);
		
		if(result > 0) {
			rttr.addFlashAttribute("msg", "처리 성공");
			return "redirect:/hyoboard/list";
		}else {
			rttr.addFlashAttribute("msg", "처리 실패");
			return "common/errorPage";
		}
		
		
	}
	
	@RequestMapping(value="/detailBoard")
	public ModelAndView boardDetail(ModelAndView mv,int bno,HttpSession session) {
		
		HyoboardVO hb = hService.boardselect(bno);
		
		mv.addObject("hb",hb);
		mv.setViewName("hyoboard/boardDetail");
		
		return mv;
		
	}
	
	@RequestMapping(value="/updateBoardView")
	public ModelAndView updateBoardGet(ModelAndView mv,int bno) {
		
		HyoboardVO hb = hService.boardselect(bno);
		mv.addObject("hb",hb);
		mv.setViewName("hyoboard/boardUpdate");
		
		return mv;
	}
	
	@RequestMapping(value="/updateBoard")
	public String updateBoard(HyoboardVO hb,RedirectAttributes rttr) {
		
		int result = hService.updateBoard(hb);
		
		if(result > 0) {
			rttr.addFlashAttribute("msg", "처리 성공");
			return "redirect:list";
		}else {
			rttr.addFlashAttribute("msg", "처리 실패");
			return "common/errorPage";
		}
		
	}
	
	@RequestMapping(value="/delete")
	public String delete(int bno,RedirectAttributes rttr) {
		
		int result = hService.deleteBoard(bno);
		
		if(result > 0) {
			rttr.addFlashAttribute("msg", "삭제 성공");
			return "redirect:list";
		}else {
			rttr.addFlashAttribute("msg", "삭제 실패");
			return "comon/errorPage";
		}
	}
	
	@RequestMapping(value="/myBoardList",produces="text/plain;charset=UTF-8")
	@ResponseBody
		public String myBoardList(String id,HttpServletResponse response) throws JsonIOException, IOException {
		
		ArrayList<HyoboardVO> list = hService.selectOne(id);
		Gson gson = new Gson();
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("list",list);
		String jsonString = gson.toJson(map);
			
		return jsonString;
	}
	
	
	
}
