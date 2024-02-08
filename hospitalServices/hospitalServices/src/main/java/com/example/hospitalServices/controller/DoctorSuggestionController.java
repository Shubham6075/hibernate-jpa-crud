package com.example.hospitalServices.controller;

import com.example.hospitalServices.entities.Doctor;
import com.example.hospitalServices.service.DoctorSuggestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/doctors")
public class DoctorSuggestionController {
	@Autowired
	private DoctorSuggestionService doctorSuggestionService;

	@GetMapping("/suggest/{patientId}")
	public List<Doctor> suggestDoctors(@PathVariable Long patientId) {
		return doctorSuggestionService.suggestDoctors(patientId);
	}
}
