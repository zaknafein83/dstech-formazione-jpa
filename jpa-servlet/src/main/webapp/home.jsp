<%@page import="it.dstech.jpa.model.Persona"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form method="POST" action="">
		Nome: <input type="text" name="nome" /> Cognome: <input type="text"
			name="cognome" /> <input type="submit" value="Add" />
	</form>

	<hr>
	<ol>
		<c:forEach items="${lista}" var="singolaPersona">
			<li><c:out value="${singolaPersona.getNome() }" /></li>
		</c:forEach>
	</ol>
	<hr>


	<hr>
	<ol>
		<c:forEach items="${names}" var="singolaPersona">
			<li><c:out value="${singolaPersona }" /></li>

			<c:if test="${singolaPersona  == 'Pietro'}">
					Pietro:
					<c:out value="${singolaPersona}" />
			</c:if>
		</c:forEach>
	</ol>
	<hr>


</body>
</html>