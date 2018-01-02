package in.vamsoft.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class GetCookie
 */
public class GetCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie cookies[]= request.getCookies();
		String uname="";
		String color="";
		if(cookies!=null)
		for(Cookie c:cookies) {
		  if(c.getName().equals("uname")) {
		    uname=c.getValue();
		  }
		  if(c.getName().equals("colorCookie")) {
		    color=c.getValue();
		    
		  }
		  
		}
		PrintWriter out=response.getWriter();
		out.println("<html><body bgcolor='"+color+"'><h1>Welcome"+uname+"<h1></body></html>");
		
	}

}
