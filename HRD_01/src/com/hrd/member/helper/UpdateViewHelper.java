package com.hrd.member.helper;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import com.hrd.common.interfaces.Helper;
import com.hrd.common.model.ActionVO;
import com.hrd.member.domain.MemberDTO;
import com.hrd.member.repository.MemberDAO;

import oracle.net.aso.r;

public class UpdateViewHelper implements Helper {

	@Override
	public ActionVO execute(ActionVO vo) throws ServletException, IOException {
		MemberDAO dao = null;
		try {
			
			dao = new MemberDAO();
			HttpServletRequest request = vo.getRequest();
			
			int custno = toInt(request.getParameter("custno"));
			String custname = toStr(request.getParameter("custname"));
			String phone = toStr(request.getParameter("phone"));
			String address = toStr(request.getParameter("address"));
			String joindate = toStr(request.getParameter("joindate"));
			String grade = toStr(request.getParameter("grade"));
			String city = toStr(request.getParameter("city"));
			
			
			
			int i = dao.update(new MemberDTO(custno, custname, phone, address, joindate, grade, city));
			vo.setViewName(i != 1? "/error/update.do":"/member/list.do");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		vo.setSend(true);
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
