package com.vti.entity.exercise3;

public class Car {
	private String name;
	private String type;

	public Car(String name, String type) {
		this.name = name;
		this.type = type;

	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", type=" + type + "]";
	}

	public class Engine {
		private String engineType;

		public Engine(String engineType) {
			this.engineType = engineType;
		}

		public String getEngineType() {
			return engineType;
		}

		public void setEngineType(String engineType) {
			this.engineType = engineType;
		}

		@Override
		public String toString() {
			return "Engine [engineType=" + engineType + "]";
		}

	}

}
