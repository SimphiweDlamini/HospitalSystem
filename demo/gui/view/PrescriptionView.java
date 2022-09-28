package com.demo.gui.view;


import com.demo.gui.model.PrescriptionTableModel;
import com.demo.model.Diagnosis;
import com.demo.repository.DiagnosisRepository;

import javax.swing.*;

public class PrescriptionView extends JFrame{
    private DiagnosisRepository diagnosisRepository;
    private JTable tablePrescription;
    private Long diagnosisID;

    public PrescriptionView(Long diagnosisID,DiagnosisRepository diagnosisRepository) {
        this.diagnosisRepository = diagnosisRepository;
        this.diagnosisID=diagnosisID;
        setTitle("Prescription for Diagnosis");
        setSize(700, 300);
        setLocation(30,200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        initP();
    }

    private void initP(){
        JMenuBar bar = new JMenuBar();
        Diagnosis diagnosis = diagnosisRepository.fetchDiagnosisByID(diagnosisID);
        JMenu menuPatients = new JMenu("Diagnosis: "+ diagnosis.getDescription());
        bar.add(menuPatients);
        this.setJMenuBar(bar);

        tablePrescription = new JTable();
        PrescriptionTableModel nextTable = new PrescriptionTableModel(diagnosisRepository.findPrescriptionByID(diagnosisID));
        tablePrescription.setModel(nextTable);
        JScrollPane pane = new JScrollPane();
        pane.setBounds(200, 100, 400, 200);
        pane.setViewportView(tablePrescription);
        add(pane);
    }

    public JTable getTableDiagnosis() {
        return tablePrescription;
    }
}
