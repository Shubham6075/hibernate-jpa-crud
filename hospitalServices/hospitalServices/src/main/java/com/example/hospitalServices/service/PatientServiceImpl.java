package com.example.hospitalServices.service;

import com.example.hospitalServices.entities.Patient;
import com.example.hospitalServices.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImpl implements PatientService{

	@Autowired
	private PatientRepository patientRepository;

	@Override
	public Patient createPatient(Patient patient) {
		return patientRepository.save(patient);
	}

	@Override
	public List<Patient> getAllPatients() {
		return patientRepository.findAll();
	}

	@Override
	public Patient getPatientById(Long id) {
		return patientRepository.findById(id).get();
	}

	@Override
	public Patient updatePatient(Long id, Patient patient) {
		Patient existingPatient = getPatientById(id);
		existingPatient.setName(patient.getName());
		existingPatient.setCity(patient.getCity());
		existingPatient.setEmail(patient.getEmail());
		existingPatient.setPhoneNumber(patient.getPhoneNumber());
		existingPatient.setSymptom(patient.getSymptom());
		return patientRepository.save(existingPatient);
	}

	@Override
	public void deletePatient(Long id) {
		patientRepository.deleteById(id);
	}
}
