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
public class Patient extends Person {
    VitalSignHistory vitalSignHistory;
    ArrayList<VitalSignHistory> vitalSignHistoryArrayList;
    PatientDirectory patientDirectory;
    
    private int patientId;
    private double bodyTemperature;
    private double bloodPressureSystolic;
    private double bloodPressureDiastolic;
    private double heartRate;
    private double weight;
    private String date; 
//    private static int totalPatient =0;

    public double getBodyTemperature() {
        return bodyTemperature;
    }

    public void setBodyTemperature(double bodyTemperature) {
        this.bodyTemperature = bodyTemperature;
    }

    public double getBloodPressureSystolic() {
        return bloodPressureSystolic;
    }

    public void setBloodPressureSystolic(double bloodPressureSystolic) {
        this.bloodPressureSystolic = bloodPressureSystolic;
    }

    public double getBloodPressureDiastolic() {
        return bloodPressureDiastolic;
    }

    public void setBloodPressureDiastolic(double bloodPressureDiastolic) {
        this.bloodPressureDiastolic = bloodPressureDiastolic;
    }

    public double getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(double heartRate) {
        this.heartRate = heartRate;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getpatientId() {
        return patientId;
    }

    public void setpatientId(int patientId) {
        this.patientId = patientId;
    }
    
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    public Patient(){
//        totalPatient++;
//        this.patientId = totalPatient;
        this.vitalSignHistoryArrayList = new ArrayList<VitalSignHistory>();
    }
    
    public Patient(VitalSignHistory vitalSignHistory, String personName, int personAge, String gender, long contactNumber, String houseAddress, String communityName, String cityName) {
        super(personName,personAge,gender,contactNumber,houseAddress, communityName, cityName);
        this.vitalSignHistory=vitalSignHistory;
    }
    
    public ArrayList<VitalSignHistory> getVitalSignHistory() {
        return vitalSignHistoryArrayList;
    }

    public void setVitalSignHistory(ArrayList<VitalSignHistory> vitalSignHistory) {
        this.vitalSignHistoryArrayList = vitalSignHistory;
    }
    
    public VitalSignHistory addVitalSignHistory(){
        VitalSignHistory vitalSignHistory =  new VitalSignHistory(patientDirectory);
        vitalSignHistoryArrayList.add(vitalSignHistory);
        return vitalSignHistory;
    }
}
