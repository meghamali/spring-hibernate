<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="zuzu.constants.Constants"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Form</title>
</head>
<body>

	<form:form action="<%=Constants.Action.ADD_CUSTOMER%>"
		modelAttribute="<%=Constants.Model.CUSTOMER%>" method="POST">
		
		<h1>Save Customer Form</h1>
		<form:hidden path="id"/>

		<table>
			<tbody>
				<tr>
					<td><label>First Name: </label></td>
					<td><form:input path="firstName" type="text"
							placeholder="Enter first name" /></td>
				</tr>

				<tr>
					<td><label>Last Name: </label></td>
					<td><form:input path="lastName" type="text"
							placeholder="Enter last name" /></td>
				</tr>

				<tr>
					<td><label>Email: </label></td>
					<td><form:input path="email" type="email"
							placeholder="Enter email" /></td>
				</tr>
			</tbody>

		</table>
		<div>
			<form:button type="submit">Save</form:button>
		</div>

		<br>

		<a href="list">Home</a>

	</form:form>

</body>
</html>