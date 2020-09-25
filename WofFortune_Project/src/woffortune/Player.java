

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//ITSC 1213 Jessica Russ
package woffortune;
import java.util.ArrayList;

/**
 * Class that defines a player for a game with monetary winnings and 
 * a limited number of choices
 * @author jessica russ
 */
public class Player {
    private int winnings = 0; // amount of money won
    private String name; // player's name
    private int numGuesses = 0; // number of times they've tried to solve puzzle
    
   //Assignment 2 Part 5
    //creaste an  arraylist to the player class to keep track of the prizes a player has earned
    private ArrayList<String> playerPrizesArray = new ArrayList<String>();

    /**
     * Constructor
     * @param name String that is the player's name
     */
    public Player(String name) {
        this.name = name;
    }

    /**
     * Getter
     * @return int amount of money won so far 
     */
    public int getWinnings() {
        return winnings;
    }

    /**
     * Adds amount to the player's winnings
     * @param amount int money to add
     */
    public void incrementScore(int amount) {
        if (amount < 0) return;
        this.winnings += amount;
    }

    /**
     * Getter 
     * @return String player's name 
     */
    public String getName() {
        return name;
    }

    /**
     * Getter
     * @return int the number of guesses used up 
     */
    public int getNumGuesses() {
        return numGuesses;
    }

    /** 
     * Add 1 to the number of guesses used up
     */
    public void incrementNumGuesses() {
        this.numGuesses++;
    }
    
    /**
     * Resets for a new game (only number of guesses)
     * This does not reset the winnings.
     */
    public void reset() {
        this.numGuesses = 0;
    }
    /**
     * method to reset the players winnings to zero
     */
    public void bankrupt() {
        this.winnings = 0;
    }
    
    /**
     * method to get the prizes a player has
     * @return the player prizes array
     */
    public ArrayList<String> getPrizes(){
        return playerPrizesArray;
    } 
    /**
     * method to add a prize to the player prizes array 
     * @param prize 
     */
    public void addPrize(String prize){
        playerPrizesArray.add(prize);
    }
}
