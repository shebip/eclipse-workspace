package in.vamsoft.employees;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Response;

/**
 * Servlet implementation class PaySlip
 */
@WebServlet("/PaySlip")
public class PaySlip extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	  
	  String name=(String) request.getAttribute("name");
		String doj=(String) request.getAttribute("doj");
		String mail=(String) request.getAttribute("mail");
		double salary=(double) request.getAttribute("salary");
		
		
		System.out.println(salary);
		double hra=0.1;
		double bonus=0.1;
		double tax=0.12;
		double newsalary=salary*hra+salary*bonus-salary*tax;
		System.out.println(newsalary);
		double total=salary+newsalary;
		System.out.println(total);
		PrintWriter out= response.getWriter();
		out.println(name);
		out.println(doj);
		out.println(mail);
		out.println(total);
		
		
	}

}
