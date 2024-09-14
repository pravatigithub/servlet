package Demoproject;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class WelcomeServlet
 */
@WebServlet("/hello1")
//, initParams  = {@WebInitParam(name = "name", value = "Pravati")})

public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("Started.....");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse  res) throws ServletException, IOException {
		// Request sent by user through browser
		String name = req.getParameter("name");
		String lastname = req.getParameter("lastname");
		

		//calling getwriter method which will return the value through printwriter
   	//response send back to user (browser)
		
		
		//res.setContentType("html/text");
		
		
		PrintWriter out = res.getWriter();
		out.println("Hello "+  name  + ",  welcome to my project !! ");
		out.println("Hello "+  lastname  + ",  welcome to my project !! ");
		
		out.close();
		
	}
@Override
public void destroy() {
	
	System.out.println("Ended......");
}
}
