package in.vamsoft.servlet.exercise;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.vamsoft.loginexercise.LoginCheck;

/**
 * Servlet implementation class LoginCheckServlet.
 */
@WebServlet("/LoginCheckServlet")
public class LoginCheckServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;

  /**
   * @see HttpServlet#HttpServlet().
   */
  public LoginCheckServlet() {
    super();
    // TODO Auto-generated constructor stub
  }

  /**
   * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
   *      response).
   */
  protected void doPost(HttpServletRequest request, HttpServletResponse response) {
    try {
      response.setContentType("text/html");
      PrintWriter out = response.getWriter();
      String name = request.getParameter("username");
      String password = request.getParameter("password");
      LoginCheck check = new LoginCheck();
      check.validateLogin();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
