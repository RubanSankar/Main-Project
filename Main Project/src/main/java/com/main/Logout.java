package com.main;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Logout {
//	HttpServletRequest request;
//	HttpSession session;

	@RequestMapping("/logout")
	public String display(	 HttpServletRequest request)
	{

	 
		 HttpSession session=request.getSession(false);  
		 System.out.println(session);
         session.invalidate(); 
		 
		 
		   
		return"index";
	}

}
