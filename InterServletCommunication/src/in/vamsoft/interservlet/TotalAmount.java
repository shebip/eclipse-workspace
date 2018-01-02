package in.vamsoft.interservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TotalAmount
 */
@WebServlet("/TotalAmount")
public class TotalAmount extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
	  
	  ServletContext context = request.getServletContext();
	  context.setAttribute("discount", 10);
    context.setAttribute("tax", 28); 
    int discount=(int)context.getAttribute("discount");
    int tax=(int)context.getAttribute("tax");
    
    int movieRate=(int) request.getAttribute("flim");
    int bookRate=(int)request.getAttribute("study");
    int toyRate=(int)request.getAttribute("play");
    int grossAmount=movieRate+bookRate+toyRate;
    double netAmount=grossAmount-grossAmount*0.1+grossAmount*.28;
    String address1="Chennai";
    
    out.println("Your Ordered Item : "+ request.getParameter("movie")+ "Price : " +movieRate);
    out.println("Your Ordered Item : "+ request.getParameter("book")+ "Price : " +bookRate);
    out.println("Your Ordered Item : "+ request.getParameter("toy")+ "Price : " +toyRate);
    out.println("Gross Amount of The Product : "+grossAmount);
    out.println("Net Amount : "+ netAmount);
    out.println("Delivery address : "+ (String)request.getAttribute("address"));
    out.println("<html><body></a>");

    
  

	}

}
