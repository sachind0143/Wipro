package test.TestNG;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayListHandler;

//import com.sun.jdi.connect.spi.Connection;

public class DBUtils {
public static Object[][] getDBData() throws Exception{
	String url = "jdbc:mysql://localhost:3306/LoginDataDB";
	String user = "root";
	String pass="Scry@1403";
	try(Connection con= DriverManager.getConnection(url,user,pass)){
		QueryRunner runner = new QueryRunner();
		//runner execute the story (create stmt,rs(executeQuery) and the while loop(rs.next())
		List<Object[]>result = runner.query(con, "select username,password from LoginData", new ArrayListHandler());
		return result.toArray(new Object[0][]);
	}
}
}
