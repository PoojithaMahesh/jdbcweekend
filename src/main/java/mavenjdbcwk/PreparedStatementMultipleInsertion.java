package mavenjdbcwk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PreparedStatementMultipleInsertion {
public static void main(String[] args) throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcwk","root","root");
	PreparedStatement preparedStatement=connection.prepareStatement("insert into user values(?,?,?)");
	
	Scanner scanner=new Scanner(System.in);
	System.out.println("Please enter how many number of entries you want to save");
	int entries=scanner.nextInt();
	int i=0;
	while(i<entries) {
		
		System.out.println("id");
		int id=scanner.nextInt();
		System.out.println("name");
		String name=scanner.next();
		System.out.println("address");
		String address=scanner.next();

		preparedStatement.setInt(1, id);
		preparedStatement.setString(2, name);
		preparedStatement.setString(3, address);
		preparedStatement.execute();
		i++;
		
	}
	connection.close();
	System.out.println("Multiple Data inserted successfully");
	
	
	
	
	
}
}
