package in.vamsoft.employees;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmployeeManagementServlet
 */
@WebServlet("/EmployeeManagementServlet")
public class EmployeeManagementServlet extends HttpServlet {
  double salary;
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  String Name=request.getParameter("name"); 
	  try{
 
		
		}catch(Exception e) {
		  PrintWriter out=response.getWriter();
      out.println("NAme should not be null");
		}
		String Doj=request.getParameter("doj");
		String Email=request.getParameter("mail");
		LocalDate startDate=LocalDate.parse(Doj,DateTimeFormatter.ofPattern("dd-MM-yyyy"));
	  LocalDate endDate=LocalDate.now();
		long daysInYear=ChronoUnit.DAYS.between(startDate, endDate);
	  try {
		
	    if(daysInYear>=1 && daysInYear<=365) {
	      salary=30000;
	    }
	    else if(daysInYear>=366 && daysInYear<=760) {
	      salary=40000;
	    }
	    else if(daysInYear>=761 && daysInYear<=1000) {
	      salary=60000;
	    }
		
		}catch(Exception e)
		{
		  PrintWriter out=response.getWriter();
		  out.println("Invalid");
		}

		
		
		request.setAttribute("name",Name );
		request.setAttribute("doj",Doj );
		request.setAttribute( "mail",Email);
		request.setAttribute("salary", salary);
		RequestDispatcher rd=request.getRequestDispatcher("PaySlip");
		rd.forward(request, response);
		
	}

}
