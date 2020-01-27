package com.main;




import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;


@Controller  

public class Login {  
	HttpSession session;

@RequestMapping(value="/login",method=RequestMethod.POST)  
public /*ModelAndView*/ String display(HttpServletRequest request, HttpServletResponse response,ModelMap model)
{
	
	//System.out.println(user3);
	
	request.getSession(false);  
		if(session!=null)
		{	
		return "Home";
		}
		else
		{
	UserLogInBean obj=new UserLogInBean();
	obj.setUid(request.getParameter("userid"));
	//System.out.println(request.getParameter("userid"));
	obj.setPass(request.getParameter("password"));
	//System.out.println(request.getParameter("password"));
	LoginHelper help=new LoginHelper();
	
	
	if(help.checkuser(obj))
	{
		session=request.getSession();
	    
		session.setAttribute("name", obj.getFirstname()+obj.getLastname());
		return "Home";
	}
	else
	{
		
		
		
		return "index" ;
	}
		}
	
}
   
}  
