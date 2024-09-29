package mavenjdbcwk;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class CallableStatementSaveUser {
public static void main(String[] args) throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcwk", "root", "root");
	CallableStatement callableStatement=connection.prepareCall("call insertUser(700,'pooji','bang')");
	callableStatement.execute();
	connection.close();
	System.out.println("Data inserted successfully with CS");
	
}
}
