package com.demo.repository;

import com.demo.model.Diagnosis;
import com.demo.model.Prescription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

public interface DiagnosisRepository extends CrudRepository<Diagnosis,Long> {
    @Query("from Diagnosis as d where d.diagnosisid = :id")
    public Diagnosis fetchDiagnosisByID(@Param("id")Long id);
    @Query("from Diagnosis as d")
    public List<Diagnosis> fetchDiagnosis();
    @Query("select d.prescriptionSet from Diagnosis as d where d.diagnosisid = :id")
    public List<Prescription> findPrescriptionByID(@Param("id")Long id);

}
