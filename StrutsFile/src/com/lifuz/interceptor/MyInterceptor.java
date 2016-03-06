package com.lifuz.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/**
 * 测试自定义拦截器
 *
 * @作者： 李富
 * @邮箱：lifuzz@163.com
 * @时间：2016年3月6日
 */
public class MyInterceptor extends AbstractInterceptor {

	private static final long serialVersionUID = 5881047937209135745L;

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		System.out.println("before");
		
		String result = arg0.invoke();
		
		System.out.println("after");
		
		return result;
	}

}
