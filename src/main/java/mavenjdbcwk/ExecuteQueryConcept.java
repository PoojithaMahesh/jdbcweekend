package mavenjdbcwk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ExecuteQueryConcept {
public static void main(String[] args) throws Exception {
////	1.Load and Register the Driver
//	Class.forName("com.mysql.cj.jdbc.Driver");
////	Estbalish the Connection
//	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcwk", "root", "root");
////	Create a Statement
//	Statement statement=connection.createStatement();
////	Execute a query
//	statement.executeQuer("insert into user values(2,'himesh','hyderabad')");
////	close the connection
//	connection.close();
//	
//	System.out.println("Data inserted successfully");
	
//	Class.forName("com.mysql.cj.jdbc.Driver");
//	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcwk","root","root");
//	Statement statement=connection.createStatement();
//	statement.executeQuery("Update user set name='mohan' where id=1");
//	connection.close();
//	System.out.println("Data Updated successfully");
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcwk", "root", "root");
	Statement statement=connection.createStatement();
	statement.executeQuery("delete from user where id=1");
	connection.close();
	System.out.println("Data deleted successfully");
	
	
	
	
	
	
	
	
	
	
	
}
}
