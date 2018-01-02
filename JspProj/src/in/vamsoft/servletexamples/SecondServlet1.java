package in.vamsoft.servletexamples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

/**
 * Servlet implementation class SecondServlet1
 */
@WebServlet("/SecondServlet1")
public class SecondServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SecondServlet1() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  response.setContentType("text/html");  
    PrintWriter out = response.getWriter();  
      
    HttpSession session=request.getSession(false);  
    String n=(String)session.getAttribute("uname");  
    out.print("Hello "+n);  

    out.close();  
	}

}
