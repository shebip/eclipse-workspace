<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
Welcome,${ param.name }</br>
Value in SessionScope ,${ sessionScope.user1 }
</br>Value in Cookie, ${ cookie.user2.value }
</br>Value in Application Scope, ${applicationScope.app }
</br>VAlue in Request Scope, ${requestScope.req }
</body>
</html>