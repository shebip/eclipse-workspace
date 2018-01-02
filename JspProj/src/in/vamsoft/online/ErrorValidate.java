package in.vamsoft.online;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ErrorValidate
 */
public class ErrorValidate extends HttpServlet {
  private static final long serialVersionUID = 1L;

  /**
   * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
   *      response)
   */
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String uname = request.getParameter("uname");
    PrintWriter out = response.getWriter();
    out.println("<h2 style=\"color: green\">sorry</h2>" + uname
        + "<p1 style=\"font-size: 120%; color: white;\">This is invalid</h1>");
    RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.html");
    requestDispatcher.include(request, response);
  }

}
