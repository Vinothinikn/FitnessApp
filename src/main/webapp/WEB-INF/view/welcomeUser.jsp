<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome Fitness App</title>
</head>
<body>
<div align= "center">
<h1>Welcome ${username}</h1>	
<form action = "fitness">
<p> Please enter fitness data </p>
<label for = "userId"> UserId:</label>
<input type = "text" value = "${userId}" name = "userId" /><br/><br/>

<label for = "workOutName"> workOutName:</label>
<input type = "text"  name = "workOutName" /><br/><br/>
<label for = "workOutTime"> workOutTime:</label>
<input type = "text"  name = "workOutTime" /><br/><br/>
<label for = "workOutDate"> workOutDate:</label>
<input type = "text"  name = "workOutDate" /><br/><br/>
<input type = "submit" value = "submit"/>

</form>
	
	
	</div>
</body>
</html>