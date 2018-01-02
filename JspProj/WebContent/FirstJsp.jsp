<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
   for(int i=1;i<11;i++)
   {
     out.println(i);
   }

%>
<%!  
    int add(int n1,int n2){
     return n1+n2;
   }
%>
<%= "The addition is"+add(5,6) %>
<%int num=10;
if(num==10)%>

</body>
</html>