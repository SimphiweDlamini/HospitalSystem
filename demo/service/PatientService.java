package com.demo.service;

import com.demo.model.Patient;
import com.demo.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class PatientService implements IPatientService{
    @Autowired
    private final PatientRepository patientRepository;
    @Override
    public List<Patient> getAllPatients(){return patientRepository.fetchPatients();}
    @Override
    public Patient getPatientById(Long id){
        return patientRepository.fetchPatientById(id);
    }
}
