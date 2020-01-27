
   
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Cache-Control" content="no-store" />
<meta charset="ISO-8859-1">
<title>Login</title>
	
 
	<script src="http://code.jquery.com/jquery-latest.min.js"></script>
   <link rel="stylesheet" href="/css/index.css"/>
   <script src="/jsp/Testindex.js"></script>
</head>
<body>
  <%
    
	
	if(session.getAttribute("name")!=null){
		response.sendRedirect("/jsp/Home.jsp");
	}
%>
 
 
		<div>
	
<form id="userform" action="login"  method="post"onsubmit="test()"> 
	
		Userid : <input type="text" name="userid"id="userid"><br><br>
		Password : <input type="password" name="password"id="password"><br><br>
		<input type="submit" value="Sign in" id="submit" ></input><br><br>
	</form>
		<a href="/jsp/Signup.html"><button>Sign up </button></a>
	</div>
		
	
</body>
</html>