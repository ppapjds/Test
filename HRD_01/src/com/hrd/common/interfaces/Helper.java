package com.hrd.common.interfaces;

import java.io.IOException;

import javax.servlet.ServletException;

import com.hrd.common.model.ActionVO;

public interface Helper {
	public abstract ActionVO execute(ActionVO vo)throws ServletException,IOException;
}
