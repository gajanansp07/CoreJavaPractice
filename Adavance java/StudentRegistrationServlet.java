

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

public class StudentRegistrationServlet extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		String snm =req.getParameter("sname");
		String sps = req.getParameter("spass");
//		String scp = req.getParameter("cpass");
		PrintWriter pw = res.getWriter();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//oracle.jdbc.driver.OracleDriver
			pw.println("<h1>DriverLoaded</h1>");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe","admin","admin");
			pw.println("<h1>Connection Estabished</h1>");
			
			PreparedStatement pstmt = con.prepareStatement("Insert into login values (?,?)");
			pstmt.setString(1,snm);
			pstmt.setString(2, sps);
			int n = pstmt.executeUpdate();
			if(n>0)
				pw.println("Record Inserted");
			else
				pw.println("Error in Insertion");
			
		} catch (Exception e) {
			pw.println("<h1>"+e.getMessage());
			e.printStackTrace();
		}
	}

}
