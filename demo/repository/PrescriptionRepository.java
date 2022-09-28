package com.demo.repository;

import com.demo.model.Prescription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface PrescriptionRepository extends CrudRepository<Prescription,Long> {
    @Query("from Prescription as p where p.prescriptionid = :id ")
    public Prescription fetchPrescriptionByID(@Param("id") Long Id);
}
