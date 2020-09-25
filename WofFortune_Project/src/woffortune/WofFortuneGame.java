
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//ITSC 1213 Jessica Russ
package woffortune;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

/**
 * WofFortuneGame class Contains all logistics to run the game
 *
 * @author jessica russ
 */
public class WofFortuneGame {

    private boolean puzzleSolved = false;

    private Wheel wheel;
    private Player player1;
    private String phrase = "Once upon a time";
    //private Letter[] letter_array = new Letter[16];

    //Assignment 2 Part 1A
    //create an array list to hold the letter objects in a phrase
    private ArrayList<Letter> letterPhraseArray = new ArrayList<Letter>();

    //Assignment 2 Part2A
    //create an array list of string objects 
    private ArrayList<String> differentPhrasesArray = new ArrayList<String>();

    //Assignment 2 Part 3A
    //create an array list of player objects
    private ArrayList<Player> playerNumberArray = new ArrayList<Player>();

    //Assignment 2 Part 5
    //creaste an  arraylist to the player class to keep track of the prizes a player has earned
    private ArrayList<String> playerPrizesArray = new ArrayList<String>();

    /**
     * Constructor
     *
     * @param wheel Wheel
     * @throws InterruptedException
     */
    public WofFortuneGame(Wheel wheel) throws InterruptedException {
        // get the wheel
        this.wheel = wheel;

        // do all the initialization for the game
        setUpGame();

    }

    /**
     * Plays the game
     *
     * @throws InterruptedException
     */
    public void playGame() throws InterruptedException {
        // while the puzzle isn't solved, keep going
        while (!puzzleSolved) {

            // let the current player play
            //playTurn(player1);
            //Assignment 2 Part 3D
            //change the code so it cycles through each player, giving each a turn
            for (int i = 0; i < playerNumberArray.size(); i++) {
                //how do make it cycle through with access to the player at i
                playerNumberArray.get(i);
            }
        }
    }

    /**
     * Sets up all necessary information to run the game
     */
    private void setUpGame() {
        // create a single player 
        // player1 = new Player("Player1");
        //do {
            try {
                //Assignment 2 Part 3B
                //ask how many people are going to play
                System.out.println("Please enter number of players as an integer");

                //create a scanner object
                Scanner sc = new Scanner(System.in);

                //Assignment 2 Part 3B
                //use the scanners next int method to get the number they enter
                int numberOfPlayers = 0;
                numberOfPlayers = sc.nextInt();

                //Assignment 2 Part 3C
                //loop through 
                for (int i = 0, j = 1; i < numberOfPlayers; i++, j++) {

                    //ask for each players name
                    System.out.println("Please enter player " + j + "'s name");

                    //use the scanner to store the name of the player as a string
                    String nameOfPlayer = sc.next();

                    //use that to create a new player object with that name 
                    Player player = new Player(nameOfPlayer);

                    //add the player object to the array list of players
                    playerNumberArray.add(player);
                }
            } catch (InputMismatchException ime) {
                //create a scanner object
                Scanner sc = new Scanner(System.in);
                System.out.println("oh no! you didnt type an integer");
                System.out.println(ime);
                System.out.println("How many people are playing");
                int numberOfPlayers = sc.nextInt();

            }
        //} while (numberOfPlayers = 0)
        
        
        try {
            //Assignment 2 Part 2C
            individualPlayerPhraseOptions();

            //create a scanner object
            Scanner sc = new Scanner(System.in);

            // print out the rules
            System.out.println("RULES!");
            System.out.println("Each player gets to spin the wheel, to get a number value");
            System.out.println("Each player then gets to guess a letter. If that letter is in the phrase, ");
            System.out.println(" the player will get the amount from the wheel for each occurence of the letter");
            System.out.println("If you have found a letter, you will also get a chance to guess at the phrase");
            System.out.println("Each player only has three guesses, once you have used up your three guesses, ");
            System.out.println("you can still guess letters, but no longer solve the puzzle.");
            System.out.println();

            //Assignment 2 Part 1B
            //ask the user if they want to enter their own phrase
            System.out.println("Do you want to enter your own phrase? (Y/N)");
            //Scanner sc = new Scanner(System.in);

            char letter = sc.next().charAt(0);
            System.out.println();
            if ((letter == 'Y') || (letter == 'y')) {
                System.out.println("Please enter a phrase");
                System.out.println();
                sc.useDelimiter("\n");
                phrase = sc.next();
            } //Assignment 2 Part 2D
            //randomly pick one of the phrases in array list for 
            else {
                //generate a random number for the phrase to be chosen from
                int randomNum = (int) (Math.random() * differentPhrasesArray.size());

                //pull the phrase based on the random number chosen
                //set the phrase to that number 
                phrase = differentPhrasesArray.get(randomNum);

            }

            //Assignment 2 Part 1A
            // for each character in the phrase, create a letter and add to letters array
            for (int i = 0; i < phrase.length(); i++) {
                //create a letter object to hold the character reference
                Letter a = new Letter(phrase.charAt(i));
                //store the letter variable a at the index i
                letterPhraseArray.add(i, a);
            }
        } catch (Exception e) {
            System.out.println("Oh no! There has been an error!");
            System.out.println(e);

        }
        // setup done
    }

    //Assignment 2 Part 2B
    //create a new method that does nothing but add at least 10 different phrases to the arraylist
    private void individualPlayerPhraseOptions() {

        String phrase1 = "A cheap shot";
        differentPhrasesArray.add(phrase1);

        String phrase2 = "A fish out of water";
        differentPhrasesArray.add(phrase2);

        String phrase3 = "Supercalifragilisticexpialidocious";
        differentPhrasesArray.add(phrase3);

        String phrase4 = "Mad as a hatter";
        differentPhrasesArray.add(phrase4);

        String phrase5 = "Easy as pie";
        differentPhrasesArray.add(phrase5);

        String phrase6 = "William Shakespeare";
        differentPhrasesArray.add(phrase6);

        String phrase7 = "Yellow Submarine";
        differentPhrasesArray.add(phrase7);

        String phrase8 = "Computer Science is fun";
        differentPhrasesArray.add(phrase8);

        String phrase9 = "Great Danes are cute";
        differentPhrasesArray.add(phrase9);

        String phrase10 = "Supernatural";
        differentPhrasesArray.add(phrase10);

        String phrase11 = "A piece of cake";
        differentPhrasesArray.add(phrase11);

        String phrase12 = "High as a kite";
        differentPhrasesArray.add(phrase12);

        String phrase13 = "Wheel of fortune";
        differentPhrasesArray.add(phrase13);

        String phrase14 = "The apple doesnt fall to far from the tree";
        differentPhrasesArray.add(phrase14);

        String phrase15 = "Fish out of water";
        differentPhrasesArray.add(phrase15);

        String phrase16 = "In omnia paratus";
        differentPhrasesArray.add(phrase16);

        String phrase17 = "Curiosity killed the cat";
        differentPhrasesArray.add(phrase17);

        String phrase18 = "Doctor Who";
        differentPhrasesArray.add(phrase18);

        String phrase19 = "Between a rock and a hard place";
        differentPhrasesArray.add(phrase19);

        String phrase20 = "A dime a dozen";
        differentPhrasesArray.add(phrase20);
    }

    //Assignment 2 Part 5
    //create a set of possible prizes to the game
    public void listOfPrizes() {
        String prize1 = "A trip to the bahamas";
        playerPrizesArray.add(prize1);

        String prize2 = "A brand new car";
        playerPrizesArray.add(prize2);

        String prize3 = "A lifetime supply of cereal";
        playerPrizesArray.add(prize3);

        String prize4 = "An all expenses paid trip to California";
        playerPrizesArray.add(prize4);

        String prize5 = "A new iphone";
        playerPrizesArray.add(prize5);

        String prize6 = "A beach house";
        playerPrizesArray.add(prize6);

        String prize7 = "One thousand dollars";
        playerPrizesArray.add(prize7);

        String prize8 = "An A in computer science";
        playerPrizesArray.add(prize8);

        String prize9 = "A brand new amazon echo show";
        playerPrizesArray.add(prize9);

        String prize10 = "A spot on Family Feud";
        playerPrizesArray.add(prize10);

    }

    /**
     * One player's turn in the game Spin wheel, pick a letter, choose to solve
     * puzzle if letter found
     *
     * @param player
     * @throws InterruptedException
     */
    private void playTurn(Player player) throws InterruptedException {
        try {

            int money = 0;

            //create a new scanner object
            Scanner sc = new Scanner(System.in);

            System.out.println(player.getName() + ", you have $" + player.getWinnings());

            System.out.println("Spin the wheel! <press enter>");
            sc.nextLine();

            System.out.println("<SPINNING>");

            Thread.sleep(200);

            Wheel.WedgeType type = wheel.spin();

            System.out.print("The wheel landed on: ");

            switch (type) {
                case MONEY:
                    money = wheel.getAmount();
                    System.out.println("$" + money);
                    break;

                case LOSE_TURN:
                    System.out.println("LOSE A TURN");
                    System.out.println("So sorry, you lose a turn.");
                    return; // doesn't get to guess letter

                case BANKRUPT:
                    System.out.println("BANKRUPT");
                    player.bankrupt();
                    return; // doesn't get to guess letter

                //Assignment 2 Part 5
                //add a wedge to the wheel for a prize
                case PRIZE:
                    //print out that they landed on prize
                    System.out.println("PRIZE");

                    //randomly select one of the prizes
                    listOfPrizes();

                    //generate a random number for the phrase to be chosen from
                    int randomNum = 0 + (int) (Math.random() * playerPrizesArray.size());

                    //pull the prize based on the random number chosen
                    //set the prize to the variable
                    String prize = playerPrizesArray.get(randomNum);

                    //announce what the player has won
                    System.out.println("Player" + player.getName() + " has won" + prize);

                    //add the prize  to the array
                    player.addPrize(prize);

                    break;

                default:

            }
            System.out.println("");
            System.out.println("Here is the puzzle:");

            showPuzzle();

            System.out.println();
            System.out.println(player.getName() + ", please guess a letter.");

            //String guess = sc.next();
            char letter = sc.next().charAt(0);

            if (!Character.isAlphabetic(letter)) {
                System.out.println("Sorry, but only alphabetic characters are allowed. You lose your turn.");
            } else {
                // search for letter to see if it is in
                int numFound = 0;

                //Assignment 2 Part 1A
                for (Letter l : letterPhraseArray) {
                    if ((l.getLetter() == letter) || (l.getLetter() == Character.toUpperCase(letter))) {
                        l.setFound();
                        numFound += 1;
                    }
                }
                if (numFound == 0) {
                    System.out.println("Sorry, but there are no " + letter + "'s.");
                } else {
                    if (numFound == 1) {
                        System.out.println("Congrats! There is 1 letter " + letter + ":");
                    } else {
                        System.out.println("Congrats! There are " + numFound + " letter " + letter + "'s:");
                    }
                    System.out.println();
                    showPuzzle();
                    System.out.println();
                    player.incrementScore(numFound * money);
                    System.out.println("You earned $" + (numFound * money) + ", and you now have: $" + player.getWinnings());

                    System.out.println("Would you like to try to solve the puzzle? (Y/N)");
                    letter = sc.next().charAt(0);
                    System.out.println();
                    if ((letter == 'Y') || (letter == 'y')) {
                        solvePuzzleAttempt(player);

                    }
                }
            }

        } catch (InterruptedException ie) {
            System.out.println("Oh no! there has been an error!");
            System.out.println(ie);
        } catch (Exception e) {
            System.out.println("Oh no! There has been an error!");
            System.out.println(e);

        }

    }

    /**
     * Logic for when user tries to solve the puzzle
     *
     * @param player
     */
    private void solvePuzzleAttempt(Player player) {

        if (player.getNumGuesses() >= 3) {
            System.out.println("Sorry, but you have used up all your guesses.");
            return;
        }
        try {
            player.incrementNumGuesses();
            System.out.println("What is your solution?");
            Scanner sc = new Scanner(System.in);
            sc.useDelimiter("\n");
            String guess = sc.next();
            if (guess.compareToIgnoreCase(phrase) == 0) {
                System.out.println("Congratulations! You guessed it!");
                puzzleSolved = true;
                // Round is over. Write message with final stats
                // TODO
            } else {
                System.out.println("Sorry, but that is not correct.");
            }

            //Assigment 2 Part 3E
            
            //print out the stats for each player at the end of each round
            //print out who won 
            //print out how much each player earned
            //loop through 
                for (int i = 0, j = 1; i < playerNumberArray.size(); i++, j++) {

                    System.out.println("Player" +j+ " You have" + player.getWinnings()+ "in winnings");
                    System.out.println("Player" + j + "You have" +player.getPrizes() + "in prizes");
                }
        } catch (Exception e) {
            System.out.println("Oh no! There has been an error!");
            System.out.println(e);

        }
    }

    /**
     * Display the puzzle on the console
     */
    private void showPuzzle() {
        System.out.print("\t\t");
        //Assignment 2 Part 1A
        for (Letter l : letterPhraseArray) {
            if (l.isSpace()) {
                System.out.print("   ");
            } else {
                if (l.isFound()) {
                    System.out.print(Character.toUpperCase(l.getLetter()) + " ");
                } else {
                    System.out.print(" _ ");
                }
            }
        }
        System.out.println();

    }

    /**
     * For a new game reset player's number of guesses to 0
     */
    public void reset() {
        player1.reset();
    }

}
