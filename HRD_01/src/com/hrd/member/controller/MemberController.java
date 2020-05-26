package com.hrd.member.controller;

import java.io.IOException;

import javax.servlet.ServletException;

import com.hrd.common.interfaces.Command;
import com.hrd.common.interfaces.Helper;
import com.hrd.common.model.ActionVO;
import com.hrd.member.helper.InsertUIViewHelper;
import com.hrd.member.helper.ListViewHelper;
import com.hrd.member.helper.ReadViewHelper;
import com.hrd.member.helper.UpdateViewHelper;

public class MemberController implements Command {

	@Override
	public ActionVO execute(ActionVO vo) throws IOException, ServletException{
		Helper viewHelper = null;
		switch (vo.getUrl()) {
		case "insertUI":
			viewHelper = new InsertUIViewHelper();
			break;
		case "list":
			viewHelper = new ListViewHelper();
			break;
			
		case "read":
			viewHelper = new ReadViewHelper();
			break;

		case "update":
			viewHelper = new UpdateViewHelper(); 
			break;
					
		default:
			vo = null;
			break;
		}
		
		return viewHelper.execute(vo);
	}

}
