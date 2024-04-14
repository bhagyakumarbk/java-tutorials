package com.spring.learnings.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext a = new ClassPathXmlApplicationContext("beans.xml");
		Student s = a.getBean("student", Student.class);
		s.displayStudentInfo();


	}

}
