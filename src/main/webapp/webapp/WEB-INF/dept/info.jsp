<%@page import="webapp.model.Dept"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<hr>
		<h1> 부서 정보 </h1>
	<hr>
	
	<hr>
	
	deptno = ${requestScope.dept.deptno}<br>
	dname = ${requestScope.dept.dname}<br>
	dloc = ${requestScope.dept.loc}<br>
	
	
	
</body>
</html>