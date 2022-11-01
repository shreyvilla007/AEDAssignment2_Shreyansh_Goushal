/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;
import java.util.ArrayList;
/**
 *
 * @author admin
 */


public class Community {
    private String community;
    private ArrayList<House> house;

    public ArrayList<House> getHouse() {
        return house;
    }

    public void setHouse(ArrayList<House> house) {
        this.house = house;
    }
    
    public Community(String comm){
        community = comm;
    }
    public String getCommunity() {
        return community;
    }
    public void setCommunity(String community) {
        this.community = community;
    }
    
}
