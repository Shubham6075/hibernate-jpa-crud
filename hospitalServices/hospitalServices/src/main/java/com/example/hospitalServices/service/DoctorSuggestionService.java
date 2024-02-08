package com.example.hospitalServices.service;

import com.example.hospitalServices.entities.Doctor;
import com.example.hospitalServices.entities.Patient;
import com.example.hospitalServices.repository.DoctorRepository;
import com.example.hospitalServices.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DoctorSuggestionService {
	@Autowired
	private DoctorRepository doctorRepository;

	@Autowired
	private PatientRepository patientRepository;

	public List<Doctor> suggestDoctors(Long patientId) {
		// Retrieve the patient from the database using the provided patient ID
		Patient patient = patientRepository.findById(patientId)
				.orElseThrow(() -> new RuntimeException("Patient not found with ID: " + patientId));

		// Extract the patient's symptom
		String symptom = patient.getSymptom();

		// Use the patient's city to find all doctors in that location
		String city = patient.getCity();
		List<Doctor> doctorsInCity = doctorRepository.findByCity(city);

		// Filter the doctors based on their speciality matching the patient's symptom
		List<Doctor> suggestedDoctors = doctorsInCity.stream()
				.filter(doctor -> doctor.getSpeciality().equals(getSpecialityForSymptom(symptom)))
				.collect(Collectors.toList());

		return suggestedDoctors;
	}

	private String getSpecialityForSymptom(String symptom) {
		// Define mappings between symptoms and specialities
		// You can expand this mapping based on your requirements
		switch (symptom) {
			case "Arthritis":
			case "Backpain":
			case "Tissue injuries":
				return "Orthopedic";
			case "Dysmenorrhea":
				return "Gynecology";
			case "Skin infection":
			case "Skin burn":
				return "Dermatology";
			case "Ear pain":
				return "ENT specialist";
			default:
				throw new IllegalArgumentException("Unknown symptom: " + symptom);
		}
	}
}
