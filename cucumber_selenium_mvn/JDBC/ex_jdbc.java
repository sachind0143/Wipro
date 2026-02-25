package JDBC;
import java.sql.*;
public class ex_jdbc {
	public static void main(String[] args)
	{
		
	try {
		
	Class.forName("com.mysql.cj.jdbc.Driver"); // is a static method of the Class class used to load a class dynamically at runtime.
		   
	Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/employees_db", "root", "Scry@1403");
	 
	Statement stmt=con.createStatement();
	 
	ResultSet rs=stmt.executeQuery(" select * from employees");
	 
	while (rs.next())
	{
		System.out.println(rs.getInt("Employee_ID") + " " + rs.getString("First_Name"));
	}
	con.close();
	}
		catch (Exception e)
	   {
			System.out.println(e);
	   }
	}
}
