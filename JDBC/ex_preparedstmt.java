package JDBC;

import java.sql.*;

public class ex_preparedstmt {
public static void main(String[] args) {
	Connection con =null;
	PreparedStatement stmt = null;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employees_db","root","Scry@1403");
		 String sql = "Insert into employees values(?,?,?,?)";
		 stmt = con.prepareStatement(sql);
//		 row6
//		 stmt.setInt(1,6);
//		 stmt.setString(2,"Aadi");
//		 stmt.setString(3, "HR");
//		 stmt.setInt(4, 100000);
//		 stmt.addBatch();

//		 row7
		 stmt.setInt(1,7);
		 stmt.setString(2,"Uday");
		 stmt.setString(3, "IT");
		 stmt.setInt(4, 200000);
		 stmt.addBatch();
		 stmt.executeUpdate();
		 
//		 stmt.executeBatch();
		 con.close();
		
	}catch (Exception e){
		System.out.println(e);
	}
}
}
