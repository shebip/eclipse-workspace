package in.vamsoft.interservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ValidateUserServlet
 */
@WebServlet("/ValidateUserServlet")
public class ValidateUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname=request.getParameter("uname");
		String pass=request.getParameter("password");
		PrintWriter out=response.getWriter();
		
		if(uname.equals("shebi")&& pass.equals("fs")){
		  
        response.sendRedirect("catalog.html");
    }else {
      out.println("<h1>hello from validate servlet</h1>");
      RequestDispatcher requestDispatcher=request.getRequestDispatcher("ErrorServlet");
      requestDispatcher.forward(request,response);
      
		  
		}
	}

}
