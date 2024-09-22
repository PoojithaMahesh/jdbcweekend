package mavenjdbcwk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ExecuteConcept {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
////		1.Load and Register the Driver
//		Class.forName("com.mysql.cj.jdbc.Driver");
////		Estbalish the Connection
//		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcwk", "root", "root");
////		Create a Statement
//		Statement statement=connection.createStatement();
////		Execute a query
//		boolean value=statement.execute("insert into user values(20,'himesh','hyderabad')");
////		close the connection
//		connection.close();
//		System.out.println(value);
//		RESULT=FALSE
//		System.out.println("Data inserted successfully");
		
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcwk","root","root");
//		Statement statement=connection.createStatement();
//		boolean value=statement.execute("Update user set name='mohan' where id=1");
//		connection.close();
//		System.out.println(value);
//		System.out.println("Data Updated successfully");
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcwk", "root", "root");
		Statement statement=connection.createStatement();
		boolean value=statement.execute("delete from user where id=1");
		connection.close();
		System.out.println(value);
		System.out.println("Data deleted successfully");
		
		
		
		
		
		
		
	}
}
