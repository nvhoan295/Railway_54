package com.vti.entity.enumerate;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class SalaryNameConvert implements AttributeConverter<SalaryName, String> {

	/*
	 * @see javax.persistence.AttributeConverter#convertToDatabaseColumn(java.lang.
	 * Object)
	 */
	public String convertToDatabaseColumn(SalaryName name) {
		if (name == null) {
			return null;
		}

		return name.getValue();
	}

	/*
	 * @see javax.persistence.AttributeConverter#convertToEntityAttribute(java.lang.
	 * Object)
	 */
	public SalaryName convertToEntityAttribute(String value) {
		return SalaryName.of(value);
	}

}
