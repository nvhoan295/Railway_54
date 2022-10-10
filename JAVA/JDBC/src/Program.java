import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/TestingSystem";
		String username = "root";
		String password = "supperuser";
		
		// register the driver classs with DriverManager
		Class.forName("com.mysql.cj.jdbc.Driver");
		// Step2: get a Database Connection
		Connection connection = DriverManager.getConnection(url, username, password);
		System.out.println("Connect success!");
		// Step3: Create a statement object
		String sql = "SELECT id, username, email FROM `User`";
		Statement statement = connection.createStatement();
		
		// Step 4: execute query
		
		ResultSet resultSet = statement.executeQuery(sql);
		// Step 5: hangling réult set
		while (resultSet.next()) {
			System.out.println(resultSet.getInt("id"));
			System.out.println(resultSet.getString("username"));
			System.out.println(resultSet.getString("email"));
		}
		
		
		
		
		
		
		
	}
}
