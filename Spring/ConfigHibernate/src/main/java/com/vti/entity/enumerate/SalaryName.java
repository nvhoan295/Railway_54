package com.vti.entity.enumerate;

public enum SalaryName {
	DEV("600"), TEST("700"), ScrumMaster("1500"), PM("2000");

	private String value;

	private SalaryName(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public static SalaryName of(String value) {
		if (value == null) {
			return null;
		}

		for (SalaryName name : SalaryName.values()) {
			if (name.getValue().equals(value)) {
				return name;
			}
		}

		return null;
	}

}
