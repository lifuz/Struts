<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>数据显示页面</title>
</head>
<body>

	<s:form action="emp-save">
		<s:textfield name="firstName" label="FirstName"/>
		<s:textfield name="lastName" label="LastName"/>
		<s:textfield name="email" label="Email"/>
		<s:submit value="提交"/>	
	</s:form>

	<br><br><br>

	<table cellpadding="10" cellspacing="0" border="1">
		<thead>
			<tr>
				<th>ID</th>
				<th>FirstName</th>
				<th>LastName</th>
				<th>Email</th>
				<th>EDIT</th>
				<th>DELETE</th>				
			</tr>
		</thead>
		
		<tbody>
			<s:iterator value="request.emps">
				<tr>
					<td>${empId }</td>
					<td>${firstName }</td>
					<td>${lastName }</td>
					<td>${email }</td>
					<td><a href="">edit</a></td>
					<td><a href="emp-delete?empId=${empId }">delete</a></td>
				</tr>
			</s:iterator>
		</tbody>
	</table>

</body>
</html>