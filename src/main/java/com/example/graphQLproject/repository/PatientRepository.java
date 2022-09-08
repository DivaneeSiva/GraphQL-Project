package com.example.graphQLproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.example.graphQLproject.model.Patient;

@Service
public interface PatientRepository extends JpaRepository<Patient,Integer>{

}
