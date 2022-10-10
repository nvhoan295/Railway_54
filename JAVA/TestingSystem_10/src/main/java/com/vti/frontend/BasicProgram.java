package com.vti.frontend;

import java.sql.SQLException;

import com.vti.backend.Basic;

public class BasicProgram {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Basic basic = new Basic();
//		basic.question2();
//		basic.createPosition("Sale");
//		basic.updatePositon();
		basic.deletePositionById(7);
		basic.disconnect();
	}
}
