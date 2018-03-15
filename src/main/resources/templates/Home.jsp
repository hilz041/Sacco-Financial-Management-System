<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home</title>
<style type="text/css">

div{
color:blue;
font-size: 1em;
word-spacing:2mm;
}

table, th , td ,div{
border: 2px solid green;
border-collapse: collapse;
padding: 5px;
}
input {
     font-size: 120%;
     color: #5a5854;
     background-color: #f2f2f2;
     border: 1px solid #bdbdbd;
     border-radius: 5px;
     padding: 5px 5px 5px 30px;
     background-repeat: no-repeat;
     background-position: 8px 9px;
     display: block;
     margin-bottom: 10px;}
	

    
     
     table {
     width:auto;}
th, td {
 text-transform: uppercase;
     letter-spacing: 0.1em;
     font-size: 90%;
     border-bottom: 2px solid #111111;
     border-top: 1px solid #999;
     text-align: left
     padding: 7px 10px 10px 10px;}



</style>


<script type="text/JavaScript">
function Hello(){
alert("Hello, World");
}
</script>
</head>
<body>
<div align="center" >

<table>
<tbody>
<tr>

<td> <form:form action="biodata" method="get"><input type="submit" name="action1" onclick="Hello()" value="Client Bio-Data"/></form:form></td>
<td> <form:form action="loan" method="get"><input type="submit" name="action2" value="Client Loan Info"/></form:form></td>
</tr>

<tr>
<td><form:form action="enterSavings" method="get"><input type="submit" name="action3" value="Savings"></form:form></td>
<td> <form:form action="accounts" method="get"><input type="submit" name="action4" value="Sacco Accounts List"></form:form></td>
</tr>

<tr>
<td><form:form action="biodatalist" method="get"><input type="submit" name="action5" value="MemberShip List"></form:form></td>
<td> <form:form action="savingslist" method="get"><input type="submit" name="action6" value="Savings Information List"></form:form></td>
</tr>


</tbody>
</table>
</div>
</body>

</html>