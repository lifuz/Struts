<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<s:debug></s:debug>
	<s:form action="validation" >
		<s:actionerror/>
		<s:textfield name="age" label="Age"/>
		<s:textfield name="passwd" label="Passwd"/>
		<s:textfield name="passwd2" label="Passwd2"/>
		<s:textfield name="count" label="count"/>
		<s:submit value="提交"/>
	</s:form>
	
	

</body>
</html>