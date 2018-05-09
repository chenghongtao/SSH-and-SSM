package com.cht.file;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HelloWorld {
   public static void main(String[] args) {
	System.out.println(new SimpleDateFormat("yyyy-mm-dd hh:mm:ss").format(new Date()));
}
}
