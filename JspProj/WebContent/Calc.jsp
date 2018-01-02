<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="Calculator" method="post">
   <input type="text" name="fnum"/>
   <br/>
   <input type="text" name="snum"/>
   <br/>
   Select Operation
   <br/>
   <input type="radio" name="calc" value="Add"/>Add
   <input type="radio" name="calc" value="Sub"/>Subtract
   <input type="radio" name="calc" value="Div"/>Divide
   <input type="radio" name="calc" value="Multi"/>Multiply
   <br/>
   <input type="submit" value="Calculate" name="submit"/>
</form>

</body>
</html>