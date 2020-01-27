package com.main;

public class SignupHelper {
	
	public boolean signupcheck(UserSignUpBean obj)
	{
		if(UserDAO.signup(obj))
		{
			System.out.println(obj.getMailid());
			
			
			 return true;
		
		
		}
		else
		{
			return false;
		}
	}

}
