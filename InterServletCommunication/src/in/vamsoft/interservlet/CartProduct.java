package in.vamsoft.interservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CartProduct
 */
@WebServlet("/CartProduct")
public class CartProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  PrintWriter out=response.getWriter();	  
	  Map<String,Integer> moviMap = new TreeMap<>();
	  moviMap.put("Aashiqui 2", 200);
	  moviMap.put("Piya", 300);
	  moviMap.put("Ok kanmani", 500);
	  moviMap.put("Premam", 600);
	  
//	  String movie= request.getParameter("Movies");
//	  map.get(movie);
//	  out.println(map.get(movie));
	  
Map<String,Integer>bookMap=new TreeMap<>();
bookMap.put("half Girl Friend", 1000);
bookMap.put("2 States", 2000);
bookMap.put("Maha Baratham", 3000);
bookMap.put("Bhavath Geethi", 4000);
//	  String Books=request.getParameter("Books");
//	  map.get(Books);
//	  out.println(map.get(Books));
//	  
	  Map<String,Integer>toysMap= new TreeMap<>();
	  toysMap.put("Kids Laptop", 123);
	  toysMap.put("Talking Tom", 500);
	  toysMap.put("Kids Combo", 600);
	  
//	  String Toys= request.getParameter("Toys");
//	  map.get(Toys);
//	  out.println(map.get(Toys));
	  
	   request.setAttribute("flim", moviMap);
	  request.setAttribute("study", bookMap);
	  request.setAttribute("play", toysMap);
	  
	  
	  
	  RequestDispatcher requestDispatcher = request.getRequestDispatcher("BillingInfo");
    requestDispatcher.forward(request, response);
	}

}