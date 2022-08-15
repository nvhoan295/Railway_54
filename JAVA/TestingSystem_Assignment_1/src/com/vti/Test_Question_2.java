package com.vti;
import java.time.LocalDate;

import com.vti.Department;
import com.vti.Position.PositionName;
public class Test_Question_2 {
	public static void main(String[] args) {
		
		Department dep1 = new Department();
		dep1.id = 1;
		dep1.name = "Marketing";
		
		Department dep2 = new Department();
		dep2.id = 2;
		dep2.name = "Sale";
		
		Department dep3 = new Department();
		dep3.id = 3;
		dep3.name = "BOD";
		
		Position pos1 = new Position();
		pos1.id = 1;
		pos1.name = PositionName.Dev;
		
		Position pos2 = new Position();
		pos2.id = 2;
		pos2.name = PositionName.PM;
		
		Position pos3 = new Position();
		pos3.id = 3;
		pos3.name = PositionName.Scrum_Master;
		
		Position pos4 = new Position();
		pos4.id = 4;
		pos4.name = PositionName.Test;
		
		Group group1 = new Group();
		group1.id = 1;
		group1.name = "Testing System";
		
		Group group2 = new Group();
		group2.id = 2;
		group2.name = "Development";
		
		Group group3 = new Group();
		group3.id = 3;
		group3.name = "Sales";
		
		// Tạo Account
		
		Account acc1 = new Account();
		acc1.id = 1;
		acc1.email = "Daong1";
		acc1.userName = "Daong1";
		acc1.fullName = "Dao Nguyen 1";
		acc1.department = dep1;
		acc1.position = pos1;
		acc1.createDate = LocalDate.now();
		Group[] groupAcc1 = {group1, group2};
		acc1.groups = groupAcc1;
		
		
		System.out.println(acc1.fullName);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
