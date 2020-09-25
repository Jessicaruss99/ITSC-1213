/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petshelter;

import java.util.ArrayList;

/**
 *
 * @author jessi
 */
//create a new bird class that extends the animal class
public class Bird extends Animal{
    
    public ArrayList<Bird> animals = new ArrayList<>();
    
    //create a list of fields needed
  
    //create a private default field for bird age and set it to 0
    private int birdAge = 1;
    
    //create a private default field for bird kennel num and set it to 0 
    private int birdKennelNum = 01;
    
    //create a private default field for bird gender and set it to male
    private String birdGender = "unknown";
    
    //create a private default field for bird name and set it to bird
    private String birdName = "bird";
    
    //create a private default field for bird adopted and set it to false
    private boolean birdAdopted = false;
    
    //create a private default field for bird fed and set it to true
    private boolean birdFed = true;
    
    //create a private default field for bird price and set it to 7.5 
    private double birdPrice = 7.5;
    
    //create a private default field for bird talked to and set it to false
    private boolean birdTalkedTo = false;

   //constructor
    public Bird(){
        this.birdAge = birdAge;
        this.birdKennelNum = birdKennelNum;
        this.birdGender = birdGender;
        this.birdName = birdName;
        this.birdAdopted = birdAdopted;
        this.birdFed = birdFed;
        this.birdPrice = birdPrice;
        this.birdTalkedTo = birdTalkedTo;
    }

    

    //create a get animal age method that overrides the animal class method get animal age
    /**
     * Get the value of animalAge
     *
     * @return the value of animalAge
     */
     @Override
    public int getAnimalAge() {
        return birdAge;
    }//end of get animal age method

    //create a set animal age method that overrides the animal class method set animal age
    /**
     * Set the value of animalAge
     *
     * @param animalAge new value of animalAge
     */
    @Override
    public void setAnimalAge(int animalAge) {
        this.birdAge = animalAge;
    }//end of set animal age method
    
    //create a get animal kennel num method that overrides the animal class method get kennel num
    /**
     * Get the value of kennelNum
     *
     * @return the value of kennelNum
     */
    @Override
    public int getKennelNum() {
        return birdKennelNum;
    }//end of get kennel num method

    //create a set animal kennel num method that overrides the animal class method set kennel number
    /**
     * Set the value of kennelNum
     *
     * @param kennelNum new value of kennelNum
     */
    @Override
    public void setKennelNum(int kennelNum) {
        this.birdKennelNum = kennelNum;
    }//end of set kennel number method 
    
    //create a get animal gender method that overrides the animal class method animal gender
/**
     * Get the value of animalGender
     *
     * @return the value of animalGender
     */
    @Override
    public String getAnimalGender() {
        return birdGender;
    }//end of get animal gender method

    //create a set animal gender method that overrides the animal class method set animal gender
    /**
     * Set the value of animalGender
     *
     * @param animalGender new value of animalGender
     */
    @Override
    public void setAnimalGender(String animalGender) {
        this.birdGender = animalGender;
    }//end of set animal gender method

    //create a get animal name method that overrides the animal class method get animal name
   /**
     * Get the value of animalName
     *
     * @return the value of animalName
     */
    @Override
    public String getAnimalName() {
        return birdName;
    }//end of get animal name method

    //create a set animal name method that overrides the animal class method set animal name
    /**
     * Set the value of animalName
     *
     * @param animalName new value of animalName
     */
    @Override
    public void setAnimalName(String animalName) {
        this.birdName = animalName;
    }//end of set animal name method

    //create a is animal adopted method that overrides the animal class method is animal adopted
 /**
     * Get the value of animalAdopted
     *
     * @return the value of animalAdopted
     */
    @Override
    public boolean isAnimalAdopted() {
        return birdAdopted;
    }//end of is animal adopted method

    //create a set animal adopted method that overrides the animal class method set animal adopted
    /**
     * Set the value of animalAdopted
     *
     * @param animalAdopted new value of animalAdopted
     */
    @Override
    public void setAnimalAdopted(boolean animalAdopted) {
        this.birdAdopted = animalAdopted;
    }//end of set animal adopted method
   
    //create a is animal fed method that overrides the animal class method is animal fed
    /**
     * Get the value of animalFed
     *
     * @return the value of animalFed
     */
    @Override
    public boolean isAnimalFed() {
        return birdFed;
    }//end of is animal fed method

    //create a set animal fed method that overrides the animal class method set animal fed 
    /**
     * Set the value of animalFed
     *
     * @param animalFed new value of animalFed
     */
    @Override
    public void setAnimalFed(boolean animalFed) {
        this.birdFed = animalFed;
    }//end of set animal fed

    //create a get animal price method that overrides the animal class method get animal price
    /**
     * Get the value of animalPrice
     *
     * @return the value of animalPrice
     */
    @Override
    public double getAnimalPrice() {
        return birdPrice;
    }//end of get animal price method

    //create a set animal price method that overrides the animal class method set animal price
    /**
     * Set the value of animalPrice
     *
     * @param animalPrice new value of animalPrice
     */
    @Override
    public void setAnimalPrice(double animalPrice) {
        this.birdPrice = animalPrice;
    }//end of set animal price
    
 
     //create a is bird talked to method
    /**
     * Get the value of birdTalkedTo
     *
     * @return the value of birdTalkedTo
     */
    public boolean isBirdTalkedTo() {
        return birdTalkedTo;
    }//end of is bird talked to method
    

    //create a set bird talked to method
    /**
     * Set the value of birdTalkedTo
     *
     * @param birdTalkedTo new value of birdTalkedTo
     */
    public void setBirdTalkedTo(boolean birdTalkedTo) {
        this.birdTalkedTo = birdTalkedTo;
    }//end of bird set talked to method
    
}//end of bird class
