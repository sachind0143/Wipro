package JDBC;
import java.sql.*;
public class ex_2 {
public static void main(String[] args) {
	Connection con =null;
	Statement stmt = null;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employees_db","root","Scry@1403");
		 stmt = con.createStatement();
//Create Table
//		String createTableSql= "CREATE TABLE EMP_NEW ("
//				+"emp_Id int primary Key,"
//				+"emp_Name varchar(30),"
//				+"emp_Dept varchar(20),"
//				+"emp_Salary INT"+")";
//		 stmt.executeUpdate(createTableSql);
//			System.out.println("Table created successfully");
		 
//Insert Values
//			String insertVal="Insert into emp_new values("
//					+"01,'Sachin','IT',30000),"
//					+"(02,'Yash','IT',25000)";
//			stmt.executeUpdate(insertVal);
//			System.out.println("Values inserted successfully");

//Update Data 
//		 String updateData="update emp_new set emp_Salary=50000 where emp_Id=01";
//		 stmt.executeUpdate(updateData);
//		 System.out.println("Updated Employee Salary Successfully");
		
		 
//delete data
//		 String deleteData="delete from emp_new where emp_Id=02";
//		 stmt.executeUpdate(deleteData);
//		 System.out.println("Succesffuly deleted the row ");
		 
		 
// Drop table ;
//		 String dropTable="drop table emp_nem";
//		stmt.executeUpdate(dropTable);
//		System.out.println("Table droped successfully");

		 
		}
	catch(Exception e) {
		System.out.println(e);
	}
	finally {
		try {
			if(stmt !=null) {
				stmt.close();
			}
			if(con!=null) {
				con.close();
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
}
}
