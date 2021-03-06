package com.hrd.member.helper;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import com.hrd.common.interfaces.Helper;
import com.hrd.common.model.ActionVO;
import com.hrd.member.repository.MemberDAO;

public class InsertUIViewHelper implements Helper {

	public InsertUIViewHelper() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public ActionVO execute(ActionVO vo) throws ServletException, IOException {

		HttpServletRequest request = (HttpServletRequest) vo.getRequest();
		MemberDAO dao = null;
		try { 
			dao = new MemberDAO();
			request.setAttribute("custno", dao.getSerialNumber());
			vo.setRequest(request); 
		} catch (Exception e) {
			e.printStackTrace();
		}
		vo.setViewName("/member/insertUI.jsp");
		vo.setSend(false);  
		return vo;
	}

}
