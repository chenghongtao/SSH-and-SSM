package com.cht.struts.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class MyInterceptor implements Interceptor{

	
	private static final long serialVersionUID = 1L;
	private String name;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void destroy() {
         System.out.println("拦截器销毁方法==========");		
	}

	public void init() {
         System.out.println("拦截器初始化方法");		
	}

	public String intercept(ActionInvocation invocation) throws Exception {
		System.out.println("进入"+name+"拦截器-----------");
		invocation.invoke();//执行action或者执行下一个拦截器
		System.out.println(name+"拦截器执行完成==========");
		return null;
	}

}
