package mavenjdbcwk;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class CallableStatementUpdateUser {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcwk", "root", "root");
		CallableStatement callableStatement=connection.prepareCall("call updateUser('poo',700)");
		callableStatement.execute();
		connection.close();
		System.out.println("Data updated successfully with CS");
		
	}
}
