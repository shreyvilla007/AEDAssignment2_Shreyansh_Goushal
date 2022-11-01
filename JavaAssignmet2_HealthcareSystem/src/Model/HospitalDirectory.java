/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class HospitalDirectory {
    private ArrayList<Hospital> hospitals;

    public HospitalDirectory(){
        hospitals = new ArrayList<>();
    }
    
    public ArrayList<Hospital> getHospitals() {
        return hospitals;
    }

    public void setHospitals(ArrayList<Hospital> hospitals) {
        this.hospitals = hospitals;
    }
    
    public void addHospital(Hospital hospital) {
        this.hospitals.add(hospital);
    }
    
    public void removeHospital(Hospital hospital) {
        this.hospitals.remove(hospital);
    }
}
