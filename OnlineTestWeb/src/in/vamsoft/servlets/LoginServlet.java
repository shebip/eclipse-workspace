package in.vamsoft.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.mbeans.UserMBean;

/**
 * Servlet implementation class LoginServlet
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
    try {
      UserBean user = new UserBean();
      user.setUsername(request.getParameter("username"));
      user.setPassword(request.getParameter("password"));
      user = UserDAO.login(user);
      if (user.isValid()) {
        HttpSession session = request.getSession(true);
        session.setAttribute("currentSessionUser", user);
        response.sendRedirect("userLogged.jsp"); 
      } else
        response.sendRedirect("invalidLogin.jsp");
    } catch (Throwable theException) {
      System.out.println(theException);
    }
  }

}
