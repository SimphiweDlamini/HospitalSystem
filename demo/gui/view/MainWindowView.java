package com.demo.gui.view;

import com.demo.gui.model.PatientTableModel;
import com.demo.repository.DiagnosisRepository;
import com.demo.repository.PatientRepository;
import lombok.Data;
import org.springframework.stereotype.Component;

import javax.swing.*;


@Component
@Data
public class MainWindowView extends JFrame {
    private PatientRepository patientRepository;
    private DiagnosisRepository diagnosisRepository;
    private JTable tablePatient;
    private DiagnosisView diagnosisView;
    private PrescriptionView prescriptionView;

    public MainWindowView(PatientRepository patientRepository, DiagnosisRepository diagnosisRepository) {
        this.patientRepository = patientRepository;
        this.diagnosisRepository = diagnosisRepository;
        setTitle("Hospital Application");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
            initMenuBar();
            initPTable();
    }

    private void initPTable() {
        tablePatient = new JTable();
        loadData();
        JScrollPane pane = new JScrollPane();
        pane.setBounds(24,26,352,131);
        pane.setViewportView(tablePatient);
        add(pane);
    }

    private void initMenuBar(){
        JMenuBar bar = new JMenuBar();
        JMenu menuPatients = new JMenu("Patients");
        bar.add(menuPatients);
        this.setJMenuBar(bar);
    }

    private void loadData(){
        PatientTableModel myTable = new PatientTableModel(patientRepository.fetchPatients());
        tablePatient.setModel(myTable);

    }

    public JTable getTablePatient() {
        return tablePatient;
    }

    public DiagnosisView getDiagnosisView() {
        return diagnosisView;
    }

    public PrescriptionView getPrescriptionView() {
        return prescriptionView;
    }

    public void loadDiagnosis(Long patientID){
        diagnosisView = new DiagnosisView(patientID,patientRepository);
        diagnosisView.setVisible(true);
    }

    public void loadPrescription(Long diagnosisID) {
        prescriptionView = new PrescriptionView(diagnosisID,diagnosisRepository);
        prescriptionView.setVisible(true);

    }
}
