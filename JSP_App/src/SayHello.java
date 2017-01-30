import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

public class SayHello extends HttpServlet { 
  protected void doPost(HttpServletRequest request, 
      HttpServletResponse response) throws ServletException, IOException 
  {
    // reading the user input
	  String lang = request.getParameter("lang");
	  Language say = new Language();
	  String result = say.translate(lang); 
    
    request.setAttribute("styles", result);
    RequestDispatcher view = request.getRequestDispatcher("hello.jsp");
    view.forward(request, response); 
  }  
}