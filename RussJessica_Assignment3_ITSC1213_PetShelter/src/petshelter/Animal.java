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
//create an animal class
public class Animal {
    
    public ArrayList<Animal> animals = new ArrayList<>();
    
    //create a list of fields needed
    
    //create a public default field for animal age and set to 0
    public int animalAge = 0;
    
    //create a public default field for kennel number and set to 0
    public int kennelNum = 0;
    
    //create a public default field for animal gender and set it to female
    public String animalGender = "female";
    
    //create a public default field for animal name and set it to unknown
    public String animalName = "animal";
    
    //create a public default field for animal adoption status and set it to false
    public boolean animalAdopted = false;
    
    //create a public default field for animal fed status and set it to false
    public boolean animalFed = false;
    
    //create a public default field for animal price and set to 5 dollars
    public double animalPrice;
    
    //constructor
    public Animal() {
        this.animalAge = animalAge;
        this.kennelNum = kennelNum;
        this.animalGender = animalGender;
        this.animalName = animalName;
        this.animalAdopted = animalAdopted;
        this.animalFed = animalFed;
        this.animalPrice = animalPrice;
    }
    
    //add animal information method
    /**
     * Method to add all animal information to the animal
     * @param animalAge
     * @param kennelNum
     * @param animalGender
     * @param animalName
     * @param animalAdopted
     * @param animalFed
     * @param animalPrice
     * @return 
     */
    public Animal addAnimal(int animalAge, int kennelNum, String animalGender, 
            String animalName, boolean animalAdopted, boolean animalFed, double animalPrice){
        
        this.animalAge = animalAge;
        this.kennelNum = kennelNum;
        this.animalGender = animalGender;
        this.animalName = animalName;
        this.animalAdopted = animalAdopted;
        this.animalFed = animalFed;
        this.animalPrice = animalPrice;
        
        
        return this;
    }
    /**
     * Method to print out the array of animals and what type of animal they are
     */
    public void printAnimals(){
            for (int i = 0; i < animals.size(); i++) {
            System.out.println(animals.get(i) + " also known as " + animals.get(i).getAnimalName());
    }
    }
   /**
    * method to remove an animal by choosing from index of all animals in pet shelter
    * @param index
    * @return index
    */
   public int removeAnimal(int index) {
        for (int i = 0; i < animals.size(); i++) {
            animals.remove(index);
    }
        return index;
        
    }

    
    
    
    //create a get animal age method
     /**
     * Get the value of animalAge
     *
     * @return the value of animalAge
     */
    public int getAnimalAge() {
        return animalAge;
    } //end of get animal age method

    //create a set animal age method
    /**
     * Set the value of animalAge
     *
     * @param animalAge new value of animalAge
     */
    public void setAnimalAge(int animalAge) {
        this.animalAge = animalAge;
    }//end of set animal age method


    //create a get kennel number method
    /**
     * Get the value of kennelNum
     *
     * @return the value of kennelNum
     */
    public int getKennelNum() {
        return kennelNum;
    } //end of get kennel num method
    
    
    //create a set kennel number method 
    /**
     * Set the value of kennelNum
     *
     * @param kennelNum new value of kennelNum
     */
    public void setKennelNum(int kennelNum) {
        this.kennelNum = kennelNum;
    }//end of set kennel num method

/**
     * Get the value of animalGender
     *
     * @return the value of animalGender
     */
    public String getAnimalGender() {
        return animalGender;
    }//end of get animal gender method

    /**
     * Set the value of animalGender
     *
     * @param animalGender new value of animalGender
     */
    public void setAnimalGender(String animalGender) {
        this.animalGender = animalGender;
    }//end of set animal gender method

     /**
     * Get the value of animalName
     *
     * @return the value of animalName
     */
    public String getAnimalName() {
        return animalName;
    }//end of get animal name method

    /**
     * Set the value of animalName
     *
     * @param animalName new value of animalName
     */
    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }//end of set animal name method

    /**
     * Get the value of animalAdopted
     *
     * @return the value of animalAdopted
     */
    public boolean isAnimalAdopted() {
        return animalAdopted;
    }//end of is animal adopted method

    /**
     * Set the value of animalAdopted
     *
     * @param animalAdopted new value of animalAdopted
     */
    public void setAnimalAdopted(boolean animalAdopted) {
        this.animalAdopted = animalAdopted;
    }// end of set animal adopted method

    /**
     * Get the value of animalFed
     *
     * @return the value of animalFed
     */
    public boolean isAnimalFed() {
        return animalFed;
    }//end of is animal fed method

    /**
     * Set the value of animalFed
     *
     * @param animalFed new value of animalFed
     */
    public void setAnimalFed(boolean animalFed) {
        this.animalFed = animalFed;
    }//end of set animal fed method

   /**
     * Get the value of animalPrice
     *
     * @return the value of animalPrice
     */
    public double getAnimalPrice() {
        return animalPrice;
    }//end of get animal price method

    /**
     * Set the value of animalPrice
     *
     * @param animalPrice new value of animalPrice
     */
    public void setAnimalPrice(double animalPrice) {
        this.animalPrice = animalPrice;
    } // end of set animal price method

    
    /**
     * Method to donate an animal by adding all animal information to the animal
     * @param animalAge
     * @param kennelNum
     * @param animalGender
     * @param animalName
     * @param animalAdopted
     * @param animalFed
     * @param animalPrice
     * @return 
     */
    public Animal donateAnimal(int animalAge, int kennelNum, String animalGender, 
            String animalName, boolean animalAdopted, boolean animalFed, double animalPrice){
        
        this.animalAge = animalAge;
        this.kennelNum = kennelNum;
        this.animalGender = animalGender;
        this.animalName = animalName;
        this.animalAdopted = animalAdopted;
        this.animalFed = animalFed;
        this.animalPrice = animalPrice;
        
        
        return this;
    }
}// end of animal class
