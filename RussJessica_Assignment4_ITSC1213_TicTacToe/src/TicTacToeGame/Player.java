package TicTacToeGame;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author clatulip
 */
public class Player {
    
    //create a private string for name
    private String name;
    
    //create a private integer for the number of rounds won for a player
    private int roundsWon;

    /**
     * Constructor to create a new playre
     * @param name 
     */
    Player(String name) {
        this.name = name;
        this.roundsWon = 0;
    }

    /**
     * Method to get the name
     * @return 
     */
    public String getName() {
        return name;
    }

    /**
     * Method to set the name
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }

    
    /**
     * Method to get the rounds won
     * @return 
     */
    public int getRoundsWon() {
        return roundsWon;
    }

    /**
     * Method to set the rounds won
     * @param roundsWon 
     */
    public void setRoundsWon(int roundsWon) {
        this.roundsWon = roundsWon;
    }

  
   
    
}
