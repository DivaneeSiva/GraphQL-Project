package com.example.graphQLproject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DOCTOR")
public class Doctor {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "DOCTOR_ID")
	private int doctorId;
	@Column(name = "DOCTOR_NAME")
	private String doctorName;
	@Column(name = "SPECIALIZATION")
	private String specialization;
	
	
	public Doctor() {
		
		// TODO Auto-generated constructor stub
	}


	public Doctor(String doctorName, String specialization) {
		
		this.doctorName = doctorName;
		this.specialization = specialization;
	}


	public int getdoctorId() {
		return doctorId;
	}


	public void setdoctorId(int doctorId) {
		this.doctorId = doctorId;
	}


	public String getdoctorName() {
		return doctorName;
	}


	public void setdoctorName(String doctorName) {
		this.doctorName = doctorName;
	}


	public String getSpecialization() {
		return specialization;
	}


	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	} 
	
	

}
