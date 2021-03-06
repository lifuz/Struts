package com.lifuz.action;

import com.lifuz.model.Customer;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * 测试自定义类型转换，第一种基于字段的配置中的ModelDriven中
 * 的字段
 *
 * @作者： 李富
 * @邮箱：lifuzz@163.com
 * @时间：2016年2月28日
 */
public class Conversion2Action extends ActionSupport implements
		ModelDriven<Customer> {

	private static final long serialVersionUID = 5729365387203993085L;
	
	private Customer customer;

	@Override
	public String execute() throws Exception {
		System.out.println(customer);
		return super.execute();
	}

	@Override
	public Customer getModel() {

		customer = new Customer();
		return customer;
	}

}
