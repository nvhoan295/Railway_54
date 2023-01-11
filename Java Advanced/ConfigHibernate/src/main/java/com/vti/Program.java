/**
 * 
 */
package com.vti;

import com.vti.entity.Position;
import com.vti.entity.enumerate.PositionName;
import com.vti.repository.PositionRepository;

/**
 * @author nguyenhoan
 *
 */
public class Program {
	public static void main(String[] args) {
//		DepartmentRepository departmentRepository = new DepartmentRepository();
//		
//		List<Department> departments = departmentRepository.getAllDepartments();
//		System.out.println(departments);
		
		PositionRepository positionRepository = new PositionRepository();
//		List<Position> positions = positionRepository.getAllPositions();
//		System.out.println(positions);
		
		Position position1 = new Position();
		position1.setName(PositionName.DEV);
		positionRepository.createPosition(position1);
		
		
	}
}
