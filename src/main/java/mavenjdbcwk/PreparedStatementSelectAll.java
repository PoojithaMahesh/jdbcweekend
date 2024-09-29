package mavenjdbcwk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PreparedStatementSelectAll {
public static void main(String[] args) throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcwk","root","root");
	PreparedStatement preparedStatement=connection.prepareStatement("Select * from User");
	ResultSet resultSet=preparedStatement.executeQuery();
	
	while(resultSet.next()){
		System.out.println(resultSet.getInt(1));
		System.out.println(resultSet.getString(2));
		System.out.println(resultSet.getString(3));
	}
	connection.close();
	System.out.println("Data fetched successfully");
	
	
	
}
}

