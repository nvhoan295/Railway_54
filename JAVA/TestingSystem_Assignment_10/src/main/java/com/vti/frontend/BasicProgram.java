package com.vti.frontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import com.vti.backend.Basic;

public class BasicProgram {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
		Basic basic = new Basic();
		basic.connect();
//		basic.question2();
//		basic.createPosition("Sale");
//		basic.updatePositionName();
		basic.deletePositionById(5);
		basic.closeConnection();
	}
}
