<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import = "java.util.Date, java.text.SimpleDateFormat" %>
<!DOCTYPE html>
<html>
<head>
<%!
	int count = 1;
	Date now = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("今日の日付: yyyy年MM月dd日");
%>
<meta charset="UTF-8">
<title>JSP KADAI</title>
</head>
<body>
	<h1>訪問回数: <%= count++ %></h1>
	<p><% out.print(sdf.format(now)); %><p>
</body>
</html>