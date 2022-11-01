/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author admin
 */

public class Encounter {
    private VitalSigns vitalSign;
    private Date aptTime;
    private String diagnosis;

    public Encounter( VitalSigns vitalSign,
            Date aptTime,
            String result){

        this.vitalSign =vitalSign;
        this.aptTime = aptTime;
        this.diagnosis = result;

    }

    public VitalSigns getVitalSign() {
        return vitalSign;
    }

    public void setVitalSign(VitalSigns vitalSign) {
        this.vitalSign = vitalSign;
    }

    public Date getAptTime() {
        return aptTime;
    }

    public void setAptTime(Date aptTime) {
        this.aptTime = aptTime;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String result) {
        this.diagnosis = result;
    }

    void addEncounter(Encounter eh) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
