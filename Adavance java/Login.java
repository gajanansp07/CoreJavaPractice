
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse; 
//You are missing java.sql imports:
import java.sql.PreparedStatement;
import java.sql.Statement;


public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String un = request.getParameter("uname");
		String up = request.getParameter("upass");
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
//			String 	url="jdbc:oracle:thin:@localhost:1521:XE";
			pw.println("<h1>Driver Loaded</h1>");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe","admin","admin"); 
			pw.println("<h1>Connection Estabilished</h1>");
			Statement stmt = con.createStatement();
			
			ResultSet rs=stmt.executeQuery("select * from login");  
		
			pw.println("<table border='1'>");
			pw.println("<tr><th>User name</th><th>UserPassword</th></tr>");
			while(rs.next())  
			pw.println("<tr><td>"+rs.getString(1)+"</td><td>"+rs.getString(2)+"</td></tr>");  
			pw.println("</table>");  
			//step5 close the connection object  
			con.close();  
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			pw.println("<h1> Execption : "+ e.getMessage());
			System.out.println("Exception :"+e.getMessage());
			e.printStackTrace();
		}

		pw.print("<h1>User name : " + un + "\nPassword : " + up + "</h1>");

	}

}
