package in.vamsoft.interservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BillingInfo
 */
@WebServlet("/BillingInfo")
public class BillingInfo extends HttpServlet {
  private static final long serialVersionUID = 1L;

  /**
   * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
   */
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
    String movie= request.getParameter("Movies");
    String Books=request.getParameter("Books");
    String Toys= request.getParameter("Toys");
    
    Map<String,Integer> mvi=(Map<String, Integer>) request.getAttribute("flim");
    Map<String,Integer> bok=(Map<String, Integer>) request.getAttribute("study");
    Map<String,Integer> toy=(Map<String, Integer>) request.getAttribute("play");
    
    
    int moviRate =mvi.get(movie);
    int bookRate= bok.get(Books);
    int plygm=toy.get(Toys);
    
    
    request.setAttribute("flim", moviRate);
    request.setAttribute("study", bookRate);
    request.setAttribute("play", plygm);
    
    
    PrintWriter out= response.getWriter();
    response.setContentType("text/html");
    
    /*out.println("<html> <body>");
    out.println("<h3> Movie Name:"+movie+ "price:-" +moviRate+"</h3>" );
    out.println("<h3> Book name:" +Books+ "price:-" +bookRate+ "</h3>" );
    out.println("<h4>Toy Name " + Toys + " Price :-" + plygm + "</h4>");
    out.println("<form action='TotalAmount' method='post'>");
    out.println("<input type='text' name='address'/>");
    out.println("Delivery Location <input type='submit' value='submit'/></form>");
    out.println("</body></html>");*/
      
    RequestDispatcher requestDispatcher= request.getRequestDispatcher("TotalAmount");
    requestDispatcher.include(request, response);
    
    
    
    
    
    
    
  }

}