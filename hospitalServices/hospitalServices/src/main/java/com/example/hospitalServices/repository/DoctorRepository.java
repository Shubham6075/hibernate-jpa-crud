package com.example.hospitalServices.repository;

import com.example.hospitalServices.entities.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DoctorRepository extends JpaRepository<Doctor,Long> {

	List<Doctor> findByCity(String city);

	// no need for implementation classes
}
