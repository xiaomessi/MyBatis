<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'insert.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <form action="<%=basePath%>InsertOneServlet.action">
    	<tr>
    		<td>指令名称：</td>
    		<td><input type="text" name="name" value=""/></td>
    	</tr>
    	<tr>
    		<td>描述：</td>
    		<td><input type="text" name="description" value=""/></td>
    	</tr>
		<h3>段子</h3>
		<br/>
		<tr>
			<td>内容1：</td>
			<td><input type="text" name="content1" value=""/></td>
		</tr>
		<tr>
			<td>内容2：</td>
			<td><input type="text" name="content2" value=""/></td>
		</tr>
		<tr>
			<td colspan="2" align="center"><input type="submit" value="提交"/></td>
		</tr>
    </form>


  </body>
</html>
