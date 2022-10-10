package com.vti.frontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import com.vti.Utils.ScannerUtils;
import com.vti.backend.CallProcedure;

public class CallProcedureProgram {
	public static void main(String[] args)
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException, Exception {
		System.out.println("Nhập Deparment ID: ");
		int id = ScannerUtils.inputInt();
			new CallProcedure().deleteDepartmentUsingCallProcedure(id);
		
		System.out.println("Delete Success");
	}
}
