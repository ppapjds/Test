package com.hrd.common.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hrd.common.interfaces.Command;
import com.hrd.common.model.ActionVO;
import com.hrd.index.controller.IndexController;
import com.hrd.member.controller.MemberController;

/**
 * Servlet implementation class FrontControllerImpl
 */
@WebServlet("*.do")
public class FrontControllerImpl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */ 
	public FrontControllerImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String root = request.getRequestURI();
		Command com = null; 
		ActionVO vo = new ActionVO(request, response);
		String[] arr = root.split("\\/");

		String url = arr.length == 0 ? "/" : arr[1];
		System.out.println("arr length : "+arr.length);	
		if (arr.length > 1) {
			String key = arr[2].split(".do")[0]; 
			vo.setUrl(key);
		}

		System.out.println("url : " + url);
		System.out.println("parmeter : " + vo.getUrl());

		switch (url.toLowerCase()) {
		case "/":
			com = new IndexController();  
			break;
		case "member":
			com = new MemberController();
			break;
		default:
			break;
		}

		if (com == null) {
			com = new IndexController();
		}

		vo = com.execute(vo);
		
		if(vo.isSend()) {
			vo.getResponse().sendRedirect(vo.getViewName());  
			return; 
		} 
		vo.getRequest().getRequestDispatcher(vo.getViewName())
				.forward(vo.getRequest(), vo.getResponse());   
		return; 

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
