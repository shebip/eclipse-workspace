<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Jsp scripting to access data</h1></br>
UserId:<%=request.getParameter("userid")%>>
Password:<%=request.getParameter("pswd")%>>

User id is:$(param.userid)

User id is:$(param.pswd)
</body>
</html>