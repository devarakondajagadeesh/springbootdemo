package com.Jagadeesh.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Table;
@Entity
@Table(name="user")
public class Users {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="user_id")
	private int user_id;
	
	@Column(name="name")
	private String name;

	@Column(name="age")
	private int age;
	
	@Column(name="salary")
	private float salary;
	public Users() {
		super();
	}

	public Users(int user_id, String name, int age, float salary) {
		super();
		this.user_id = user_id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUserId(int user_id) {
		this.user_id = user_id;
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

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Users [userId=" + user_id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
	
	
	

}
