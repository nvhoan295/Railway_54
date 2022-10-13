package com.vti.backend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class CallProcedure {
//	Question 1:
//		Tạo method để yêu cầu người dùng nhập vào id của department, sau đó
//		sẽ xóa department đó. (sử dụng store procedure ở trong MySQL)
//		Gợi ý:
//		B1: Tạo 1 store procedure trong MySQL tên là
//		sp_delete_department() có in parameter là id
//		B2: Trên backend sẽ viết method void
//		deleteDepartmentUsingProcedure(int id)
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
	private DepartmentDao departmentDao;
	private Connection connection;

	public CallProcedure() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		departmentDao = new DepartmentDao();
		// check Department Id exists

	}

	public void deleteDepartmentUsingCallProcedure(int id) throws Exception {
		// check department id exists
		if (!departmentDao.isDepartmentByIdExists(id)) {
			throw new Exception("Department ID cannot exists");
		}
		// if department id not exists delete
		// getconnect
		departmentDao.connect();
		// Create a statement object
		String sql = "{call sp_delete_department(?)}";
		CallableStatement callableStatement = connection.prepareCall(sql);
		// set parameter
		callableStatement.setInt(1, id);
		// Execute query
		callableStatement.executeUpdate();
		// disconnect
		connection.close();

	}

}
