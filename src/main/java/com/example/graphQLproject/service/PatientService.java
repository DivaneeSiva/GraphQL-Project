package com.example.graphQLproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.graphQLproject.model.Doctor;
import com.example.graphQLproject.model.Patient;
import com.example.graphQLproject.repository.DoctorRepository;
import com.example.graphQLproject.repository.PatientRepository;

@Service
public class PatientService implements GraphQLQueryResolver{
// maps the method name with the schema
// public classes in the class will be registered as a query
	
	@Autowired
	public PatientRepository patRepo;
	
	@Autowired
	public DoctorRepository docRepo;
	
	public List<Patient> getAllPatients()
	{
		return patRepo.findAll();
	}
	
	public Patient getPatientById(Integer patientId){
        return patRepo.findById(patientId).get();
    }
	
	

     public List<Doctor> getAllDoctors(){
        return docRepo.findAll();
     }
	
}
