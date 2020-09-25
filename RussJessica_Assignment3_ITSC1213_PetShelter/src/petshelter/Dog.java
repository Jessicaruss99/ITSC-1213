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
//create a new dog class that extends the animal class
public class Dog extends Animal {
    
    public ArrayList<Dog> animals = new ArrayList<>();
    //create a list of fields needed

    //create a private default field for dog age and set it to 5
    private int dogAge = 5;

    //create a private default field for dog kennel num and set it to 10 
    private int dogKennelNum = 10;

    //create a private default field for dog gender and set it to male
    private String dogGender = "unknown";

    //create a private default field for dog name and set it to dog
    private String dogName = "dog";

    //create a private default field for dog adopted and set it to false
    private boolean dogAdopted = false;

    //create a private default field for dog fed and set it to false
    private boolean dogFed = false;

    //create a private default field for dog price and set it to 20 
    private double dogPrice = 20.0;

    //create a private default field for dog bathed and set to false
    private boolean dogBathed = false;

    //create a private default field for dog walked and set to false
    private boolean dogWalked = false;

    //constructor
    public Dog() {
        this.dogAge = dogAge;
        this.dogKennelNum = dogKennelNum;
        this.dogGender = dogGender;
        this.dogName = dogName;
        this.dogAdopted = dogAdopted;
        this.dogFed = dogFed;
        this.dogPrice = dogPrice;
        this.dogBathed = dogBathed;
        this.dogWalked = dogWalked;
    }

    //create a get animal age method that overrides the animal class method get animal age
    /**
     * Get the value of animalAge
     *
     * @return the value of animalAge
     */
    @Override
    public int getAnimalAge() {
        return dogAge;
    }//end of get animal age method

    //create a set animal age method that overrides the animal class method set animal age
    /**
     * Set the value of animalAge
     *
     * @param animalAge new value of animalAge
     */
    @Override
    public void setAnimalAge(int animalAge) {
        this.dogAge = animalAge;
    }//end of set animal age method

    //create a get animal kennel num method that overrides the animal class method get kennel num
    /**
     * Get the value of kennelNum
     *
     * @return the value of kennelNum
     */
    @Override
    public int getKennelNum() {
        return dogKennelNum;
    }//end of get kennel num method

    //create a set animal kennel num method that overrides the animal class method set kennel number
    /**
     * Set the value of kennelNum
     *
     * @param kennelNum new value of kennelNum
     */
    @Override
    public void setKennelNum(int kennelNum) {
        this.dogKennelNum = kennelNum;
    }//end of set kennel number method 

    //create a get animal gender method that overrides the animal class method animal gender
    /**
     * Get the value of animalGender
     *
     * @return the value of animalGender
     */
    @Override
    public String getAnimalGender() {
        return dogGender;
    }//end of get animal gender method

    //create a set animal gender method that overrides the animal class method set animal gender
    /**
     * Set the value of animalGender
     *
     * @param animalGender new value of animalGender
     */
    @Override
    public void setAnimalGender(String animalGender) {
        this.dogGender = animalGender;
    }//end of set animal gender method

    //create a get animal name method that overrides the animal class method get animal name
    /**
     * Get the value of animalName
     *
     * @return the value of animalName
     */
    @Override
    public String getAnimalName() {
        return dogName;
    }//end of get animal name method

    //create a set animal name method that overrides the animal class method set animal name
    /**
     * Set the value of animalName
     *
     * @param animalName new value of animalName
     */
    @Override
    public void setAnimalName(String animalName) {
        this.dogName = animalName;
    }//end of set animal name method

    //create a is animal adopted method that overrides the animal class method is animal adopted
    /**
     * Get the value of animalAdopted
     *
     * @return the value of animalAdopted
     */
    @Override
    public boolean isAnimalAdopted() {
        return dogAdopted;
    }//end of is animal adopted method

    //create a set animal adopted method that overrides the animal class method set animal adopted
    /**
     * Set the value of animalAdopted
     *
     * @param animalAdopted new value of animalAdopted
     */
    @Override
    public void setAnimalAdopted(boolean animalAdopted) {
        this.dogAdopted = animalAdopted;
    }//end of set animal adopted method

    //create a is animal fed method that overrides the animal class method is animal fed
    /**
     * Get the value of animalFed
     *
     * @return the value of animalFed
     */
    @Override
    public boolean isAnimalFed() {
        return dogFed;
    }//end of is animal fed method

    //create a set animal fed method that overrides the animal class method set animal fed 
    /**
     * Set the value of animalFed
     *
     * @param animalFed new value of animalFed
     */
    @Override
    public void setAnimalFed(boolean animalFed) {
        this.dogFed = animalFed;
    }//end of set animal fed

    //create a get animal price method that overrides the animal class method get animal price
    /**
     * Get the value of animalPrice
     *
     * @return the value of animalPrice
     */
    @Override
    public double getAnimalPrice() {
        return dogPrice;
    }//end of get animal price method

    //create a set animal price method that overrides the animal class method set animal price
    /**
     * Set the value of animalPrice
     *
     * @param animalPrice new value of animalPrice
     */
    @Override
    public void setAnimalPrice(double animalPrice) {
        this.dogPrice = animalPrice;
    }//end of set animal price

    //create a get dog bathed method 
    /**
     * Get the value of dogBathed
     *
     * @return the value of dogBathed
     */
    public boolean isDogBathed() {
        return dogBathed;
    }//end of get dog bathed method

    //create a set dog bathed method
    /**
     * Set the value of dogBathed
     *
     * @param dogBathed new value of dogBathed
     */
    public void setDogBathed(boolean dogBathed) {
        this.dogBathed = dogBathed;
    }//end of set dog bathed method

    //create a is dog walked method
    /**
     * Get the value of dogWalked
     *
     * @return the value of dogWalked
     */
    public boolean isDogWalked() {
        return dogWalked;
    }//end of is dog walked method

    //create a set dog walked method
    /**
     * Set the value of dogWalked
     *
     * @param dogWalked new value of dogWalked
     */
    public void setDogWalked(boolean dogWalked) {
        this.dogWalked = dogWalked;
    }//end of set dog walked method

}//end of dog class
