package com.surajInformatics.base.portal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Employee {
	@Id
	//String id;
	String firstName;
	String lastName;
	int age;
	String team;

	public Employee(String firstName, String lastName, int age, String team) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.team = team;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String toString() {
		return "Employee " + firstName + " " + lastName + " aged " + age + " is from team " + team;
	}
}