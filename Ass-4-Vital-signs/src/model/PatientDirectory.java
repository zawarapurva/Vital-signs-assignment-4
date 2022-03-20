/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author apurvazawar
 */
public class PatientDirectory {
    
    Patient patient;
    private ArrayList<Patient> patientDirectoryArrayList;
    
    public PatientDirectory() {
        patientDirectoryArrayList= new ArrayList<Patient>();
    }

    public ArrayList<Patient> getPatientDirectoryArrayList() {
        return patientDirectoryArrayList;
    }

    public void setPatientDirectoryArrayList(ArrayList<Patient> patientDirectoryArrayList) {
        this.patientDirectoryArrayList = patientDirectoryArrayList;
    }
    
    public Patient addNewPatientDetails(Patient newPatientDirectory) {        
//        Patient newPatientDirectory = new Patient();
        patientDirectoryArrayList.add(newPatientDirectory);
        return newPatientDirectory;
    }
    
//    public void updatePatientDetails(int selectedRow, Patient patient) {
//        patientDirectoryArrayList.set(selectedRow, patient);
//    }
}
