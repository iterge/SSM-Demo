<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="p" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML>
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'list.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
  	<link rel="stylesheet" href="../../layui/css/layui.css" type="text/css"/>
  </head>
  
  <body>
  <h1>${message }</h1>
    user list<br>
    <form action="<%=basePath%>update" method="post">
    	<input type="hidden" name="id" id="id" value="${user.id }">
  		姓名：<input type="text" name="name" id="name" value="${user.name }"><br>
  		密码：<input name="pwd" id="pwd" value="${user.pwd }">
  		<button type="submit">修改</button>
  	</form>
    <br>
    <p>人员列表</p>
    <p:forEach items="${list}" var="u">
    	姓名：<p:out value="${u.name }"></p:out>
    	密码：<p:out value="${u.pwd }"></p:out><br>
    </p:forEach>	
    <!-- 输出List -->  
    <p>书籍列表</p>  
    <p:forEach items="${bookList}" var="node">  
         <p:out value="${node}"></p:out>  
    </p:forEach>  
  <br/>  
  </body>
  <script type="text/javascript">
  	//var s = ${user.name};
  	//alert("s");
  </script>
</html>
