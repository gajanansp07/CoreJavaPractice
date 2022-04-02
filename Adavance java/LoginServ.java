

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServ LoginServ
 */
public class LoginServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
//    public LoginServ() {
//        super();
//        // TODO Auto-generated constructor stub
//    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		String name = request.getParameter("uname");
		String pass = request.getParameter("upass");
		
		//pw.println("Name :"+name+"\n Pass :"+pass+"\n");
		PrintWriter pw = response.getWriter();
		
		if(name.equals("admin") && pass.equals("admin")) {
			pw.println("<h1>Welcom Mr. "+ name);
		}
		else {
			pw.println("<h1>Invalid Login Details.");
		
		}
		pw.close();
			
		
	}

}