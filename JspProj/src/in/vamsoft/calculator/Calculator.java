package in.vamsoft.calculator;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calculator
 */
@WebServlet("/Calculator")
public class Calculator extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Calculator() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  String n1 = request.getParameter("fnum");
	  int num1 = Integer.parseInt(n1); //Converting String into Integer Variable
	  String n2 = request.getParameter("snum");
	  int num2 = Integer.parseInt(n2); int ans=0;

	  //performing calculation according to the selection made from the Radio Buttons named "calc".
	  if(request.getParameter("calc").equals("Add"))
	  ans = num1+num2;
	  if(request.getParameter("calc").equals("Sub"))
	  ans = num1-num2;
	  if(request.getParameter("calc").equals("Div"))
	  ans = num1/num2;
	  if(request.getParameter("calc").equals("Multi"))
	  ans = num1*num2;

	  //assuming response as the object of the HttpServletResponse Class.
	  //displaying output to the user 
	  response.getWriter().println(ans); 
	}

}
