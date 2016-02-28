package com.lifuz.model;

import java.util.Date;

public class Customer {

	private int age;
	private Date birth;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	@Override
	public String toString() {
		return "Customer [age=" + age + ", birth=" + birth + "]";
	}

}
