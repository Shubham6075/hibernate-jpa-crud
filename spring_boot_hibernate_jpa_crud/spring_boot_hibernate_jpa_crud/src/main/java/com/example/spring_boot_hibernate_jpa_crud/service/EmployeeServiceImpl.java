package com.example.spring_boot_hibernate_jpa_crud.service;

import com.example.spring_boot_hibernate_jpa_crud.Repo.EmployeeCrudRepo;
import com.example.spring_boot_hibernate_jpa_crud.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeCrudRepo employeeCrudRepo;

	@Override
	public Employee addEmployee(Employee employee) {
		Employee savedEmployee = employeeCrudRepo.save(employee);
		return savedEmployee;
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeCrudRepo.findAll();
	}

	@Override
	public Employee getEmpById(Long empidL) {
		return employeeCrudRepo.findById(empidL).get();
	}

	@Override
	public void deleteById(Long empidL) {
		employeeCrudRepo.deleteById(empidL);
	}

}
