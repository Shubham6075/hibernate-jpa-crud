package com.example.spring_boot_hibernate_jpa_crud.service;

import com.example.spring_boot_hibernate_jpa_crud.entity.Employee;

import java.util.List;


public interface EmployeeService {
	Employee addEmployee(Employee employee);

	List<Employee> getAllEmployees();

	Employee getEmpById(Long empidL);

	void deleteById(Long empidL);

}
