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
public class City {
    public static String[] cityValues = {"Boston", "Salem", "Cambridge", "Worcester", "Plymouth", "Lowell"};
    public String cityName;
    public static ArrayList<Community> communityDir = new ArrayList<>();
    public String state;

    public String getCityName() {
        return cityName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
