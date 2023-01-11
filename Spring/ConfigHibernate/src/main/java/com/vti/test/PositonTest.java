package com.vti.test;

import java.util.List;

import com.vti.entity.Position;
import com.vti.repository.PositionRepository;

public class PositonTest {
	public static void main(String[] args) {
		PositionRepository repository = new PositionRepository();
		
		System.out.println("Get All Position");
		List<Position> positions = repository.getAllPositions();
		for (Position position : positions) {
			System.out.println(position);
		}
	}
}
