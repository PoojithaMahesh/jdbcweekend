package mavenjdbcwk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PreparedStatementUpdateUser {
public static void main(String[] args) throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcwk","root","root");
	PreparedStatement preparedStatement=connection.prepareStatement("update user set name=? where id=?");
	System.out.println("please give id to be updated");
	Scanner scanner=new Scanner(System.in);   
	int id=scanner.nextInt();
	System.out.println("Please give name");
	String name=scanner.next();
	
	preparedStatement.setString(1, name);
	preparedStatement.setInt(2, id);
	
	preparedStatement.execute();
	connection.close();
	System.out.println("Data updated successfully");
	
}
}
