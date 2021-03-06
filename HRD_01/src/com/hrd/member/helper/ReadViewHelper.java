package com.hrd.member.helper;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import com.hrd.common.interfaces.Helper;
import com.hrd.common.model.ActionVO;
import com.hrd.member.domain.MemberDTO;
import com.hrd.member.repository.MemberDAO;

public class ReadViewHelper implements Helper {

	@Override
	public ActionVO execute(ActionVO vo) throws ServletException, IOException {
		// TODO Auto-
		MemberDAO dao = null;
		try {
			HttpServletRequest request = vo.getRequest();
			int custno = toInt(request.getParameter("custno"));
			dao = new MemberDAO();
			
			request.setAttribute("dto", dao.read(new MemberDTO(custno)));
			
			vo.setRequest(request);  
			vo.setViewName("/member/read.jsp");
		}catch (Exception e) {
			e.printStackTrace(); 
		}
		 
		vo.setSend(false);
		return vo;
	}

	
	private int toInt(Object value) {
		int result = 0;
		try {
			result = Integer.parseInt(toStr(value)); 
		}catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	private String toStr(Object obj) {
		if(obj == null) {
			return ""; 
		}
		return String.valueOf(obj);
	}

}
