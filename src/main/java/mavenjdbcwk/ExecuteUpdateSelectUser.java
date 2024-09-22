package mavenjdbcwk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ExecuteUpdateSelectUser {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcwk", "root", "root");
		Statement statement=connection.createStatement();
		int results=statement.executeUpdate("select 8 from User where id=20");
		System.out.println(results);
		connection.close();
		System.out.println("Data selected with the help of ExecuteUpdate method");
	}
}

