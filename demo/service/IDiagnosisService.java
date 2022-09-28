package com.demo.service;

import com.demo.model.Diagnosis;

import java.util.List;

public interface IDiagnosisService {
    public List<Diagnosis> getAllDiagnosis();
    public Diagnosis getDiagnosisByID(Long id);
}
