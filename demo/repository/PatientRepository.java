package com.demo.repository;

import com.demo.model.Diagnosis;
import com.demo.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface PatientRepository extends CrudRepository<Patient,Long> {
    @Query("from Patient p")
    public List<Patient> fetchPatients();
    @Query("from Patient as p where p.patientid = :id")
    public Patient fetchPatientById(@Param("id") Long id);
    @Query("select p.diagnosisSet from Patient as p where p.patientid = :id")
    public List<Diagnosis> findDiagnosisbyID(@Param("id") Long id);
}
