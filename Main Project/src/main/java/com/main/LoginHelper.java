package com.main;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class LoginHelper {
	HttpSession session;
	HttpServletRequest request;
	public boolean checkuser(UserLogInBean obj)
	{
		if(UserDAO.login(obj))
		{
			
			
			 
			return true;
		}
		else
		{
		return false;
		}
	}

}
