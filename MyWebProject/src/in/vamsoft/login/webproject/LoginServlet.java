package in.vamsoft.login.webproject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 * 
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;

  /**
   * @see HttpServlet#HttpServlet()
   */
  public LoginServlet() {
    super();
    // TODO Auto-generated constructor stub
  }

  /**
   * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
   *      response)
   */
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    String name = request.getParameter("username");
    String password = request.getParameter("password");
    // APPLICATION SCOPE
    ServletContext context=getServletContext();
    context.setAttribute(name, "username");
    Cookie cookie=new Cookie("cname","cookiename" );
    response.addCookie(cookie);
    Cookie ck[]=request.getCookies();
    ck[0].getName();
    // REQUEST SCOPE
    //request.setAttribute(name, "username");
    // SESSION SCOPE
    // HttpSession session=request.getSession();
    // session.setAttribute(name, "username");
    if (name.equals("shebi") && password.equals("fs")) {
      RequestDispatcher dispatcher = request.getRequestDispatcher("Success.jsp");
      dispatcher.forward(request, response);
    } else {
      out.println("Please che");
      response.sendRedirect("MyLogin.jsp");
    }
  }

}
