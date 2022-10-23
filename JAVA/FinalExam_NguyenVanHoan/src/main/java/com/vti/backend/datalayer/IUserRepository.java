//
package com.vti.backend.datalayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.entity.User;

public interface IUserRepository {
//	Bạn hãy viết chương trình quản lý các ứng viên với yêu cầu cụ thể như sau.
//	1. Khởi tạo các employee & manager ở database.
//	2. Viết function để user nhập vào id project, sau đó in ra tất cả các employee
//	trong project đó (in ra dạng table)
//	3. Viết function để user có thể lấy ra tất cả Manager của các project (in ra dạng
//	table)
//	4. Viết chức năng login vào manager, User sẽ nhập Email và Password trên giao
//	diện login
//	Chương trình phải kiểm tra được các hợp lệ của các thuộc tính
//	 Email: đúng định dạng email. (VD: nguyen.vannam@vti.com.vn)
//	 Password: nhập từ 6 tới 12 ký tự
	public User getUser(int projectId) throws SQLException, ClassNotFoundException, FileNotFoundException, IOException;

	public List<User> getListUsers() throws ClassNotFoundException, FileNotFoundException, SQLException, IOException;

	public User login(String email, String password)
			throws ClassNotFoundException, FileNotFoundException, SQLException, IOException;

	public List<User> getListUsersByProjectID(int projectId)
			throws ClassNotFoundException, FileNotFoundException, SQLException, IOException;
}
