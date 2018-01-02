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
 * Servlet implementation class ForwardServlet
 */
@WebServlet("/ForwardServlet")
public class ForwardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ForwardServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  PrintWriter out=response.getWriter();
	  out.println("<html><body>");
	  out.println("<input type=submit value=Foward>");
	  out.println("</body></html>");
	  RequestDispatcher dispatcher=request.getRequestDispatcher("ToForwardServlet");
	  dispatcher.forward(request, response);
	  out.println("<html><body>");
    out.println("<input type=submit value=Include>");
    out.println("</body></html>");
	  RequestDispatcher dispatcher2=request.getRequestDispatcher("IncludeServlet");
	  dispatcher2.include(request, response);
	}

}
