package com.vti.entity.enumerate;

import jakarta.persistence.AttributeConverter;

public class SalaryNameConvert implements AttributeConverter<SalaryName, String>{

	@Override
	public String convertToDatabaseColumn(SalaryName name) {
		if (name == null) {
			return null;
		}

		return name.getValue();
	}

	@Override
	public SalaryName convertToEntityAttribute(String value) {
		// TODO Auto-generated method stub
		return SalaryName.of(value);
	}

}
