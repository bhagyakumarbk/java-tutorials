package com.spring.learnings.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepositoy extends JpaRepository<Employee, Integer> {

}
