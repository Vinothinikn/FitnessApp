<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Fitness Data</title>
<style>
td{
border: 1px solid black; 
padding: 8px;
}

</style>
</head>
<body>
<div align = "center">
<h1> Your Fitness Data</h1>
<table>
<tr>
<td>workoutId</td>
<td> ${fitnessdata.workOutId}</td>
</tr>
<tr>
<td>workoutName</td>
<td> ${fitnessdata.workOutName }</td>
</tr>
</table>
</div>
</body>
</html>