package com.lifuz.action;

import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;

import com.lifuz.bean.Employee;
import com.lifuz.dao.Dao;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * employee相关请求处理类
 *
 * @作者： 李富
 * @邮箱：lifuzz@163.com
 * @时间：2016年2月27日
 */
public class EmployeeAction extends ActionSupport implements RequestAware,
		ModelDriven<Employee> {

	private static final long serialVersionUID = 7956061635653409964L;

	private Employee employee;

	private Dao dao = new Dao();

	public String list() {

		request.put("emps", dao.getEmps());
		
		return "list";
	}

	public String delete() {
		dao.delete(employee.getEmpId());

		return SUCCESS;
	}
	
	public String  save() {
		
		dao.add(employee);
		
		return SUCCESS;
	}

	private Map<String, Object> request;

	public Map<String, Object> getRequest() {
		return request;
	}

	@Override
	public void setRequest(Map<String, Object> arg0) {

		this.request = arg0;

	}

	@Override
	public Employee getModel() {

		employee = new Employee();

		return employee;
	}

}
