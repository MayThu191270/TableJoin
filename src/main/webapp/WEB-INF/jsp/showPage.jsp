<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
	tr,th,td{
	border: 1px solid black;
	border-collapse: collapse;
	}
</style>
</head>
<body>
<form:form>
	
	<table>
	<tr>
		<th>No</th>
		<th>Name</th>
		<th>Price</th>
	</tr>
	<% int i = 1; %>
	<c:forEach items="${list}" var="data" >
	<tr>
		<td><% out.print(i++); %></td>
		<td>${data.name}</td>
		<td>${data.price}</td>
	</tr>
	</c:forEach>
	</table>
	
	</form:form>
</body>
</html>