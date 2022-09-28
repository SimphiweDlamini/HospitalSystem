package com.demo.gui.view;

import com.demo.gui.model.DiagnosisTableModel;
import com.demo.model.Patient;
import com.demo.repository.PatientRepository;

import javax.swing.*;

public class DiagnosisView extends JFrame {
    private PatientRepository patientRepository;
    private JTable tableDiagnosis;
    private Long patientID;

    public DiagnosisView(Long patientID,PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
        this.patientID=patientID;
        setTitle("Patient Diagnosis");
        setSize(500, 300);
        setLocation(50,160);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        initD();
    }

    private void initD(){
        JMenuBar bar = new JMenuBar();
        Patient patient = patientRepository.fetchPatientById(patientID);
        JMenu menuPatients = new JMenu("Patient: "+ patient.getName()+ " "+patient.getSurname());
        bar.add(menuPatients);
        this.setJMenuBar(bar);

        tableDiagnosis = new JTable();
        DiagnosisTableModel nextTable = new DiagnosisTableModel(patientRepository.findDiagnosisbyID(patientID));
        tableDiagnosis.setModel(nextTable);
        JScrollPane pane = new JScrollPane();
        pane.setBounds(200, 100, 400, 200);
        pane.setViewportView(tableDiagnosis);
        add(pane);
    }

    public JTable getTableDiagnosis() {
        return tableDiagnosis;
    }
}
