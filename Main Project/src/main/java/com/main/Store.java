package com.main;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Store {
	
	@RequestMapping(value = "/store", method = RequestMethod.POST)
	public void store(HttpServletRequest request,HttpServletResponse response)
	{
		

		  ClockBean obj=new ClockBean();
		  obj.setStart(Long.parseLong(String.valueOf(request.getParameter("start"))));
		  obj.setEnd(Long.parseLong(String.valueOf(request.getParameter("end"))));
		  obj.setTotal(Long.parseLong(String.valueOf(request.getParameter("tot"))));
		  obj.setDescriptionText(obj.toText(String.valueOf(request.getParameter("des"))));
		 
		UserDAO.Store(obj);
		
		
		
	
		
	}

}
