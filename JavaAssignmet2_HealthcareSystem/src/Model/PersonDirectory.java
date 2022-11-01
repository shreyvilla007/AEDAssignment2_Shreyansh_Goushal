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


public class PersonDirectory {

    private ArrayList<Person> persons;

    public PersonDirectory() {
        persons = new ArrayList<>();
    }

    public void addPerson(Person person){
        persons.add(person);
    }
    
    public Person addNewPerson(String houseNo, Community community){
        Person per = new Person(houseNo, community);
        persons.add(per);
        return per;
    }
    
    public void removePerson(Person person){
        persons.remove(person);
    }


    public ArrayList<Person> getPersons() {
        return persons;
    }

    public void setPersons(ArrayList<Person> persons) {
        this.persons = persons;
    }

    public Person searchUser(int txtId) {

        for (Person v : persons) {
            System.out.println("person "+v.getId());
            if (v.getId() == txtId ) {
                System.out.println("person"+v.getFullName());
                return v;
            }
        }
        return null;
    }

    public void deletePerson(int id) {
        System.out.println("id "+id);
        
       for (Person p : persons) {
            
            if (p.getId() == id ) {
                persons.remove(p);
                return;
            }
        }
    }
}
