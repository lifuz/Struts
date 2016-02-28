<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>测试复杂属性</title>
</head>
<body>

	<s:form action="complex">
		<s:textfield name="deptName" label="DeptName"/>
		<s:textfield name="mgr.name" label="MgrName"/>
		<s:textfield name="mgr.birth" label="MgrBirth"/>
		<s:submit value="提交"/>
	
	</s:form>

</body>
</html>