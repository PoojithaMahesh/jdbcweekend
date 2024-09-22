package mavenjdbcwk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectUser {
public static void main(String[] args) throws Exception {
//	1.Load and Register the Driver
	Class.forName("com.mysql.cj.jdbc.Driver");
//	Estbalish the Connection
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcwk", "root", "root");
//	Create a Statement
	Statement statement=connection.createStatement();
//	Execute a query
	ResultSet resultSet=statement.executeQuery("Select * from User where id=2");
//	close the connection
	
    while(resultSet.next()) {
    	System.out.println(resultSet.getInt(1));
    	System.out.println(resultSet.getString(2));
    	System.out.println(resultSet.getString(3));
    }
	
    connection.close();
	System.out.println("Data selected successfully");
}
}
