<%@page import="com.dao.Employee" %>
<%@page import ="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<%
	List<Employee> list= (List<Employee>) request.getAttribute("employees");
%> 
<table>
<%		for(Employee emp:list){
		
%>
<tr>
<td><%=emp.getEmpId() %></td>
<td><%out.println(emp.getName()); %></td>
<td><%out.println(emp.getSalary()); %></td>
<%} %>
</table>
</body>
</html>