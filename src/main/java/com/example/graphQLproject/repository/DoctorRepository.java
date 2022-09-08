package com.example.graphQLproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.example.graphQLproject.model.Doctor;

@Service
public interface DoctorRepository extends JpaRepository<Doctor,Integer>{

}
