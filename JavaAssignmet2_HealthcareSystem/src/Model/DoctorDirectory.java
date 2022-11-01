/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Model.Doctor;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class DoctorDirectory {
    private ArrayList<Doctor> doctors;

    public DoctorDirectory() {
        doctors = new ArrayList<>();
    }

    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(ArrayList<Doctor> doctors) {
        this.doctors = doctors;
    }
    
    public void addDoctor(Doctor doctor) {
        this.doctors.add(doctor);
    }
    
    public void removeDoctor(Doctor doctor) {
        this.doctors.remove(doctor);
    }
}
