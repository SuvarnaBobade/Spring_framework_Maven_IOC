package com.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entity.Register;
import com.entity.Login;

public class MianClass {

	public static void main(String[] args) {
		ApplicationContext contex = new ClassPathXmlApplicationContext("springbeans.xml");
		Login l = contex.getBean("login", Login.class);
		Register r= contex.getBean("reg", Register.class);
		System.out.println(r);
	}

}
