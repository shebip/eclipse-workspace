package in.vamsoft.online;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CatagoryServlet
 */
public class CatagoryServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;

  /**
   * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
   *      response)
   */
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    HttpSession httpSession = request.getSession();
    String uname = httpSession.getAttribute("username").toString();
    PrintWriter out = response.getWriter();

    Map<String, Integer> movies = new TreeMap<>();
    movies.put("Beauty", 125);
    movies.put("Furious", 150);
    movies.put("Warrior", 150);
    movies.put("Spider", 150);

    Map<String, Integer> books = new TreeMap<>();
    Map<String, Integer> booked = new TreeMap<>();
    books.put("Ulysses", 300);
    books.put("TheOdyssey", 256);
    books.put("WarandPeace", 600);
    books.put("Hamlet", 525);

    Map<String, Integer> toys = new TreeMap<>();
    toys.put("Cleversticks", 700);
    toys.put("Colorforms", 400);
    toys.put("Andean", 540);
    toys.put("Lite-Brite", 752);

    if (uname == null) {
      response.sendRedirect("index.html");
    } else {
      String usename = uname.toString();
      String select[] = request.getParameterValues("movies");
      String select1[] = request.getParameterValues("books");
      String select2[] = request.getParameterValues("toys");
      response.setContentType("text/html");

      for (String com : select) {
        out.println(com);
        if (movies.containsKey(com)) {
          booked.put(com, movies.get(com));

        } else {
          out.println("your selected not in map");
        }
        for (String com1 : select1) {
          out.println(com1);
          if (books.containsKey(com1)) {
            booked.put(com1, books.get(com1));

          } else {
            out.println("your selected not in map");
          }

        }
        for (String com2 : select2) {
          out.println(com2);
          if (toys.containsKey(com2)) {
            booked.put(com2, toys.get(com2));

          } else {
            out.println("your selected not in map");
          }
          httpSession.setAttribute("selected", booked);
          RequestDispatcher dispatcher = request.getRequestDispatcher("BillServlet");
          dispatcher.forward(request, response);
          System.out.println(booked);

        }
      }

    }
  }
}
