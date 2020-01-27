

function test()
{
	var uid=document.getElementById("userid").value;
	var pass=document.getElementById("password").value;
	var atpos = uid.indexOf("@");
    var dotpos = uid.lastIndexOf(".");
    
    if(uid==="" || uid===null || atpos < 1 || ( dotpos - atpos < 2))
	  {
		 alert("Please enter correct valid ID");
		 return false;
	  }
    else if(pass==="")
    	{
    	alert("passcode cannot be null");
    	return false;
    	
    	}
   /* else
    	{
    
    	
    	 $.ajax
         (
         {
        	 type:'POST',
             url:'login',
             
             data: { user3:uid,pass3:pass},
             contentType:'applicatio/json',
             dataType:'json',
               
         }
     );
    	}*/
    			
    			
 }



