/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author admin
 */
import java.util.Date;

public class Person {
    private String fullName;
    private House residence;
    private String gender;
    private String dob;
    private int id;
    private boolean displayPerson = true;

    public Person(String fullName,
            House residence,
            String gender,
            String dob,
            int id) {

        this.fullName = fullName;
        this.residence = residence;
        this.gender = gender;
        this.dob = dob;
        this.id = id;

    }
    public Person(String houseNo, Community community){
        residence = new House(houseNo, community, new City(""));
    }
    
    public boolean isDisplayPerson() {
        return displayPerson;
    }

    public void setDisplayPerson(boolean displayPerson) {
        this.displayPerson = displayPerson;
    }
    
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public House getResidence() {
        return residence;
    }

    public void setResidence(House residence) {
        this.residence = residence;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
