package com.employeemanagement.service;

import java.util.List;

import org.springframework.data.domain.Sort.Direction;

import com.employeemanagement.model.Employee;

public interface EmployeeService {

	List<Employee> findAll();

	Employee findById(long employeeId);

	Employee saveEmployee(Employee employee);

	Employee updateEmployee(long id, Employee employee);

	void deleteAll();

	void deletebyId(long id);


	List<Employee> findByFirstName(String firstName);
	

	List<Employee> getEmployeeSortedByFirstName(Direction direction);

	

}