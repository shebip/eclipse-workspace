package in.vamsoft.bean;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



import in.vamsoft.bean.Address;
import in.vamsoft.bean.Employee;

/**
 * Servlet implementation class ELServlet
 */
public class ELServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  Address add=new Address();
    add.setHouseNo("2A");
    add.setCity("Trichy");
    
    Employee e1=new Employee(1,"Shebi",45000,LocalDate.now(),3,add);
    Employee emp=new Employee(2,"Abi",54000,LocalDate.now(),32,add);
    request.setAttribute("employee", e1);
    
    HttpSession session=request.getSession();
    session.setAttribute("employee1", emp);
    
    response.addCookie(new Cookie("User.Cookie","Vamsoft"));
    
    ServletContext context=getServletContext();
    context.setAttribute("User.Cookie", "vamsoft");
    
    RequestDispatcher rd=context.getRequestDispatcher("/home.jsp");
    rd.forward(request, response);
	}

}
