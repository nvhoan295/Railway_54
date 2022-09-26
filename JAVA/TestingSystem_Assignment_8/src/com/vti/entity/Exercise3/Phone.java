package com.vti.entity.Exercise3;

public class Phone<K, V> extends MyMap<K, V> {
	private K name;
	private V sdt;

	public Phone(K key, V value) {
		super(key, value);
	}

}
