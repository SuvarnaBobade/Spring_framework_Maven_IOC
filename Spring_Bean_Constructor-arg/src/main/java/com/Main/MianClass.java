package com.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entity.Country;
import com.entity.Student;

public class MianClass {

	public static void main(String[] args) {
		ApplicationContext contex = new ClassPathXmlApplicationContext("springbeans.xml");
		Student s = contex.getBean("stu", Student.class);
		Country c = contex.getBean("cun", Country.class);
		System.out.println(s);
	}

}
