package in.vamsoft.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ValidateUserServlet
 */
public class ValidateUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname=request.getParameter("uname");
		String pass=request.getParameter("pwd");
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession();
		if(uname.equals("shebi")&& pass.equals("fs"))
		{
		  session.setAttribute("username", uname);
		  RequestDispatcher requestDispatcher=request.getRequestDispatcher("HomePageSession");
		  //response.sendRedirect("success.html");
		}else
		 {
		  RequestDispatcher requestDispatcher=request.getRequestDispatcher("ErrorValidate");
		  requestDispatcher.forward(request, response);
		}
	}

}
