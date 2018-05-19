package com.cht.struts.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class MyInterceptor2 implements Interceptor{
	private static final long serialVersionUID = 1L;
	private String name;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void destroy() {
        System.out.println(name+"拦截器被销毁！！！");		
	}

	public void init() {
      System.out.println(name+"拦截器被初始化");		
	}

	public String intercept(ActionInvocation invocation) throws Exception {
		System.out.println(name+"进入第二个拦截器");
		invocation.invoke();
		System.out.println(name+"拦截器执行完成");
		return null;
	}

}
