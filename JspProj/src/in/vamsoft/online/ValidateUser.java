package in.vamsoft.online;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ValidateUser
 */
public class ValidateUser extends HttpServlet {
  private static final long serialVersionUID = 1L;

  /**
   * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
   *      response)
   */
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String uname = request.getParameter("uname");
    String pass = request.getParameter("pwd");
    PrintWriter out = response.getWriter();
    HttpSession session = request.getSession();

    if (uname.equals("sudha") && pass.equals("123")) {

      session.setAttribute("username", uname);

      RequestDispatcher requestDispatcher = request.getRequestDispatcher("catalog.html");
      requestDispatcher.forward(request, response);

    } else {

      RequestDispatcher requestDispatcher = request.getRequestDispatcher("ErrorValidate");
      requestDispatcher.forward(request, response);

    }

  }

}
