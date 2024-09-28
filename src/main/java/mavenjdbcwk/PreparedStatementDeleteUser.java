package mavenjdbcwk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PreparedStatementDeleteUser {
public static void main(String[] args) throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcwk","root","root");
	PreparedStatement preparedStatement=connection.prepareStatement("delete from user where id=?");
	Scanner scanner=new Scanner(System.in);
	System.out.println("please give id to be deleted");
	int id=scanner.nextInt();
	preparedStatement.setInt(1, id);
	preparedStatement.execute();
	
	connection.close();
	System.out.println("Data deleted successfully");
}
}
