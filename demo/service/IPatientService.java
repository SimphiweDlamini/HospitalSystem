package com.demo.service;

import com.demo.model.Patient;

public interface IPatientService {
     public Iterable<Patient> getAllPatients();
     public Patient getPatientById(Long id);

}
