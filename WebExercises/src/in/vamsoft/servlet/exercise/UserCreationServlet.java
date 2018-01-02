package in.vamsoft.servlet.exercise;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import in.vamsoft.hash.AeSimpleSHA1;
import in.vamsoft.hash.EncryptPassword;
import in.vamsoft.loginexercise.DatabaseUtils;

/**
 * Servlet implementation class UserCreationServlet.
 */
@WebServlet("/UserCreationServlet")
public class UserCreationServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;

  /**
   * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
   *      response)
   */
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    String fname = request.getParameter("firstname");
    String lname = request.getParameter("lastname");
    String email = request.getParameter("email");
    String password = request.getParameter("password");
    HttpSession session=request.getSession();
    session.setAttribute("user1", fname);

    DatabaseUtils d = new DatabaseUtils();
    String encryptedPassword = EncryptPassword.encrypt(password);
    d.addDetails(fname, lname, email, encryptedPassword);
    out.print("Encrypted Password Saves Successfully");

  }

}
