<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New/Edit Contact</title>
</head>
<body bgcolor="#E6E6FA">
	<div align="center">
		<h1>New/Edit Contact</h1>
		<form:form action="saveContact" method="post" modelAttribute="contact">
			<table>
				<form:hidden path="id" />
				<tr style="padding-top: 5px">
					<td>First Name:</td>
					<td><form:input path="firstname" /></td>
				</tr>
				<tr style="padding-top: 5px">
					<td>Last Name:</td>
					<td><form:input path="lastname" /></td>
				</tr>
				<tr style="padding-top: 5px">
					<td>Email:</td>
					<td><form:input path="email" /></td>
				</tr>
				<tr style="padding-top: 5px">
					<td>Address:</td>
					<td><form:input path="address" /></td>
				</tr>
				<tr style="padding-top: 5px">
					<td>Telephone:</td>
					<td><form:input path="telephone" /></td>
				</tr>
				<tr>
					<td><form:label path="status">Status:</form:label></td>
					<td><form:select path="status">
							<form:option value="None" label="Select" />
							<form:option value="Active">Active</form:option>
							<form:option value="Inactive">Inactive</form:option>
						</form:select></td>
				</tr>
				<tr>
					<td colspan="2" align="right" style="padding-top: 25px"><input
						type="submit" value="Save"></td>
					<td colspan="2" align="left" style="padding-top: 25px"><button
							onclick="goBack()">Go Back</button></td>
				</tr>
			</table>
		</form:form>
	</div>

	<script>
function goBack() {
  window.history.back();
}
</script>
</body>
</html>