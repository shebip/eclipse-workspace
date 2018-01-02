package in.vamsoft.servletexamples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



/**
 * Servlet implementation class FirstServlet1
 */
@WebServlet("/FirstServlet1")
public class FirstServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	  PrintWriter out = response.getWriter();  
    
    String n=request.getParameter("uname");  
    out.print("Welcome "+n);  
      
    HttpSession session=request.getSession();  
    session.setAttribute("uname",n);  

    RequestDispatcher dispatcher=request.getRequestDispatcher("SecondServlet1");
    dispatcher.forward(request, response);
  
    out.close();  
	  
	}

}
