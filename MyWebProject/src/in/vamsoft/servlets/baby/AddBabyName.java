package in.vamsoft.servlets.baby;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddBabyName
 */
@WebServlet("/AddBabyName")
public class AddBabyName extends HttpServlet {
  private static final long serialVersionUID = 1L;

  /**
   * @see HttpServlet#HttpServlet()
   */
  public AddBabyName() {
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
    out.println("<!DOCTYPE html>");
    out.println("<html>");
    out.println("<head>");
    out.println("<title>Add Baby</title>");
    out.println("</head>");
    out.println("<body>");
    request.getRequestDispatcher("navigation.html").include(request, response);
    String s = request.getParameter("babyId");
    int id = Integer.parseInt(s);
    String name = request.getParameter("name");
    String meaning = request.getParameter("meaning");
    String sex = request.getParameter("sex");
    String religion = request.getParameter("religion");
  }

}
