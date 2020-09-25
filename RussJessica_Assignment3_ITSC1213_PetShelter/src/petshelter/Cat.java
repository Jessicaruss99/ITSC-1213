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
//create a new cat class that extends the animal class
public class Cat extends Animal {
    
    public ArrayList<Cat> animals = new ArrayList<>();
    
    //create a list of fields needed

    //create a private default field for cat age and set it to 1
    private int catAge = 1;

    //create a private default field for cat kennel num and set it to 50 
    private int catKennelNum = 50;

    //create a private default field for cat gender and set it to male
    private String catGender = "male";

    //create a private default field for cat name and set it to cat
    private String catName = "cat";

    //create a private default field for cat adopted and set it to false
    private boolean catAdopted = false;

    //create a private default field for cat fed and set it to false
    private boolean catFed = false;

    //create a private default field for cat price and set it to 10 
    private double catPrice = 10.0;

    //create a private default field for the cat played with and set it to true
    private boolean catPlayedWith = true;

    //constructor
    public Cat() {
        this.catAge = catAge;
        this.catKennelNum = catKennelNum;
        this.catGender = catGender;
        this.catName = catName;
        this.catAdopted = catAdopted;
        this.catFed = catFed;
        this.catPrice = catPrice;
        this.catPlayedWith = catPlayedWith;
    }

    //create a get animal age method that overrides the animal class method get animal age
    /**
     * Get the value of animalAge
     *
     * @return the value of animalAge
     */
    @Override
    public int getAnimalAge() {
        return catAge;
    }//end of get animal age method

    //create a set animal age method that overrides the animal class method set animal age
    /**
     * Set the value of animalAge
     *
     * @param animalAge new value of animalAge
     */
    @Override
    public void setAnimalAge(int animalAge) {
        this.catAge = animalAge;
    }//end of set animal age method

    //create a get animal kennel num method that overrides the animal class method get kennel num
    /**
     * Get the value of kennelNum
     *
     * @return the value of kennelNum
     */
    @Override
    public int getKennelNum() {
        return catKennelNum;
    }//end of get kennel num method

    //create a set animal kennel num method that overrides the animal class method set kennel number
    /**
     * Set the value of kennelNum
     *
     * @param kennelNum new value of kennelNum
     */
    @Override
    public void setKennelNum(int kennelNum) {
        this.catKennelNum = kennelNum;
    }//end of set kennel number method 

    //create a get animal gender method that overrides the animal class method animal gender
    /**
     * Get the value of animalGender
     *
     * @return the value of animalGender
     */
    @Override
    public String getAnimalGender() {
        return catGender;
    }//end of get animal gender method

    //create a set animal gender method that overrides the animal class method set animal gender
    /**
     * Set the value of animalGender
     *
     * @param animalGender new value of animalGender
     */
    @Override
    public void setAnimalGender(String animalGender) {
        this.catGender = animalGender;
    }//end of set animal gender method

    //create a get animal name method that overrides the animal class method get animal name
    /**
     * Get the value of animalName
     *
     * @return the value of animalName
     */
    @Override
    public String getAnimalName() {
        return catName;
    }//end of get animal name method

    //create a set animal name method that overrides the animal class method set animal name
    /**
     * Set the value of animalName
     *
     * @param animalName new value of animalName
     */
    @Override
    public void setAnimalName(String animalName) {
        this.catName = animalName;
    }//end of set animal name method

    //create a is animal adopted method that overrides the animal class method is animal adopted
    /**
     * Get the value of animalAdopted
     *
     * @return the value of animalAdopted
     */
    @Override
    public boolean isAnimalAdopted() {
        return catAdopted;
    }//end of is animal adopted method

    //create a set animal adopted method that overrides the animal class method set animal adopted
    /**
     * Set the value of animalAdopted
     *
     * @param animalAdopted new value of animalAdopted
     */
    @Override
    public void setAnimalAdopted(boolean animalAdopted) {
        this.catAdopted = animalAdopted;
    }//end of set animal adopted method

    //create a is animal fed method that overrides the animal class method is animal fed
    /**
     * Get the value of animalFed
     *
     * @return the value of animalFed
     */
    @Override
    public boolean isAnimalFed() {
        return catFed;
    }//end of is animal fed method

    //create a set animal fed method that overrides the animal class method set animal fed 
    /**
     * Set the value of animalFed
     *
     * @param animalFed new value of animalFed
     */
    @Override
    public void setAnimalFed(boolean animalFed) {
        this.catFed = animalFed;
    }//end of set animal fed

    //create a get animal price method that overrides the animal class method get animal price
    /**
     * Get the value of animalPrice
     *
     * @return the value of animalPrice
     */
    @Override
    public double getAnimalPrice() {
        return catPrice;
    }//end of get animal price method

    //create a set animal price method that overrides the animal class method set animal price
    /**
     * Set the value of animalPrice
     *
     * @param animalPrice new value of animalPrice
     */
    @Override
    public void setAnimalPrice(double animalPrice) {
        this.catPrice = animalPrice;
    }//end of set animal price

    //create a method for is the cat played with
    /**
     * Get the value of catPlayedWith
     *
     * @return the value of catPlayedWith
     */
    public boolean isCatPlayedWith() {
        return catPlayedWith;
    }//end of is cat played with method

    //create a method for set cat played with
    /**
     * Set the value of catPlayedWith
     *
     * @param catPlayedWith new value of catPlayedWith
     */
    public void setCatPlayedWith(boolean catPlayedWith) {
        this.catPlayedWith = catPlayedWith;
    }//end of set cat played with 

}// end of cat class
