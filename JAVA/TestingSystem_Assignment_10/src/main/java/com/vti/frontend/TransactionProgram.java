package com.vti.frontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import com.vti.Utils.ScannerUtils;
import com.vti.backend.Transaction;

public class TransactionProgram {
	public static void main(String[] args) throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		question1();
	}
	public static void question1() throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		System.out.println("Input department ID: ");
		int id = ScannerUtils.inputInt();
		new Transaction().deleteDepartmentUsingTransaction(id);
		System.out.println("Delete Success");
	}
}
