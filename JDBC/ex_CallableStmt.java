package JDBC;
import java.sql.*;

public class ex_CallableStmt {
public static void main(String[] args) {
	Connection con =null;
	CallableStatement stmt = null;
	ResultSet rs=null;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employees_db","root","Scry@1403");
		stmt = con.prepareCall("{call getAllEmployee()}");
		rs = stmt.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt("emp_Id")+"  "+rs.getString("emp_Name"));
		}
		con.close();
		stmt.close();
		rs.close();
	}
	catch(Exception e) {
		System.out.println(e);
	}finally {
		try {
			if(stmt !=null) {
				stmt.close();
			}
			if(con!=null) {
				con.close();
			}
			if(rs!=null) {
				rs.close();
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
}
