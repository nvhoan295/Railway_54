package com.vti.Utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class FileManager {
	// Kiểm tra tồn tại
	public static boolean isFileExists(String pathFile) {
		File file = new File(pathFile);
		if (file.exists()) {
			return true;
		} else {
			return false;
		}

	}

// tạo file từ đường dẫn cụ thể
	public static void createNewFile(String pathName) throws Exception {
		File file = new File(pathName);
		try {
			file.exists();
		} catch (Exception e) {
			throw new Exception("File đã tồn tại");
		}

		if (file.createNewFile()) {
			System.out.println("Tạo file thành công");
		} else {
			System.out.println("Tạo thất bại");
		}

	}

	// Tạo file với địa chỉ foder và tên file
	public static void createNewFile(String path, String fileName) throws Exception {
		String pathName = path + "/" + fileName;
		createNewFile(pathName);
	}

	public static void deleteFile(String pathFile) throws Exception {
		File file = new File(pathFile);
		if (!isFileExists(pathFile)) {
			throw new Exception("File Không tồn tại");
		}

		if (file.delete()) {
			System.out.println("Xoá thành công");
		} else {
			System.out.println("Xoá thất bại");
		}

	}

	public static void isFolderOrFile(String path) {
		File file = new File(path);
		if (file.isDirectory()) {
			System.out.println("Đây là Folder");
		} else if (file.isFile()) {
			System.out.println("Đây là file");
		} else {
			System.out.println("Không phải file cũng ko phải Folder");
		}

	}

	public static boolean isFolder(String path) {
		File file = new File(path);
		if (file.isDirectory()) {
			return true;
		} else {
			return false;
		}

	}

	public static List<String> getAllFileName(String path) throws Exception {
		File file = new File(path);
		if (!isFolder(path)) {
			throw new Exception("Đây không phải Folder");
		}

		List<String> strings = new ArrayList<String>();

		for (String list : file.list()) {
			strings.add(list);
		}
		System.out.println(strings);
		return strings;

	}

	// Copy File
	public static void copyFile(String sourceFile, String distinationPath) throws Exception {
		if (!isFileExists(sourceFile)) {
			throw new Exception("File nguồn không tồn tại");
		}
		String[] s = sourceFile.split("/");
		String nameFile = s[s.length - 1];
		distinationPath = distinationPath + "/" + nameFile;
		if (isFileExists(distinationPath)) {
			throw new Exception("File đã tồn tại");
		}

		File source = new File(sourceFile);
		File dist = new File(distinationPath);
		Files.copy(source.toPath(), dist.toPath());

	}

	// Move file

	public static void moveFile(String sourceFile, String destinationPath) throws Exception {
		if (!isFileExists(sourceFile)) {
			throw new Exception();
		}

		File source = new File(sourceFile);
		File dest = new File(destinationPath);
		Files.move(source.toPath(), dest.toPath());

	}

	// Rename

	public static void renameFile(String pathFile, String newName) throws Exception {
		if (!isFileExists(pathFile)) {
			throw new Exception();
		}
		if (isFileExists(newName)) {
			throw new Exception();
		}
		File oldFile = new File(pathFile);
		File newFile = new File(newName);
		oldFile.renameTo(newFile);

	}

	public static void createFolder(String newpathFolder) throws Exception {
		if (isFolder(newpathFolder)) {
			throw new Exception();
		}

		File file = new File(newpathFolder);
		file.mkdir();

	}

	public static void downloadFile(String fileLink, String pathFolder) throws Exception {

		if (!isFolder(pathFolder)) {
			createFolder(pathFolder);
		}

		// get name file
		String s[] = fileLink.split("/");
		String name = s[s.length - 1];

		String pathFile = pathFolder + "/" + name;

		// connect to URL
		URL url = new URL(fileLink);
		URLConnection connection = url.openConnection();

		// get size of file
		int size = connection.getContentLength();

		// read file from internet
		InputStream inputStream = connection.getInputStream();

		// save file
		FileOutputStream output = new FileOutputStream(pathFile);
		int byteDownload = 0;
		byte[] b = new byte[1024];
		// get length
		int length = inputStream.read(b);
		while (length != -1) {

			byteDownload += length;
			System.out.println(byteDownload * 100f / size + "%");

			// write content downloaded from 0 -> length to ouput
			output.write(b, 0, length);
			length = inputStream.read(b);
		}

		// close
		output.close();
		inputStream.close();
		System.out.println("Download success");
	}

}
