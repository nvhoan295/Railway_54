package com.vti.entity.enumerate;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter
public class PositionNameConvert implements AttributeConverter<PositionName, String> {

	@Override
	public String convertToDatabaseColumn(PositionName name) {
		if (name == null) {
			return null;
		}
		return name.getValue();
	}

	@Override
	public PositionName convertToEntityAttribute(String value) {
		return PositionName.of(value);
	}

}
