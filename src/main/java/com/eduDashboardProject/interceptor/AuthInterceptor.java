package com.eduDashboardProject.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AuthInterceptor extends HandlerInterceptorAdapter {
	 
	private void saveDest(HttpServletRequest req) {

	      String uri = req.getRequestURI();

	      String query = req.getQueryString();

	      if (query == null || query.equals("null")) {
	         query = "";
	      } else {
	         query = "?" + query;
	      }

	      if (req.getMethod().equals("GET")) {
	         log.info("dest: " + (uri + query));
	         req.getSession().setAttribute("dest", uri + query);
	      }
	   }

	   @Override
	   public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
	         throws Exception {

	      HttpSession session = request.getSession();

	      if (session.getAttribute("member") == null) {

	    	 log.info("current user is not logined");
	    	  
	         saveDest(request);
	         
	         response.sendRedirect("/loginGuide");
	         return false;
	      }
	      return true;
	   }
}
