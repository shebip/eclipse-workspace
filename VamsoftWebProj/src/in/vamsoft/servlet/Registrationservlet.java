package in.vamsoft.servlet;

import java.beans.Statement;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Registrationservlet
 */
public class Registrationservlet extends HttpServlet {
  private static final long serialVersionUID = 1L;

  /**
   * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
   */
  Connection con;
  @Override
  public void init() throws ServletException {
    
    con=DbConnection.getConnection();
    System.out.println("Connection Succeded");
   
  }

  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    PrintWriter out=response.getWriter();
    response.setContentType("text/html");
    String name=request.getParameter("name");
    String dob=request.getParameter("dob");
    String Address=request.getParameter("Address");
    String phoneno=request.getParameter("phoneno");
    String Gender=request.getParameter("Gender");
    String hobbies[]=request.getParameterValues("hobbies");
    String hobby=null;
    for(String hobby1:hobbies)
    {
      hobby +=hobby1;
    }
   Customer e=new Customer();
   e.setCustomerName(name);
   //e.setDob(dob);
   e.setAddress(Address);
   e.setPhoneno(phoneno);;
   e.setGender(Gender);
   e.setHobby(hobby);
   
    
    System.out.println(name);
    System.out.println(dob);
    System.out.println(Address);
    System.out.println(phoneno);
    System.out.println(Gender);
    System.out.println(hobbies);
        
  }

  
}
