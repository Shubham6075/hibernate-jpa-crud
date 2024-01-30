package com.example.spring_boot_hibernate_jpa_crud.controller;

import com.example.spring_boot_hibernate_jpa_crud.entity.Employee;
import com.example.spring_boot_hibernate_jpa_crud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/code")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	// save new employee
	@PostMapping("/save")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
		Employee employeeSaved = employeeService.addEmployee(employee);
		return new ResponseEntity<>(employeeSaved, HttpStatus.CREATED);
	}

	// getAll
	@GetMapping("/all")
	public ResponseEntity<List<Employee>> getAllEmployee(){
		List<Employee> listOfAll = employeeService.getAllEmployees();
		return new ResponseEntity<>(listOfAll, HttpStatus.OK);
	}

	// get by id
	@GetMapping("/emp/{empid}")
	public ResponseEntity<Employee> getEmpById(@PathVariable("empid") Long empidL){
		Employee employee = employeeService.getEmpById(empidL);
		return new ResponseEntity<>(employee, HttpStatus.OK);
	}

	// delete by id
	@DeleteMapping("/delete/{empid}")
	public ResponseEntity<Void> deleteById(@PathVariable("empid") Long empidL){
		 employeeService.deleteById(empidL);
		return new ResponseEntity<>(HttpStatus.ACCEPTED);
	}

	// update by id
	@PutMapping("/update")
	public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee){
		Employee employeeSaved = employeeService.addEmployee(employee);
		return new ResponseEntity<>(employeeSaved, HttpStatus.CREATED);
	}

}
