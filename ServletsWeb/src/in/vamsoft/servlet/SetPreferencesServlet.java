package in.vamsoft.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SetPreferencesServlet
 */
public class SetPreferencesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("uname");
		String color=request.getParameter("favColor");
		
		Cookie nameCookie=new Cookie("uname",name);
		Cookie colorCookie=new Cookie("colorCookie",color);
		
		response.addCookie(nameCookie);
		response.addCookie(colorCookie);
		response.getWriter().println("<html><body><h2>Hello"+name+"Your preference is set </h2></body></html>");
		
	}

}
