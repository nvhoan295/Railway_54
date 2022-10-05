package com.vti.entity.Exercise3;

public class Staff<K>  extends MyMap<K, String> {

	public Staff(K id, String name) {
		super(id, name);
	}

	public K getId() {
		return getKey();
	}
	public String getName() {
		return super.getValue();
	}
	
	
}
