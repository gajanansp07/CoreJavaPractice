

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String un = request.getParameter("uname");
		String up = request.getParameter("upass");
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			out.println("Driver Loaded....");
			//  jdbc:oracle:thin:@localhost:1521/xe
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe","admin","admin"); 
//			pw.println("<h1>Connection Estabilished</h1>");
			out.println("Connection Estabilished.....");
			PreparedStatement ps = con.prepareStatement("Select * from login where uname=?");
			ps.setString(1, un);
			ResultSet x = ps.executeQuery();
			x.next();
			String uname= x.getString(1);
			String upass = x.getString(2);
			if(up.equals(upass)) {
				
				out.println("<h1> User Connected Sucessful....X="+uname+" "+upass);
			}
			else {
				out.println("<br /> Invalide User Name ");
			}
			
//			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe","admin","admin");
		} catch (ClassNotFoundException | SQLException e) {
			out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
