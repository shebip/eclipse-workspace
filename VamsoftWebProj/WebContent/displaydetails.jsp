<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Web</title>
</head>
<body>
<h1>Welcome<%=request.getParameter("name") %></h1>
<jsp:useBean id="emp" class="in.vamsoft.bean.Employee" scope="request"></jsp:useBean>
<jsp:getProperty property="empId" name="emp"/>
<jsp:getProperty property="empName" name="emp"/>
<jsp:getProperty property="salary" name="emp"/>

<jsp:getProperty property="deptId" name="emp"/>
</body>
</html>
