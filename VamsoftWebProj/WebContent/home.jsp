<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.ArrayList" %>
    <%@page import="java.util.List" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<% List<String> names=new ArrayList<String>();
names.add("sudha");
names.add("suba");
pageContext.setAttribute("names", names);

%>
<strong>Employee from request:</strong>${requestScope.employee}<br>
<br>
<strong>Employee without scope:</strong>${employee}
<br>
<br>
<strong>Using[]:</strong>${applicationScope["User.Cookie"]}<br>
<br>
<strong>Printing employee's city:</strong>
${sessionScope.employee1.address.city}
<br>
<br>
<strong>Printing lfirst element of list:</strong>${name[1] }
<br><br>
<strong>Header information:</strong>
${header ["Accept-Encoding"]}
<br><br>
<strong>Accessing Cookie:</strong>${cookie["User.Cookie:"].value}<br><br>
<strong>getting the request method form pageContext:</strong>Http Method is ${pageContext.request.method}<br><br>
<strong>Getting Context param:</strong>${initParam.DummyParam}<br> <br>

<strong>
Getting Request param:
</strong>${param.name}<br><br>

</body>
</html>
