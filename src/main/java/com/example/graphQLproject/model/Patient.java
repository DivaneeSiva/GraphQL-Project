package com.example.graphQLproject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PATIENT")
public class Patient {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "PATIENT_ID")
	private int patientId;
	@Column(name = "PATIENT_NAME")
	private String patientName;
	@Column(name = "PATIENT_AGE")
	private int age;
	@Column(name = "MOBILENO")
	private String mobileNo;
	@Column(name = "DOCTOR_ID")
	private int doctorId;

	public Patient() {
		
		// TODO Auto-generated constructor stub
	}

	public Patient(String patientName, int age, String mobileNo, int doctorId) {
		
		this.patientName = patientName;
		this.age = age;
		this.mobileNo = mobileNo;
		this.doctorId = doctorId;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	
	

}
