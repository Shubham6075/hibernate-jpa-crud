package com.example.hospitalServices.service;

import com.example.hospitalServices.entities.Patient;

import java.util.List;

public interface PatientService {
	Patient createPatient(Patient patient);

	List<Patient> getAllPatients();

	Patient getPatientById(Long id);

	Patient updatePatient(Long id, Patient patient);

	void deletePatient(Long id);
}
