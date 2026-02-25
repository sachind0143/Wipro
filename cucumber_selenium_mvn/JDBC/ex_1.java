package JDBC;
import java.sql.*;
public class ex_1 {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employees_db","root","Scry@1403");
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from employees");
		
		ResultSetMetaData rsmd = rs.getMetaData();
		int columnCount = rsmd.getColumnCount();
		for(int i =1;i<=columnCount;i++) {
			System.out.print(rsmd.getColumnName(i)+"  |  ");
		}
		System.out.println();
		System.out.println("-----------------------------");
		while(rs.next()) {
			for(int i=1;i<=columnCount;i++) {
				System.out.print(rs.getString(i)+"  \t  ");
			}
			System.out.println();
		}
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
}
}
