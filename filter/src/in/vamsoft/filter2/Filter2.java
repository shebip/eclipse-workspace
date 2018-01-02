package in.vamsoft.filter2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class Filter2
 */
@WebFilter("/Filter2")
public class Filter2 implements Filter {

    /**
     * Default constructor. 
     */
    public Filter2() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
	  
	  HttpServletRequest request2=(HttpServletRequest) request;
	  HttpSession session=request2.getSession(false);  ;
	  
	  session.getAttribute("username");
	  session.getAttribute("password");
	  
	  PrintWriter out=response.getWriter();  
    out.print("filter is invoked before");  
          
    chain.doFilter(request, response);
          
    out.print("filter is invoked after");  
  }
 

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
