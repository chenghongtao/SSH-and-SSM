package com.cht.struts.action;

public class InterceptorAction {
   public String execute() {
	   System.out.println("进入action//////////////");
	   return "ok";
   }
}
