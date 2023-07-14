package com.springcore4;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("testinitializing.xml");
		context.registerShutdownHook();
		Samosa samosa = (Samosa) context.getBean("sAbstract");
		//here is start your second  bean class 
		Pepsi pepsi = (Pepsi) context.getBean("pAbstract");
		System.out.println(samosa);
		System.out.println(pepsi);
	}
}
