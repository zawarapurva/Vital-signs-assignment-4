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
public class Encounter extends VitalSigns {
    
    private String date;
    VitalSigns vitalSigns;
    private ArrayList<VitalSigns> historyArrayList;

    public Encounter() {
        this.historyArrayList = new ArrayList<VitalSigns>();
    }

    public Encounter(String date, VitalSigns vitalSigns) {
        this.date = date;
        this.vitalSigns = vitalSigns;
    }
}
