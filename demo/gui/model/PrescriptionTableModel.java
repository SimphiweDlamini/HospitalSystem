package com.demo.gui.model;

import com.demo.model.Prescription;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class PrescriptionTableModel extends AbstractTableModel {
    private List<Prescription> prescriptionsList = new ArrayList<>();
    private String[] columnsNames = {
            "Prescription Instructions"
    };

    public List<Prescription> getPrescriptionsList(){
        return this.prescriptionsList;
    }

    public PrescriptionTableModel(List<Prescription> list){
        this.prescriptionsList = list;
    }

    @Override
    public String getColumnName(int columnIndex){
        return columnsNames[columnIndex];
    }

    @Override
    public int getRowCount() {
        return prescriptionsList.size();
    }

    @Override
    public int getColumnCount() {
        return columnsNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Prescription prescription = prescriptionsList.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return prescription.getInstructions();
        }
        return null;
    }

    public Long getPrescriptionID(int rowIndex){
       Prescription prescription = prescriptionsList.get(rowIndex);
        return prescription.getPrescriptionid();
    }

    @Override
    public Class<?> getColumnClass(int columnIndex){
        switch (columnIndex){
            case 0:
                return String.class;
        }
        return null;
    }
}
