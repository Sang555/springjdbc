package com.pack.springjdbc.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {
	private int id;
	private String name;
	private int age;
	private double salary;
}
