package com.hrd.member.helper;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import com.hrd.common.interfaces.Helper;
import com.hrd.common.model.ActionVO;
import com.hrd.member.repository.MemberDAO;

public class ListViewHelper implements Helper {

	@Override
	public ActionVO execute(ActionVO vo) throws ServletException, IOException {
		MemberDAO dao = null;
		try {
			dao = new MemberDAO();
			HttpServletRequest request = vo.getRequest();
			request.setAttribute("list",dao.list());
			vo.setRequest(request);
		} catch (Exception e) {
			e.printStackTrace();
		}
		vo.setSend(false); 
		vo.setViewName("/member/list.jsp");
		return vo; 
	}

}
