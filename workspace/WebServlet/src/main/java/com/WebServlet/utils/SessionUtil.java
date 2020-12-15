package com.WebServlet.utils;

import javax.servlet.http.HttpServletRequest;

public class SessionUtil {
	private static SessionUtil sessionUtil = null;
	
	public static SessionUtil getInstance() {
		if(sessionUtil == null) {
			sessionUtil = new SessionUtil();
		}
			return sessionUtil;
	}
	
	public void putValue(HttpServletRequest request,String key,Object value) {
		request.getSession().setAttribute(key, value);
	}
	public Object getValue(HttpServletRequest request,String key) {
		return request.getSession().getAttribute(key);
	}
	public void rmValue(HttpServletRequest request,String key) {
		request.getSession().removeAttribute(key);
	}

}