package com.spring.learnings.ioc;

import org.springframework.beans.factory.annotation.Autowired;

public class Airtel implements Sim {

	private Service service;

	/**
	 * @return the service
	 */

	public Service getService() {
		return service;
	}

	/**
	 * @param service the service to set
	 */

	public void setService(Service service) {
		this.service = service;
	}

	@Autowired
	public Airtel(Service service) {
		super();
		this.service = service;
	}

	public Airtel() {
		System.out.println("Airtel Constructor");
	}

	@Override
	public void calling() {
		// TODO Auto-generated method stub
		System.out.println("Calling via Airtel");

	}

	@Override
	public void data() {
		// TODO Auto-generated method stub
		System.out.println("Using Internet via Airtel");
	}

	public void activate() {
		service.service();
	}
}
