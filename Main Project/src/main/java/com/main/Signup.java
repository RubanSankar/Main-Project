package com.main;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller

public class Signup {
	
	@RequestMapping("/Signup")
	public String signup(HttpServletRequest request,HttpServletResponse response,ModelMap model)
	{
		
		UserSignUpBean obj=new UserSignUpBean();
		obj.setFirstname((String)request.getParameter("fname"));
		obj.setLastname((String)request.getParameter("lname"));
		obj.setMailid((String)request.getParameter("mailid"));
		
		obj.setMobilenumber((String)request.getParameter("pnum"));
		obj.setAddress((String)request.getParameter("addr"));
		obj.setPassword((String)request.getParameter("pass"));
		
		SignupHelper help=new SignupHelper();
		if(help.signupcheck(obj))
		{
			HttpSession session=request.getSession();
		    
			session.setAttribute("name", obj.getFirstname()+obj.getLastname());
			return "Home";
		}
		else {
			return "index";
		}
		
		
	}

}
