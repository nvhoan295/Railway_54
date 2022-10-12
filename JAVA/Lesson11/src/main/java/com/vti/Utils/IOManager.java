package com.vti.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class IOManager {

	public static String readFile(String filePath) throws Exception {
		if (!FileManager.isFileExists(filePath)) {
			throw new Exception("File không tồn tại");
		}

		FileInputStream fileInputStream = null;
		try {
			fileInputStream = new FileInputStream(filePath);
			byte[] b = new byte[1024];
			int lenght = fileInputStream.read(b);
			String content = "";
			while (lenght > -1) {
				content = new String(b, 0, lenght);
				System.out.println(content);

				lenght = fileInputStream.read(b);
			}
			return content;
		} finally {
			fileInputStream.close();
		}

	}

	public static void writeFile(String pathFile, String content, boolean isContinuing) throws Exception {
		if (!FileManager.isFileExists(pathFile)) {
			throw new Exception("File không tồn tại");
		}

		FileOutputStream fileOutputStream = null;
		try {
			fileOutputStream = new FileOutputStream(pathFile, isContinuing);
			fileOutputStream.write(content.getBytes());

		} finally {
			fileOutputStream.close();
		}

	}

	public static void readObject(String pathFile) throws Exception {

		// Check file exists
		if (!FileManager.isFileExists(pathFile)) {
			throw new Exception("File Không tồn tại");
		}

		// Read File
		FileInputStream fileInputStream = null;
		ObjectInputStream objectInputStream = null;

		try {
			fileInputStream = new FileInputStream(pathFile);
			objectInputStream = new ObjectInputStream(fileInputStream);
			System.out.println(objectInputStream.readObject());
			

		} finally {
			// close file
			fileInputStream.close();
			objectInputStream.close();
		}
	}

	public static void writeObject(Object object, String pathFile) throws Exception {

		// Write file
		FileOutputStream fileOutputStream = null;
		ObjectOutputStream objectOutputStream = null;

		try {
			fileOutputStream = new FileOutputStream(pathFile);
			objectOutputStream = new ObjectOutputStream(fileOutputStream);

			objectOutputStream.writeObject(object);

		} finally {
			// Close file
			fileOutputStream.close();
			objectOutputStream.close();
		}
	}

}
