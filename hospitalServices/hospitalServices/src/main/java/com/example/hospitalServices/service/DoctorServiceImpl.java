package com.example.hospitalServices.service;

import com.example.hospitalServices.entities.Doctor;
import com.example.hospitalServices.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorServiceImpl implements DoctorService{

	@Autowired
	private DoctorRepository doctorRepository;

	@Override
	public Doctor createDoctor(Doctor doctor) {
		return doctorRepository.save(doctor);
	}

	@Override
	public List<Doctor> getAllDoctors() {
		return doctorRepository.findAll();
	}

	@Override
	public Doctor getDoctorById(Long id) {
		return doctorRepository.findById(id).get();
	}

	@Override
	public Doctor updateDoctor(Long id, Doctor doctor) {
		Doctor existingDoctor = getDoctorById(id);
		existingDoctor.setName(doctor.getName());
		existingDoctor.setCity(doctor.getCity());
		existingDoctor.setEmail(doctor.getEmail());
		existingDoctor.setPhoneNumber(doctor.getPhoneNumber());
		existingDoctor.setSpeciality(doctor.getSpeciality());
		return doctorRepository.save(existingDoctor);
	}

	@Override
	public void deleteDoctor(Long id) {
		doctorRepository.deleteById(id);
	}
}
