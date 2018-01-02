package in.vamsoft.geeksmine.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DispatcherServlet
 */
@WebServlet("/DispatcherServlet")
public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DispatcherServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	  PrintWriter out=response.getWriter();
	  String uname=request.getParameter("username");
	  String pass=request.getParameter("password");
	  if(pass.equals("password")) {
	    RequestDispatcher dispatcher=request.getRequestDispatcher("DispatcherServlet2");
	    dispatcher.forward(request, response);
	  }
	  else {
	    out.println("Sorry username is incorrect");
	    response.sendRedirect("index.html");
	  }
	  
	      

	}

}
