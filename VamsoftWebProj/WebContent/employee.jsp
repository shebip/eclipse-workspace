<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>web</title>
</head>
<body>
	<jsp:useBean id="emp" class="in.vamsoft.bean.Employee" scope="request"></jsp:useBean>
	<%-- Employee Id<jsp:setProperty property="empId" name="emp" param="empId"/> --%>
	<%-- Employee Name<jsp:setProperty property="empName" name="emp" param="empName"/> --%>
	<%-- Employee Salary<jsp:setProperty property="salary" name="emp" param="salary"/> --%>

	<%-- Employee department id<jsp:setProperty property="deptId" name="emp" param="deptId"/> --%>

	<jsp:setProperty property="*" name="emp" />
	<jsp:include page="displaydetails.jsp">
		<jsp:param value="Hai" name="name" />
	</jsp:include>

</body>
</html>