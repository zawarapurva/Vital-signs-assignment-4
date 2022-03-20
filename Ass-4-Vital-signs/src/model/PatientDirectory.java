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
    
    public void updatePatientDetails(Patient updatedPatient) {
        int selectedRecord = 0;
//        ArrayList<Patient> list = new ArrayList<>();
        for (Patient cd : getPatientDirectoryArrayList()) {
            if(cd.getpatientId() == updatedPatient.getpatientId()) {
                patientDirectoryArrayList.set(selectedRecord, updatedPatient);
            }
            selectedRecord++;
        }
    }
    
    public void deletePatientDetails(int patientID) {
        int selectedRecord = 0;
        int deleteRecord = 0;
        for (Patient cd : getPatientDirectoryArrayList()) {
            if(cd.getpatientId() == patientID) {
                deleteRecord = selectedRecord;
            }
            selectedRecord++;
        }
        patientDirectoryArrayList.remove(deleteRecord); 
    }
}
