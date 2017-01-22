package auth;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Authorization
 */
@WebServlet("/Authorization")
public class Authorization extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Authorization() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("at "+request.getContextPath());
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String form = 	"<form action=\"autoform\" method=\"post\">" +
							"<input type=\"text\" name=\"login\" placeholder=\"Login\"></br>" +
							"<input type=\"text\" name=\"password\" placeholder=\"Password\">" + 
							"<input type=\"submit\" name=\"submit\" value=\"Login\">" +	
						"</form>";
		response.setContentType("text/html;charset=UTF-8");
		response.getWriter().append(form);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String success = "<h1>Congratulation!</h1>";
		if(valid(request.getParameter("login"), request.getParameter("password"))) {
			response.getWriter().append(success);
		} else {
			response.getWriter().append("<h1>Invalid data</h1>");
			doGet(request, response);
		}
	}
	
	private boolean valid(String log, String pass){
		if(log.equals(login) && pass.equals(password))
			return true;
		return false;
	}
	
	private static final String login = "github";
	private static final String password = "hithere";

}
