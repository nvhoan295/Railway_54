package com.vti.backend;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.vti.Utils.ScannerUltis;
import com.vti.entity.Student;

public class ProcessStudent {
	public static void main(String[] args) {
		
		ProcessStudent pStudent = new ProcessStudent();
		ArrayList<Student> students1;
		ArrayList<Student> students2;
		students1 = pStudent.createStudents();
		pStudent.write(students1);
		
		students2 =  pStudent.read();
		pStudent.show(students2);
	}

	public ArrayList<Student> createStudents() {
		int n;
		System.out.println("Nhập số sinh viên muốn thêm");
		n = ScannerUltis.inputInt();
		ArrayList<Student> students = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			System.out.println("Nhập name: ");
			String name = ScannerUltis.inputString();
			System.out.println("Nhập age: ");
			int age = ScannerUltis.inputInt();
			students.add(new Student(name, age));
		}
		return students;
	}

	public void write(ArrayList<Student> students) {

		try {
			FileOutputStream fileOutputStream = new FileOutputStream("/Users/nguyenhoan/Desktop/Student.ser", true);
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(students);
			objectOutputStream.close();
		} catch (FileNotFoundException e) {
			e.getMessage();
		} catch (IOException e) {
			e.getMessage();
		}

	}

	public ArrayList<Student> read() {
		ArrayList<Student> students = null;

		try {
			FileInputStream fileInputStream = new FileInputStream("/Users/nguyenhoan/Desktop/Student.ser");
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			students = (ArrayList<Student>) objectInputStream.readObject();
			objectInputStream.close();
		} catch (FileNotFoundException e) {
			e.getMessage();
		} catch (ClassNotFoundException e) {
			e.getMessage();
		} catch (IOException e) {
			e.getMessage();
		}
		return students;

	}

	public void show(ArrayList<Student> students) {
		try {
			System.out.println("Arr có số sinh viên là: " + students.size());
			for (int i = 0; i < students.size(); i++) {
				System.out.println("Sinh viên: " + (i + 1));
				System.out.println("Họ tên: " + students.get(i).getName());
				System.out.println("Tuổi: " + students.get(i).getAge());
			}
		} catch (Exception e) {
			e.getMessage();
		}

	}

}
