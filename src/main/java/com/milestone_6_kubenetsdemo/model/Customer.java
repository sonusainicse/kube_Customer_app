package com.milestone_6_kubenetsdemo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // This annotation is used for defining it as an Entity
@Table(name="customer")
public class Customer {
	@Id // it define as primary key  // auto generated values for id unique 
	private long id;
	
	@Column(name="name", nullable = false)  // it is used to define it as a column
	private String name;
	
	@Column(name="age")
	private int age;
	
	@Column(name="gender")
	private String gender;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	

}
