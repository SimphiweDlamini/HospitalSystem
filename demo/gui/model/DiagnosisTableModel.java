package com.demo.gui.model;

import com.demo.model.Diagnosis;

import javax.swing.table.AbstractTableModel;
import java.util.*;

public class DiagnosisTableModel extends AbstractTableModel {
    private List<Diagnosis> diagnosisList = new ArrayList<>();
    private String[] columnsNames = {
            "Date of Diagnosis", "Description"
    };

    public List<Diagnosis> getDiagnosisList(){
        return this.diagnosisList;
    }

    public DiagnosisTableModel(List<Diagnosis> list){
        this.diagnosisList = list;
    }

    @Override
    public String getColumnName(int columnIndex){
        return columnsNames[columnIndex];
    }

    @Override
    public int getRowCount() {
        return diagnosisList.size();
    }

    @Override
    public int getColumnCount() {
        return columnsNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Diagnosis diagnosis = diagnosisList.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return diagnosis.getDateOfDiagnosis();
            case 1:
                return diagnosis.getDescription();
        }
        return null;
    }

    public Long getDiagnosisID(int rowIndex){
        Diagnosis diagnosis = diagnosisList.get(rowIndex);
        return diagnosis.getDiagnosisid();
    }

    @Override
    public Class<?> getColumnClass(int columnIndex){
        switch (columnIndex){
            case 0:
            case 1:
                return String.class;
        }
        return null;
    }
}
