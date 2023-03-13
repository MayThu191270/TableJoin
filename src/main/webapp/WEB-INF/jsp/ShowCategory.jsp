<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="/TableJoin/select" method="post"
		modelAttribute="cate">
		<table>
			<tr>
				<td><form:label path="categoryId">Subscribe Newsletter</form:label></td>
				<c:forEach items="${list}" var="data">
					<td><form:radiobutton path="categoryId"
							value="${data.categoryId}" label="${data.categoryName}" /></td>
				</c:forEach>
			</tr>
			<tr>
				<td><input type="submit" value="Submit"></td>
			</tr>
		</table>
	</form:form>
</body>
</html>