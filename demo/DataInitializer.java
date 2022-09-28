package com.demo;

//import com.demo.model.*;
//import com.demo.repository.DiagnosisRepository;
//import com.demo.repository.IllnessRepository;
//import com.demo.repository.PatientRepository;
//import com.demo.repository.PrescriptionRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.event.ContextRefreshedEvent;
//import org.springframework.context.event.EventListener;
//import org.springframework.stereotype.Component;
//
//import java.time.LocalDate;
//
//@Component
//@RequiredArgsConstructor
//public class DataInitializer {
//    @Autowired
//    private PatientRepository patientRepository;
//    @Autowired
//    private DiagnosisRepository diagnosisRepository;
//    @Autowired
//    private PrescriptionRepository prescriptionRepository;
//    @Autowired
//    private IllnessRepository illnessRepository;
//
//    Patient p1,p2,p3,p4,p5;
//    Diagnosis d1,d2,d3,d4,d5,d6,d7,d8;
//    Prescription pc1,pc2,pc3,pc4,pc5,pc6,pc7,pc8,pc9,pc10,pc11;
//    Illness i1,i2,i3,i4,i5;
//
//    @EventListener
//    public void atStart(ContextRefreshedEvent ev){
//        p1 = Patient.builder().name("Sam").surname("Smith").
//                dateofBirth(LocalDate.of(1999,7,15)).emergencyNumber(304595032).build();
//        p2 = Patient.builder().name("Bob").surname("Brown").
//                dateofBirth(LocalDate.of(1999,8,31)).emergencyNumber(304984123).build();
//        p3 = Patient.builder().name("Kim").surname("Kiyoshi").
//                dateofBirth(LocalDate.of(2003,2,28)).emergencyNumber(304123456).build();
//        p4 = Patient.builder().name("Patrick").surname("Pawel").
//                dateofBirth(LocalDate.of(2005,11,22)).emergencyNumber(304421455).build();
//        p5 = Patient.builder().name("Honda").surname("Hewitt").
//                dateofBirth(LocalDate.of(1995,5,21)).emergencyNumber(304754723).build();
//
//        i1 = Illness.builder().nameofIllness("Cancer").diseaseType(DiseaseType.Defieciency).build();
//        i2 = Illness.builder().nameofIllness("Headache").diseaseType(DiseaseType.Defieciency).build();
//        i3 = Illness.builder().nameofIllness("Constipation").diseaseType(DiseaseType.Defieciency).build();
//        i4 = Illness.builder().nameofIllness("Diarrhea").diseaseType(DiseaseType.Defieciency).build();
//        i5 = Illness.builder().nameofIllness("Diabetes").diseaseType(DiseaseType.Defieciency).build();
//
//        d1 = Diagnosis.builder().dateOfDiagnosis(LocalDate.now()).description("Stage 2 Cancer").patient(p2).illness(i1).build();
//        d2 = Diagnosis.builder().dateOfDiagnosis(LocalDate.now()).description("Severe Headache").patient(p2).illness(i2).build();
//        d3 = Diagnosis.builder().dateOfDiagnosis(LocalDate.now()).description("Constipation").patient(p2).illness(i3).build();
//        d4 = Diagnosis.builder().dateOfDiagnosis(LocalDate.now()).description("Diarrehea").patient(p1).illness(i4).build();
//        d5 = Diagnosis.builder().dateOfDiagnosis(LocalDate.now()).description("Diabetes").patient(p1).illness(i5).build();
//        d6 = Diagnosis.builder().dateOfDiagnosis(LocalDate.now()).description("Stage 1 Cancer").patient(p3).illness(i3).build();
//        d7 = Diagnosis.builder().dateOfDiagnosis(LocalDate.now()).description("Diarrehea").patient(p4).illness(i4).build();
//        d8 = Diagnosis.builder().dateOfDiagnosis(LocalDate.now()).description("Diabetes").patient(p5).illness(i5).build();
//
//
//        pc1 = Prescription.builder().instructions("Bendustimine, 2 Pills, 3 times a Day").diagnosis(d1).build();
//        pc2 = Prescription.builder().instructions("Bleomycin, 2 Pills, 2 times a Day").diagnosis(d1).build();
//        pc3 = Prescription.builder().instructions("Bexarotene, 1 Pill, 3 times a Day").diagnosis(d1).build();
//        pc4 = Prescription.builder().instructions("Aspirin, 2 Pills, 3 times a Day").diagnosis(d2).build();
//        pc5 = Prescription.builder().instructions("Laxatives, 1 Pill, 2 times a Day").diagnosis(d3).build();
//        pc6 = Prescription.builder().instructions("Loperamide, 1 Pill, 3 times a Day").diagnosis(d4).build();
//        pc7 = Prescription.builder().instructions("Insulin, 2 Pills, 3 times a Day").diagnosis(d5).build();
//        pc8 = Prescription.builder().instructions("Bleomycin, 2 Pills, 2 times a Day").diagnosis(d6).build();
//        pc9 = Prescription.builder().instructions("Bexarotene, 1 Pill, 3 times a Day").diagnosis(d6).build();
//        pc10 = Prescription.builder().instructions("Loperamide, 1 Pill, 3 times a Day").diagnosis(d7).build();
//        pc11 = Prescription.builder().instructions("Insulin, 2 Pills, 3 times a Day").diagnosis(d8).build();
//
//
//
//        patientRepository.save(p1);
//        patientRepository.save(p2);
//        patientRepository.save(p3);
//        patientRepository.save(p4);
//        patientRepository.save(p5);
//
//        illnessRepository.save(i1);
//        illnessRepository.save(i2);
//        illnessRepository.save(i3);
//        illnessRepository.save(i4);
//        illnessRepository.save(i5);
//
//        diagnosisRepository.save(d1);
//        diagnosisRepository.save(d2);
//        diagnosisRepository.save(d3);
//        diagnosisRepository.save(d4);
//        diagnosisRepository.save(d5);
//        diagnosisRepository.save(d6);
//        diagnosisRepository.save(d7);
//        diagnosisRepository.save(d8);
//
//        prescriptionRepository.save(pc1);
//        prescriptionRepository.save(pc2);
//        prescriptionRepository.save(pc3);
//        prescriptionRepository.save(pc4);
//        prescriptionRepository.save(pc5);
//        prescriptionRepository.save(pc6);
//        prescriptionRepository.save(pc7);
//        prescriptionRepository.save(pc8);
//        prescriptionRepository.save(pc9);
//        prescriptionRepository.save(pc10);
//        prescriptionRepository.save(pc11);
//
//    }
//}
