package com.lifuz.action;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;
/**
 * 测试类型错误转换的显示，覆盖原先的显示信息
 * 测试自定义类型转换，第一种基于字段的配置中的Action中的字段
 *
 * @作者： 李富
 * @邮箱：lifuzz@163.com
 * @时间：2016年2月28日
 */
public class ConversionAction extends ActionSupport {

	private static final long serialVersionUID = 5326592385459434996L;

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
	public String execute() throws Exception {
		System.out.println("age" + age);
		System.out.println("birth: " + birth);
		return super.execute();
	}

}
