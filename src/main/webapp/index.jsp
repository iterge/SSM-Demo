<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="p" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

  	<link rel="stylesheet" href="layui/css/layui.css" type="text/css"></link>
  	</head>
  
  <body>
  <div id="getUser">
  	<a href="http://localhost:8080/Demo-SSM/getList">查询</a>
  </div>
  <hr>
    <form action="<%=basePath%>insert" method="post">
    	姓名：<input type="text" name="name"/><br>
    	密码：<input type="text" name="pwd"/><br>
    	<button type="submit">提交</button>
    </form>
  <hr>
  <table class="layui-hide" id="test"></table>
  <a id="a1" href="javascript:;">引入layer</a><br/>
  </body>
  <script type="text/javascript" src="layui/jquery-3.3.1.min.js"></script>
  <script type="text/javascript" src="./layui/layui.all.js"></script>
  <script type="text/javascript">
	  layui.use(['laydate', 'laypage', 'layer', 'table', 'carousel', 'upload', 'element'], function(){
		  var laydate = layui.laydate //日期
		  laypage = layui.laypage //分页
		  layer = layui.layer //弹层
		  table = layui.table //表格
		  carousel = layui.carousel //轮播
		  upload = layui.upload //上传
		  element = layui.element; //元素操作
		  
		  //执行一个 table 实例
		  table.render({
		    elem: '#test',
		    height: 471,
		    url: '/Demo-SSM/getList', //数据接口
		    page: { //支持传入 laypage 组件的所有参数（某些参数除外，如：jump/elem） - 详见文档
		      layout: ['limit', 'count', 'prev', 'page', 'next', 'skip'] //自定义分页布局
		      //,curr: 5 //设定初始在第 5 页
		      ,groups: 10 //只显示 1 个连续页码
		      ,first: true //不显示首页
		      ,last: true //不显示尾页
		    }, //开启分页
		    cols: [[ //表头
		      {field: 'id', title: 'ID', width:180, sort: true, fixed: 'left'},
		      {field: 'name', title: '用户名', width:180},
		      {field: 'pwd', title: '密码', width:180, sort: true}
		    ]]
		  });
	  });
  </script>
</html>

