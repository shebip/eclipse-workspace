<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>

	<select name="department_dropdown"> 
		<%@page import="java.sql.*"%>
		<%
		  try {

		    Class.forName("oracle.jdbc.driver.OracleDriver");
		    Connection con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.10.77:1521:xe", "hr", "password");
		    Statement st = con.createStatement();
		    ResultSet rs = st.executeQuery("select department_name from departments");

		    con.close();
		  } catch (Exception e) {
		    e.printStackTrace();
		  }
		%>
	</select>

</body>
</html>
