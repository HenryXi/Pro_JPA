<%--
  Created by IntelliJ IDEA.
  User: yong
  Date: 2014/9/27
  Time: 23:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>chapter3</title>
</head>
<body>
    <h1>Chapter3 index</h1>
    <a href="<%request.getRequestURI(); %>/HelloServiceServlet01" target="_blank">HelloServiceServlet01</a><br>
    <a href="<%request.getRequestURI(); %>/LoggerServlet" target="_blank">LoggerServlet</a><br>
    <a href="<%request.getRequestURI(); %>/HelloServiceServlet" target="_blank">HelloServiceServlet</a>
</body>
</html>
