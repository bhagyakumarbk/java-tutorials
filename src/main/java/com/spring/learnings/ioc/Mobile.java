package com.spring.learnings.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext a = new ClassPathXmlApplicationContext("beans.xml");
		Sim s = a.getBean("sim", Sim.class);
		s.calling();
		s.data();
		
		Airtel airtel = a.getBean("sim", Airtel.class);
		
		airtel.activate();
		
	}

}
