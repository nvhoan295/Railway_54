package com.vti.entity.enumerate;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class PositionNameConvert implements AttributeConverter<PositionName, String> {

	/*
	 * @see javax.persistence.AttributeConverter#convertToDatabaseColumn(java.lang.
	 * Object)
	 */
	public String convertToDatabaseColumn(PositionName name) {
		if (name == null) {
			return null;
		}

		return name.getValue();
	}

	/*
	 * @see javax.persistence.AttributeConverter#convertToEntityAttribute(java.lang.
	 * Object)
	 */
	public PositionName convertToEntityAttribute(String value) {
		return PositionName.of(value);
	}

}
