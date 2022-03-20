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
public class VitalSignHistory extends VitalSigns {

    private ArrayList<VitalSigns> vitalSignArrayList;
    PatientDirectory patientDirectory;
    
    public VitalSignHistory(PatientDirectory patientDirectory) {
        this.vitalSignArrayList = new ArrayList<VitalSigns>();
        this.patientDirectory = patientDirectory;
    }
   
    public VitalSigns addNewPatient(){
        VitalSigns vitalSigns = new VitalSigns();
        vitalSignArrayList.add(vitalSigns);
        return vitalSigns;
    }
    
    public ArrayList<VitalSigns> getVitalSignArrayList() {
        return vitalSignArrayList;
    }

    public void setVitalSignArrayList(ArrayList<VitalSigns> vitalSignArrayList) {
        this.vitalSignArrayList = vitalSignArrayList;
    }
    
    public ArrayList<Patient> filterByAbnormalPatients(String selectedCommunity, int patientMinAge, int patientMaxAge) {

        ArrayList<Patient> list = new ArrayList<>();
        for (Patient cd : patientDirectory.getPatientDirectoryArrayList()) {
            String matchingCommunity = cd.getCommunityName();
            if (matchingCommunity.equalsIgnoreCase(selectedCommunity)) {
                int matchingAge = cd.getPersonAge();
                if(matchingAge >= patientMinAge  && matchingAge <= patientMaxAge){
                    double matchingSystolic = cd.getBloodPressureSystolic();
                    double matchingDiastolic = cd.getBloodPressureDiastolic();
                    if(matchingSystolic>120 || matchingSystolic < 90 || matchingDiastolic>80){
                        list.add(cd);
                    }
                }
            }
        }
        return list;
    }
    
    public ArrayList<VitalSigns> filterByEncounterHistory(String patientID) {
            ArrayList<VitalSigns> list = new ArrayList<>();
            for (VitalSigns cd : vitalSignArrayList) {
            String selectedId =String.valueOf(cd.getPatientId());

            if (patientID.equalsIgnoreCase(selectedId)) {
                list.add(cd);
            }
        }
        return list;
    }

}
