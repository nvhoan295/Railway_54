/**
 * 
 */
package com.vti.entity.enumerate;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

/**
 * @author nguyenhoan
 *
 */
@Converter
public class PositionNameConvert implements AttributeConverter<PositionName, String> {

	public String convertToDatabaseColumn(PositionName name) {
		if (name == null) {
			return null;
		}
		return name.getValue();
	}

	public PositionName convertToEntityAttribute(String value) {
		// TODO Auto-generated method stub
		return PositionName.of(value);
	}

}
