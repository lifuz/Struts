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

	<a href="i18n?request_locale=en_US">English</a>
	<a href="i18n?request_locale=zh_CN">中文</a>

	<s:form >
		<s:textfield name="username" key="userName"/>
		<s:password name="password" key="passWord"/>
		<s:submit key="submit"/>
	</s:form>

</body>
</html>