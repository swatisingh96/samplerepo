<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="e" class="com.pojos.Employee" scope="application"></jsp:useBean>
<jsp:setProperty property="*" name="e"/>
<table>
<c:forEach var="e"  items="e">
<tr>
	<td><c:out value="${e.name }">Name</c:out></td>
	<td><c:out value="${e.empId }">ID</c:out></td>
	<td><c:out value="${e.salary }">Salary</c:out></td>
	
</tr>
</c:forEach>
 
NAME:${e.name}
ID:${e.empId}
SALARY:${e.salary}



</body>
</html>