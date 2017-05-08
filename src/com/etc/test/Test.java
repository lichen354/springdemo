package com.etc.test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.etc.bean.Car;
import com.etc.bean.Person;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Person p = (Person) ctx.getBean("persion");
		int speed = p.getCar().getSpead();
		
		System.out.println(speed);
		
		Car c = (Car) ctx.getBean("car");
		int speed1 = c.getSpead();
		System.out.println(speed1);
	}
}
