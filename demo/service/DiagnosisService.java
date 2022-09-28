package com.demo.service;

import com.demo.model.Diagnosis;
import com.demo.repository.DiagnosisRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class DiagnosisService implements IDiagnosisService {
    @Autowired
    private final DiagnosisRepository diagnosisRepository;
    @Override
    public List<Diagnosis> getAllDiagnosis(){
        var patients = diagnosisRepository.fetchDiagnosis();
        return patients;
    }
    @Override
    public Diagnosis getDiagnosisByID(Long id){
        return diagnosisRepository.fetchDiagnosisByID(id);
    }
}
