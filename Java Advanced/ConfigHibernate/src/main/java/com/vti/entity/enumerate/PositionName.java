/**
 * 
 */
package com.vti.entity.enumerate;

/**
 * @author nguyenhoan
 *
 */
public enum PositionName {
	DEV("Dev"), TEST("Test"), SCRUMMASTER("ScrumMaster"), PM("PM");

	private String value;

	/**
	 * @param string
	 */
	private PositionName(String value) {
		this.value = value;
	}

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	public static PositionName of(String value) {
		if (value == null) {
			return null;
		}
		for (PositionName name : PositionName.values()) {
			if (name.getValue().equals(value)) {
				return name;
			}
		}
		return null;
	}

}
