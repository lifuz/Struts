package com.lifuz.action;

import com.opensymphony.xwork2.ActionSupport;

public class ConversionAction extends ActionSupport {

	private static final long serialVersionUID = 5326592385459434996L;

	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String execute() throws Exception {
		System.out.println("age" + age);
		return super.execute();
	}

}
