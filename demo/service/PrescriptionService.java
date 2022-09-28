package com.demo.service;

import com.demo.model.Prescription;
import com.demo.repository.PrescriptionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class PrescriptionService implements IPrescriptionService{
    @Autowired
    private final PrescriptionRepository prescriptionRepository;
    @Override
    public Prescription getPrescriptionByID(Long id){
        return prescriptionRepository.fetchPrescriptionByID(id);
    }
}
