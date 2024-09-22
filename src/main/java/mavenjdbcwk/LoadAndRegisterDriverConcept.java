package mavenjdbcwk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class LoadAndRegisterDriverConcept {
public static void main(String[] args) throws SQLException {
//	1.load and Register the Driver
//	a.Load the Driver:
	Driver driver=new Driver();
//	b.Register the Driver
	DriverManager.registerDriver(driver);
	
//	Estbalish the Connection
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcwk", "root", "root");
//	Create a Statement
	Statement statement=connection.createStatement();
//	Execute a query
	statement.execute("insert into user values(22,'himesh','hyderabad')");
//	close the connection
	connection.close();
	
	System.out.println("Data inserted successfully with Load and Register the Driver explicitily");
}
}
