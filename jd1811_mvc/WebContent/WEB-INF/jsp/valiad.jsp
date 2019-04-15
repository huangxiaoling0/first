<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="sf" 
    uri="http://www.springframework.org/tags/form" %>
    <%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
	%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<base href="<%=basePath %>">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
</head>
<body>
	<!-- 提交数据的入口就是进入页面的
	入口（资源名称+方式）
	modelAttribute表示进入该页面必须在request
	有一个key为
	student的对象
	 -->
	<sf:form method="post" modelAttribute="student">
			<sf:label path="name">用户名:</sf:label> 
			<sf:input path="name"/>
			<sf:errors path="name" cssStyle="color:red"></sf:errors><br>

			<sf:label path="age"> 年   龄:</sf:label>
			<sf:input path="age"/>
			<sf:errors path="age" cssStyle="color:red"></sf:errors><br>

			 <sf:label path="dob"> 生   日:</sf:label>  
			<sf:input path="dob"/>
			<sf:errors path="dob" cssStyle="color:red"></sf:errors><br>
 
			<input type="submit" value="提交"/>
		</sf:form>
</body>
</html>






