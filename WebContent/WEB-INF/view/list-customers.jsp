<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="zuzu.constants.Constants"%>
<!DOCTYPE html>
<html>
<head>
<title>Show Customers</title>

<%@ page import="zuzu.constants.Constants"%>
<meta charset="ISO-8859-1">
<link type="test/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/style.css" />
</head>
<body>
	<h1>CRM-Customer Relationship Manager</h1>
	<form:form modelAttribute="<%=Constants.Model.CUSTOMER%>">
		<button type="button" onclick="window.location.href='ShowFormToAdd'">Add
			customer</button>
		<table>
			<tr>
				<th>Sr. No</th>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Email</th>
				<th>Action</th>
			</tr>
			<c:forEach var="theCustomer" items="${customer }">
				<c:url var="updateLink" value="/customer/ShowFormToUpdate">
					<c:param name="id" value="${theCustomer.id}" />
				</c:url>
				<c:url var="deleteLink" value="/customer/delete">
					<c:param name="id" value="${theCustomer.id}" />
				</c:url>
				<tr>
					<td>${theCustomer.id}</td>
					<td>${theCustomer.firstName}</td>
					<td>${theCustomer.lastName}</td>
					<td>${theCustomer.email}</td>
					<td><a href="${updateLink}">Update</a>|<a href="${deleteLink}" 
					onclick="if(!(confirm('Are you sure to delete?'))) return false">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
	</form:form>
</body>
</html>