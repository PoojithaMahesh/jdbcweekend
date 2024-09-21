package mavenjdbcwk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SaveUser {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
//	1.Load and Register the Driver
	Class.forName("com.mysql.cj.jdbc.Driver");
//	Estbalish the Connection
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcwk", "root", "root");
//	Create a Statement
	Statement statement=connection.createStatement();
//	Execute a query
	statement.execute("insert into user values(2,'himesh','hyderabad')");
//	close the connection
	connection.close();
	
	System.out.println("Data inserted successfully");
}
}
