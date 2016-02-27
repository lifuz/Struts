package com.lifuz.dao;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.lifuz.bean.Employee;

/**
 * 表employee的dao类实现类
 *
 * @作者： 李富
 * @邮箱：lifuzz@163.com
 * @时间：2016年2月27日
 */
public class Dao {
	
	private static Map<Integer, Employee> emps = new LinkedHashMap<Integer, Employee>();
	
	static {
		emps.put(1001, new Employee(1001, "AA", "aa", "aa@163.com"));
		emps.put(1002, new Employee(1002, "BB", "bb", "bb@163.com"));
		emps.put(1003, new Employee(1003, "CC", "cc", "cc@163.com"));
		emps.put(1004, new Employee(1004, "DD", "dd", "dd@163.com"));
		emps.put(1005, new Employee(1005, "EE", "ee", "ee@163.com"));
	}
	
	public List<Employee> getEmps() {
		
		return new ArrayList<Employee>(emps.values());
	}
	
	public void delete(Integer empId){
		emps.remove(empId);
	}
	
	public void add(Employee emp) {
		long time = System.currentTimeMillis();
		
		emp.setEmpId((int) time);
		
		emps.put(emp.getEmpId(), emp);
	}
	
	public Employee get(Integer empId) {
		
		return emps.get(empId);
	}
	
	public void update(Employee emp) {
		
		emps.put(emp.getEmpId(), emp);
	}

}
