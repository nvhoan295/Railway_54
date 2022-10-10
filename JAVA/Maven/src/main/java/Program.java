import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Program {
	public static void main(String[] args) throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
		Properties properties = new Properties();
		properties.load(new FileInputStream("src/main/resource/database.properties"));
		
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		
		// register the driver classs with DriverManager
		Class.forName(properties.getProperty("driver"));
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
