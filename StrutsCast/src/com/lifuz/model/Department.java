package com.lifuz.model;

/**
 * 测试复杂属性的类型转换
 *
 * @作者： 李富
 * @邮箱：lifuzz@163.com
 * @时间：2016年2月28日
 */
public class Department {

	private int deptNo;
	private String deptName;

	private Manager mgr;

	public int getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public Manager getMgr() {
		return mgr;
	}

	public void setMgr(Manager mgr) {
		this.mgr = mgr;
	}

	@Override
	public String toString() {
		return "Department [deptNo=" + deptNo + ", deptName=" + deptName
				+ ", mgr=" + mgr + "]";
	}

}
