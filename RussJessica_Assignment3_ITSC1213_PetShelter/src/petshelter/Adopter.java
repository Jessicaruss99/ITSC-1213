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
//create an adopter class  that extends the people class
public class Adopter extends People{
      private String name;
    private int adopterID;

      @Override
    public String getName() {
        return name;
    }

      @Override
    public void setName(String name) {
        this.name = name;
    }

    public int getAdopterID() {
        return adopterID;
    }

    public void setAdopterID(int adopterID) {
        this.adopterID = adopterID;
    }

   
    
    
}
