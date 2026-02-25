package JDBC;
import java.sql.*;

//import com.mysql.cj.jdbc.CallableStatement;
//Callable statement
public class ex_Stored_procedure {
public static void main(String[] args) {
	try {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Wiprodb","root","Scry@1403");
		CallableStatement stmt = con.prepareCall("{call getAllEmployees()}");
		ResultSet rs = stmt.executeQuery();
		
		while (rs.next())
		{
			System.out.println(rs.getInt("id") + " " + rs.getString("name"));
		}
		con.close();
		rs.close();
		stmt.close();
	}catch(Exception e) {
		System.out.println(e);
	}
}
}
