package com.lifuz.action;

import com.opensymphony.xwork2.ActionSupport;

public class ValidationAction extends ActionSupport {

	private static final long serialVersionUID = -6568054906292806496L;
	
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String execute() throws Exception {
		System.out.println(age);
		return SUCCESS;
	}
	

}
