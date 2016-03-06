package com.lifuz.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 测试表单重复提交
 *
 * @作者： 李富
 * @邮箱：lifuzz@163.com
 * @时间：2016年3月6日
 */
public class TokenAction extends ActionSupport {

	private static final long serialVersionUID = -3876268364212482569L;

	private String user;

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	@Override
	public String execute() throws Exception {
		
		Thread.sleep(2000);
		System.out.println(user);

		return SUCCESS;
	}

}
