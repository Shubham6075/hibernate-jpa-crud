package com.example.hospitalServices.repository;

import com.example.hospitalServices.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Long> {

	// no need for implementation class for this
}
