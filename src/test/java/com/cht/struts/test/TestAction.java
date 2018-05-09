package com.cht.struts.test;

public class TestAction {
	private String test;

	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}
	public String test() {
		System.out.println(test);
		return "test";
	}

}
