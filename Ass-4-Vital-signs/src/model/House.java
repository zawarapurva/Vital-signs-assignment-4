/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author apurvazawar
 */
public class House extends Community{
   
    private String houseAddress;
    
    public House(){
    
    }

    public House(String houseAddress, String communityName, String cityName) {
        super(communityName,cityName);
        this.communityName = communityName;
    }
    
    public String getHouseAddress() {
        return houseAddress;
    }

    public void setHouseAddress(String houseAddress) {
        this.houseAddress = houseAddress;
    }
    
    @Override
    public String toString() {
        return this.houseAddress + super.toString();
          
    }
}
