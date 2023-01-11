package com.vti.entity;

import java.io.Serializable;

import com.vti.entity.enumerate.SalaryName;
import com.vti.entity.enumerate.SalaryNameConvert;

import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Salary", catalog = "TestingSystem")
public class Salary implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "SalaryID")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private short id;

	@Column(name = "SalaryName", nullable = false, unique = true)
	@Convert(converter = SalaryNameConvert.class)
	private SalaryName name;
}
