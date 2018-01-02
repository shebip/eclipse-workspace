package in.vamsoft.Onlineshopping;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CartServlet
 */
public class CartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Map<String,Integer> map=new HashMap<String,Integer>();
		map.put("MyHalfGirlFriend",200);
		map.put("Hamlet", 250);
		map.put("TwoStates", 400);
		map.put("HarryPotter", 300);
		
		request.setAttribute("Books", map);
		
		RequestDispatcher requestDispatcher=request.getRequestDispatcher("BillingInfo");
		requestDispatcher.forward(request,response);
		
		/*String book=request.getParameter("Books");
		map.get(book);
		System.out.println(map.get(book));*/
	}

}
