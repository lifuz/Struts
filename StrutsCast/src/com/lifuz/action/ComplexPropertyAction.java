package com.lifuz.action;

import com.lifuz.model.Department;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class ComplexPropertyAction extends ActionSupport
	implements ModelDriven<Department>{

	private static final long serialVersionUID = -2854321679012519765L;
	
	private Department dept;
	
	@Override
	public String execute() throws Exception {
		System.out.println(dept);
		return SUCCESS;
	}

	@Override
	public Department getModel() {
		dept = new Department();
		return dept;
	}
	
	

}
