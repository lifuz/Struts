package com.lifuz.action;

import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;

import com.lifuz.bean.Employee;
import com.lifuz.dao.Dao;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

/**
 * employee相关请求处理类
 *
 * @作者： 李富
 * @邮箱：lifuzz@163.com
 * @时间：2016年2月27日
 */
public class EmployeeAction extends ActionSupport implements RequestAware,
		ModelDriven<Employee>,Preparable {

	private static final long serialVersionUID = 7956061635653409964L;

	private Employee employee;

	private Dao dao = new Dao();

	private Integer empId;

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String list() {

		request.put("emps", dao.getEmps());

		return "list";
	}

	public String delete() {
		dao.delete(empId);

		return SUCCESS;
	}

	public String save() {

		dao.add(employee);

		return SUCCESS;
	}
	
	public void prepareSave() {
		employee = new Employee();
	}

	public String edit() {

		return "edit";
	}
	
	public void prepareEdit() {
		employee = dao.get(empId);
	}
	
	public String update() {
		
		dao.update(employee);
		
		return SUCCESS;
	}
	
	public void prepareUpdate() {
		employee = new Employee();
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

		return employee;
	}

	@Override
	public void prepare() throws Exception {
		
	}

}
