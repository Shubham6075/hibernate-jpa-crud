package com.example.spring_boot_hibernate_jpa_crud.Repo;

import com.example.spring_boot_hibernate_jpa_crud.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeCrudRepo extends JpaRepository<Employee,Long> {

}
