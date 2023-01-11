package com.vti.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.vti.entity.enumerate.PositionName;
import com.vti.entity.enumerate.PositionNameConvert;

@Entity
@Table(name = "Position")
public class Position implements Serializable{

	private static final long serialVersionUID = 1L;

	@Column(name = "PositionID")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private short id;
	
	@Column(name = "PositionName", nullable = false, unique = true)
	@Convert(converter =  PositionNameConvert.class)
	private PositionName name;

	public Position() {
	}

	public short getId() {
		return id;
	}

	public void setId(short id) {
		this.id = id;
	}

	public PositionName getName() {
		return name;
	}

	public void setName(PositionName name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Position [id=" + id + ", name=" + name + "]";
	}
	
	
	
	
	
	
	
	
}
