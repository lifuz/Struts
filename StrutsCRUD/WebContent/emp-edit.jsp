<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改页面</title>
</head>
<body>

	<s:form action="emp-update">
		<s:hidden name="empId"/>
		<s:textfield name="firstName" label="FirstName" />
		<s:textfield name="lastName" label="LastName" />
		<s:textfield name="email" label="Email" />
		<s:submit value="更新" />
	</s:form>

</body>
</html>