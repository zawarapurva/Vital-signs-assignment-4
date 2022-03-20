/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author apurvazawar
 */
public class PersonDirectory {
    
    Person person;
    private ArrayList<Person> personDirectoryArrayList;

    public PersonDirectory() {
        personDirectoryArrayList= new ArrayList<Person>();
    }

    public ArrayList<Person> getPersonDirectoryArrayList() {
        return personDirectoryArrayList;
    }

    public void setPersonDirectoryArrayList(ArrayList<Person> personDirectoryArrayList) {
        this.personDirectoryArrayList = personDirectoryArrayList;
    }
    
    public Person addNewPersonDetails() {
        Person newPersonDetails = new Person();
        personDirectoryArrayList.add(newPersonDetails);
        return newPersonDetails;
    }

    public void deletePersonDetails(int selectedRow) {
        personDirectoryArrayList.remove(selectedRow); 
    }
    
    public void updatePersonDetails(int selectedRow, Person person) {
        personDirectoryArrayList.set(selectedRow, person);
    }
}
