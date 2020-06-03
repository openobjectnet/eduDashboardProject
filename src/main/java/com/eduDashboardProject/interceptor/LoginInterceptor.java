package com.eduDashboardProject.interceptor;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 * 로그인 인터셉터
 * 세션에서 로그인 정보가 없을 경우 대처
 */
@Slf4j
public class LoginInterceptor extends HandlerInterceptorAdapter {

	private static final String MEMBER = "member";
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		HttpSession session = request.getSession();
		
		ModelMap modelMap = modelAndView.getModelMap();
		Object member = modelMap.get("member");
		
		if(member != null) {
			log.info("new login success");
			session.setAttribute(MEMBER, member);
			
			response.sendRedirect("/main");
		}
		
		
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		HttpSession session = request.getSession();
		
		if(session.getAttribute(MEMBER) != null) {
			log.info("clear login data before");
			session.removeAttribute(MEMBER);
		}
		
		return true;
	}
	
}
