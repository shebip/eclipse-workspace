package in.vamsoft.filter2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;

  /**
   * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
   *      response)
   */
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String uname = request.getParameter("uname");
    String pass = request.getParameter("password");
    PrintWriter out = response.getWriter();
    HttpSession session=request.getSession();
    if (uname.equals("shebi") && pass.equals("fs")) {
      
      session.setAttribute("username", uname);
      session.setAttribute("password", pass);
      RequestDispatcher requestDispatcher = request.getRequestDispatcher("Servlet1");
      requestDispatcher.forward(request, response);

      

     
    } else {
      out.println("<h1>hello from validate servlet</h1>");
      RequestDispatcher requestDispatcher = request.getRequestDispatcher("ErrorServlet");
      requestDispatcher.forward(request, response);

    }
  }

}
