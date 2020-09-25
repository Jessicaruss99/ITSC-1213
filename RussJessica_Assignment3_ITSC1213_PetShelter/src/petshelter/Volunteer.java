/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petshelter;

/**
 *
 * @author jessi
 */
//create a volunteer class that extends the people class
public class Volunteer extends People {

    //create a list of fields needed
    
    //create a private string for name
    private String name;
    
    //create a private integer for volunteer id
    private int volunteerID;

    //create a volunteer constructor
    /**
     * Volunteer constructor 
     */
    public Volunteer() {
        this.name = name;
        this.volunteerID = volunteerID;
    }

    //getter method for volunteer ID
    /**
     * Get the value of volunteerID
     * @return the value of volunteerID
     */
    public int getVolunteerID() {
        return volunteerID;
    }

    
    //setter method for volunteer id
    /**
     * Set the value of volunteer ID
     * @param volunteerID 
     */
    public void setVolunteerID(int volunteerID) {
        this.volunteerID = volunteerID;
    }


    //getter method for name
    /**
     * Get the value of name
     * @return name
     */
    @Override
    public String getName() {
        return name;
    }

    //setter method for name
    /**
     * Set the value of name
     * @param name 
     */
    @Override
    public void setName(String name) {
        this.name = name;
    }

}
