package com.demo.gui.model;

import com.demo.model.Patient;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class PatientTableModel extends AbstractTableModel {
    private List<Patient> patientList = new ArrayList<>();
    private String[] columnsNames = {
            "Name", "Surname", "Date of Birth","Emergency Number"
    };

    public List<Patient> getPatientList(){
        return this.patientList;
    }

    public PatientTableModel(List<Patient> list){
        this.patientList = list;
    }

    @Override
    public String getColumnName(int columnIndex){
        return columnsNames[columnIndex];
    }

    @Override
    public int getRowCount() {
        return patientList.size();
    }

    @Override
    public int getColumnCount() {
        return columnsNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Patient patient = patientList.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return patient.getName();
            case 1:
                return patient.getSurname();
            case 2:
                return patient.getDateofBirth();
            case 3:
                return patient.getEmergencyNumber();
        }
        return null;
    }

    public long getPatientID(int rowIndex){
        Patient patient = patientList.get(rowIndex);
        return patient.getPatientid();
    }

    public PatientTableModel() {
        super();
    }

    @Override
    public Class<?> getColumnClass(int columnIndex){
        switch (columnIndex){
            case 0:
            case 1:
            case 2:
            case 3:
                return String.class;
        }
        return null;
    }
}
