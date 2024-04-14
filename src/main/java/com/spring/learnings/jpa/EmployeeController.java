package com.spring.learnings.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeRepositoy empRepo;

	@Autowired
	private OfficeRepository officeRepo;

	@PostMapping(path = "employee/create")
	public void createEmployee(@RequestBody Employee employee) {

		empRepo.save(employee);

	}

	@GetMapping(path = "employee/get")
	public List<Employee> get() {
		return empRepo.findAll();
	}

	@GetMapping(path = "employee/getAll")
	public List<Office> getAll() {
		return officeRepo.findAll();
	}

}
