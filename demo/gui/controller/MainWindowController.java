package com.demo.gui.controller;

import com.demo.gui.model.DiagnosisTableModel;
import com.demo.gui.model.PatientTableModel;
import com.demo.gui.view.MainWindowView;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;


import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

@Controller
@RequiredArgsConstructor
public class MainWindowController {
    private final MainWindowView mainWindowView;


    public void showGUI(){
        mainWindowView.setVisible(true);
        initGUIListeners();
    }


    private void initGUIListeners(){
        mainWindowView.getTablePatient().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                int index = mainWindowView.getTablePatient().getSelectedRow();
                PatientTableModel model = (PatientTableModel) mainWindowView.getTablePatient().getModel();
                mainWindowView.loadDiagnosis(model.getPatientID(index));
                initDiagnosisListnener();
            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {

            }

    });
    }

    private void initDiagnosisListnener() {
        mainWindowView.getDiagnosisView().getTableDiagnosis().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                int index = mainWindowView.getDiagnosisView().getTableDiagnosis().getSelectedRow();
                DiagnosisTableModel model = (DiagnosisTableModel) mainWindowView.getDiagnosisView().getTableDiagnosis().getModel();
                mainWindowView.loadPrescription(model.getDiagnosisID(index));
            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {

            }
        });
    }
}
