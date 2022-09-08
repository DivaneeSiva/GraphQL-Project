package com.example.graphQLproject.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.graphQLproject.model.Doctor;
import com.example.graphQLproject.model.Patient;

@Service
public class DataLoaderService {
	
	@Autowired
	private PatientRepository patRepo;
	
	@Autowired
	private DoctorRepository docRepo;
	
	private List<Patient> pat = new ArrayList<>();
	private List<Doctor> doc = new ArrayList<>();
	
	@PostConstruct
    public void loadData(){
		
		
//        String [] patients = {"abc","xyz","pqr","mno"};
//        HashMap<String,String> doctors =  new HashMap<String, String>(){
//            {
//                put("abc","Dr.ABC");
//                put("xyz","Dr.XYZ");
//                put("pqr","Dr.PQR");
//                put("mno","Dr.MNO");
//            }
//        };
//        for (String patientName :patients){
//            String [] names = patientName.split(" ");
//
//            
//            Doctor doc = new Doctor(doctors.get(patientName), "Cardio");
//            docRepo.save(doc);
//            Patient pat = new Patient(names[0],18,"123456789",doc.getdoctorId());
//            patRepo.save(pat);
		
			
			doc.add(new Doctor("Siva","	Cardio"));
			doc.add(new Doctor("Sugi","General Physician"));
			doc.add(new Doctor("Ardi","	Cardio"));
		
		 	pat.add(new Patient("Josh",22,"1234567",1));
		 	pat.add(new Patient("Abel",52,"Long",2));
		 	pat.add(new Patient("James",22,"Long",3));
		 	
		 	for ( Doctor d : doc)
		 	{
		 		docRepo.save(d);
		 	}
		 	
		 	for(Patient p : pat)
		 	{
		 		patRepo.save(p);
		 	}

        }
        
        


    
	
	

}
