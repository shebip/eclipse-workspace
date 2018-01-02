package in.vamsoft.geeksmine.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InitExample
 */
//You can configure one or multiple 'URL Patterns' can access this Servlet.
@WebServlet(urlPatterns = { "/annotationExample", "/annExample" }, initParams = {
     @WebInitParam(name = "emailSupport1", value = "abc@example.com"),
     @WebInitParam(name = "emailSupport2", value = "tom@example.com") })
public class InitExample extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InitExample() {
        super();
        // TODO Auto-generated constructor stub
    }

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	  response.setContentType("text/html");
	  PrintWriter out= response.getWriter();
	  ServletConfig config=getServletConfig();
	  String s=config.getInitParameter("InitParam");
	  out.println(s);
	}

}
