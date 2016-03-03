package com.lifuz.action;

import com.opensymphony.xwork2.ActionSupport;

public class ValidationAction extends ActionSupport {

	private static final long serialVersionUID = -6568054906292806496L;

	private int age;
	private String passwd;
	private String passwd2;

	private int count;
	private String idCard;

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getPasswd2() {
		return passwd2;
	}

	public void setPasswd2(String passwd2) {
		this.passwd2 = passwd2;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	@Override
	public String execute() throws Exception {
		System.out.println(age);
		return SUCCESS;
	}

}
