package mavenjdbcwk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementSaveUser {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcwk","root","root");
//	Create a Statement
	PreparedStatement preparedStatement=connection.prepareStatement("insert into user values(?,?,?)");
	
	Scanner scanner=new Scanner(System.in);
	System.out.println("Welcome to User applivcation");
	
	System.out.println("Please give your id");
	int id=scanner.nextInt();
	
	System.out.println("Please give your name");
	String name=scanner.next();
	
	System.out.println("please give your address");
	String address=scanner.next();
	
	preparedStatement.setInt(1, id);
	preparedStatement.setString(2, name);
	preparedStatement.setString(3, address);
//	execute a query
	preparedStatement.execute();
	
	connection.close();
	System.out.println("Data inserted succcessfully with PS");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
