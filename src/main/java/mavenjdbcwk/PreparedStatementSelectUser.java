package mavenjdbcwk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class PreparedStatementSelectUser {
public static void main(String[] args) throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcwk","root","root");
	PreparedStatement preparedStatement=connection.prepareStatement("select * from user where id=?");
	Scanner scanner=new Scanner(System.in);
	System.out.println("please give id to be selected");
	int id=scanner.nextInt();
	preparedStatement.setInt(1, id);
	
	ResultSet resultSet=preparedStatement.executeQuery();
	while(resultSet.next()) {
		System.out.println(resultSet.getInt(1));
		System.out.println(resultSet.getString("name"));
		System.out.println(resultSet.getString("address"));
	}
	
	connection.close();
	System.out.println("data fetched successfully");
	
	
	
	
	
	
	
	
	
	
	
	
}

}
