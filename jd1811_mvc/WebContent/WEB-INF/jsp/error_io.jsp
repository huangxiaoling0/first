<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
error_io.jsp<br>
		<div>${ex }</div>
		<div>${ex.message }</div>
		<div>${requestScope.ex }</div>
		<div>${requestScope.ex.message }</div>
<%-- <% Exception ex = 
(Exception)request.getAttribute("ex"); %> 
		
<H2>Exception: <%= ex.getMessage()%></H2> 
		<P/> 
	<% ex.printStackTrace(
			new java.io.PrintWriter(out)); %>  --%>
</body>
</html>






