package com.hrd.index.controller;

import java.io.IOException;

import javax.servlet.ServletException;

import com.hrd.common.interfaces.Command;
import com.hrd.common.model.ActionVO;

public class IndexController implements Command {

	public IndexController() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public ActionVO execute(ActionVO vo) throws IOException, ServletException{
		vo.setViewName("index.jsp");
		vo.setSend(true);   
		return vo;
	}

}
