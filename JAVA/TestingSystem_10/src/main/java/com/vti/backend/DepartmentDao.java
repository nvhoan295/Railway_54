package com.vti.backend;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import com.vti.Utils.ScannerUtils;

import com.vti.entity.Department;

public class DepartmentDao {
	private Connection connection;
	private Properties properties;

	public DepartmentDao() throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
		properties = new Properties();
		properties.load(new FileInputStream("src/main/source/database.properties"));
		properties.load(new FileInputStream("src/main/source/message.properties"));
	}

	public void connect() throws ClassNotFoundException, SQLException {
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		// Register the drive class with DriveManagar

		Class.forName(properties.getProperty("driver"));
		connection = DriverManager.getConnection(url, username, password);
		System.out.println(properties.getProperty("connect.success"));

	}

//	Question 1: read data – get list departments
//	Tạo method để lấy ra danh sách tất cả các Department
//	Gợi ý:
//	Viết method getDepartments() và return ra
//	List<Department>, Nếu có lỗi sẽ throw Exception lên front-
//	end để in ra
//	Trên front-end sẽ gọi class DepartmentDao và demo method
//	này
	public List<Department> getDepartments() throws ClassNotFoundException, SQLException {
		List<Department> departments = new ArrayList<Department>();
		connect();
		// register a stament object
		Statement statement = connection.createStatement();
		// Step 4: Execute SQL query
		String sql = "Select * from Department";
		ResultSet resultSet = statement.executeQuery(sql);
		// Step 5: Handling Resulte set
		while (resultSet.next()) {
			Department department = new Department();
			department.setId(resultSet.getInt("DepartmentID"));
			department.setName(resultSet.getString("DepartmentName"));
			departments.add(department);
		}

		return departments;
	}

//	Question 2: read data – get department by id
//	Tạo method để lấy ra Department có id = 5
//	Gợi ý: Làm tương tự câu trên
//
//	Nếu không có department nào có id = 5 thì sẽ in ra là
//	"Cannot find department which has id = 5"
//	Nếu có lỗi sẽ throw Exception lên front-end để in ra
//	Trên front-end sẽ gọi class DepartmentDao và demo method
//	này

	public Department getDepartmentById(int id) throws Exception {
		// Register a statement object
		connect();

		String sql = "Select * from Department where DepartmentId = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setInt(1, id);
		// Execute Sql Query
		ResultSet resultSet = preparedStatement.executeQuery();
		if (resultSet.next()) {
			Department department = new Department();
			department.setId(resultSet.getInt("DepartmentID"));
			department.setName(resultSet.getString("DepartmentName"));
			connection.close();
			return department;
		} else {
			connection.close();
			throw new Exception("Cannot find department which has id = " + id);
		}

	}
//	Question 3: Tiếp tục Question 2 (read data – get department by id)
//	Không fix cứng id nữa mà sẽ dùng scanner để yêu cầu người dùng
//	nhập vào id, sau đó trả về thông tin department có id như người dùng
//	nhập vào
//	Gợi ý:
//	Trên backend sẽ viết method getDepartmentById(int id) và
//	return ra Department
//	Nếu tìm thấy department có id = parameter thì sẽ return
//	về department đó
//	Nếu không tìm thấy thì sẽ throw ra với message
//	"Cannot find department which has id = " + id
//	Nếu có lỗi sẽ throw Exception lên front-end để in ra
//	Trên front-end sẽ gọi class DepartmentDao và demo method
//	này

	public Department question3() throws Exception {
		System.out.println("Nhập ID muốn tìm kiếm:");
		int id = ScannerUtils.inputInt();
		Department department = getDepartmentById(id);
		return department;

	}

//	Question 4: check data exists – check department name exists
//	Tạo method để check department name có tồn tại hay không?
//	Gợi ý:
//	Trên backend sẽ viết method
//	isDepartmentNameExists(String name) và return ra boolean
//	Nếu tìm thấy department đã có name = name parameter
//	thì sẽ return true
//	Nếu không tìm thấy thì sẽ return ra false
//	Nếu có lỗi sẽ throw Exception lên front-end để in ra
//	Trên front-end sẽ gọi class DepartmentDao và demo method
//	này
	public boolean checkDepartmentNameExists(String name) throws ClassNotFoundException, SQLException {
		connect();
		// Register a statement object
		String sql = "Select * from Department where DepartmentName = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, name);
		ResultSet resultSet = preparedStatement.executeQuery();
		if (resultSet.next()) {
			connection.close();
			return true;
		} else {
			connection.close();
			return false;
		}

	}

//	Question 5: create data – create department
//	Tạo method để người dùng có thể tạo được department
//	Gợi ý:
//	Trên backend sẽ viết method void createDepartment (String
//	name)
//	Check xem đã có department nào có tên như parameter
//	chưa (sử dụng method ở Question 6 để check)
//	Nếu tìm đã có department có tên như parameter
//	thì throw ra Exception "Department Name is
//	Exists!"
//	Nếu không tìm thấy thì sẽ create department
//	Nếu có lỗi sẽ throw Exception lên front-end để in ra
//	Trên front-end sẽ gọi class DepartmentDao và demo method
//	này (dùng scanner để nhập thông tin của department muốn
//	create)
	public void createDepartment(String name) throws Exception {
		if (checkDepartmentNameExists(name)) {
			throw new Exception("Department Name is Exists!" + name);
		}

		// Get connection
		connect();
		// Create a statement object
		String sql = "Insert into Department (DepartmentName) value (?)";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		// set Parameter
		preparedStatement.setString(1, name);
		// Execute sql query
		preparedStatement.executeUpdate();
		// Disconnect
		connection.close();

	}

//	Question 6: update data – update department
//	Tạo method để người dùng có thể update được department name
//	Gợi ý:
//	Trên backend sẽ viết method void updateDepartmentName
//	(int id, String newName)
//	Check xem đã có department nào có id như id
//	parameter chưa (Viết thêm method như Question 6 để
//	check, tên method là isDepartmentIdExists(int id))
//	Nếu không tìm thấy department có id = id
//	parameter thì sẽ throw ra Exception có message
//	"Cannot find department which has id = " + id
//	Nếu tìm thấy department có id = id parameter thì
//	sẽ check xem tên mới của department có bị
//	trùng không (sử dụng method ở Question 6 để
//	check)
//	Nếu tìm đã có department có tên như parameter
//	thì throw ra Exception "Department Name is
//	Exists!"
//	Nếu không tìm thấy thì sẽ update department
//	Nếu có lỗi sẽ throw Exception lên front-end để in ra
//	Trên front-end sẽ gọi class DepartmentDao và demo method
//	này(dùng scanner để nhập thông tin của department muốn
//	update)

	public boolean isDepartmentByIdExists(int id) throws ClassNotFoundException, SQLException {
		// Connection
		connect();
		// Create a statemtn object
		String sql = "Select * from Department where DepartmentID = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		// Set parameter
		preparedStatement.setInt(1, id);
		// Execute query
		ResultSet resultSet = preparedStatement.executeQuery();
		// Handling result set
		if (resultSet.next()) {
			connection.close();
			return true;
		} else {
			connection.close();
			return false;
		}

	}

	public void updateDepartmentName(int id, String newName) throws ClassNotFoundException, SQLException, Exception {
		// check department id Exists
		if (!isDepartmentByIdExists(id)) {
			throw new Exception("DepartmentID not exists");
		}

		// Get connection
		connect();
		// Create a statement object
		String sql = "Update Department set DepartmentName = ? where DeparmentId = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		// Set paremeter
		preparedStatement.setString(1, newName);
		preparedStatement.setInt(2, id);
		// Step 4: execute Sql query
		preparedStatement.executeUpdate();
		// Step 5: disconnect
		connection.close();

	}

//	Question 7:
//		Tạo method để người dùng có thể xóa được department theo id mà user
//		nhập vào
//		Gợi ý:
//		Trên backend sẽ viết method void deleteDepartment (int id)
//		Check xem đã có department nào có id như id
//		parameter chưa (sử dụng method ở Question 6 để
//		check)
//		Nếu không tìm thấy department có id = id
//		parameter thì sẽ throw ra Exception có message
//		"Cannot find department which has id = " + id
//		Nếu tìm thấy thì sẽ delete department đó
//		Nếu có lỗi sẽ throw Exception lên front-end để in ra
//		Trên front-end sẽ gọi class DepartmentDao và demo method
//		này (dùng scanner để nhập vào id của department muốn delete)

	public void deleteDepartmentByID(int id) throws ClassNotFoundException, SQLException, Exception {
		// Check department Id exists
		if (!isDepartmentByIdExists(id)) {
			throw new Exception("Departmet Id cannot exists");
		}
		// get connection
		connect();
		// Register a statement object
		String sql = "Delete from Department where DepartmentID = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		// Set parameter
		preparedStatement.setInt(1, id);
		// Executer query
		preparedStatement.executeUpdate();
		// disconnection
		connection.close();

	}

}
