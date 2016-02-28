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
	
	<s:form action="testConversion" theme="simple">
	
		age:<s:textfield name="age" label="Age"/>
		${fieldErrors.age[0] }
		<s:fielderror fieldName="age"/>
		<br><br>
		
		Birth:<s:textfield name="birth"/>
		<s:fielderror fieldName="birth"/>
		
		<br><br>
		<s:submit value="提交"/>
	
	</s:form>
	
	<br><br>
	
	<h5> 测试使用ModelDriven 的方式使用类型转换器 </h5>
	
	<s:form action="testConversion2" theme="simple">
	
		age:<s:textfield name="age" label="Age"/>
		${fieldErrors.age[0] }
		<s:fielderror fieldName="age"/>
		<br><br>
		
		Birth:<s:textfield name="birth"/>
		<s:fielderror fieldName="birth"/>
		
		<br><br>
		<s:submit value="提交"/>
	
	</s:form>
	
	<br><br>
	
	<h5> 基于类型的配置 </h5>
	
	<s:form action="testConversion2" theme="simple">
	
		age:<s:textfield name="age" label="Age"/>
		${fieldErrors.age[0] }
		<s:fielderror fieldName="age"/>
		<br><br>
		
		Birth:<s:textfield name="birth"/>
		<s:fielderror fieldName="birth"/>
		
		<br><br>
		<s:submit value="提交"/>
	
	</s:form>
	
</body>
</html>