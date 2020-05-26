package com.hrd.common.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ActionVO {

	private boolean isSend = false;
	private String url;
	private String viewName;
	private HttpServletRequest request;
	private HttpServletResponse response;
	
	
	public ActionVO(HttpServletRequest request,HttpServletResponse response) { 
		this.request = request;
		this.response = response;
	}

	public boolean isSend() { 
		return isSend;
	}

	public void setSend(boolean isSend) {
		this.isSend = isSend;
	}

	public String getViewName() {
		return viewName;
	}

	public void setViewName(String viewName) {
		this.viewName = viewName;
	}

	
	
	public HttpServletRequest getRequest() {
		return request;
	}

	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}

	public HttpServletResponse getResponse() {
		return response;
	}

	public void setResponse(HttpServletResponse response) {
		this.response = response;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	
}
