package TicTacToeGame;

import java.util.Random;

//Jessica Russ
//Assignment 4
//April 2019

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author clatulip
 */
public class GameDataModel {

    //create a private player for player one
    private Player p1;

    //create a private player for player 2
    private Player p2;

    //create a private integer for the number of players and initialize it to zero
    private int numPlayers = 0;

    //create a private boolean for the status of game started and initialize it to false
    private boolean gameStarted = false;

    //create a private boolean for the status of the game over and initialize it to false
    private boolean gameOver = false;

    //create a private integer for the maximum number of rounds and initialize it to 12
    final private int MAX_ROUNDS = 12;

    //create a private integer for the number of rounds and initialize it to 0
    private int round = 0;

    //create a private boolean for two players
    private boolean twoPlayers;

    //create a private boolean for the game mode selected and initialize it to false
    private boolean gameModeSelected = false;

    //create a private boolean for if it is player ones turn
    private boolean p1Turn;

    //create a private win and initialize it to none
    private Win win = Win.NONE;

    //create a private integer for the turn counter and intialize it to zero
    private int turnCounter = 0;

   

    //create a private array for the game board
    private Token[] gameArray = new Token[9];

    /**
     * Method to get the maximum number of rounds to be played
     *
     * @return MAX_ROUNDS
     */
    public int getMAX_ROUNDS() {

        //return the number of maximum rounds
        return MAX_ROUNDS;
    }

    /**
     * Method to get the round number
     *
     * @return round
     */
    public int getRound() {

        //return the current round number      
        return round;
    }

    /**
     * Method to set the round number
     *
     * @param round
     */
    public void setRound(int round) {

        //if the number of rounds is less than the number of maximum rounds
        if (round <= MAX_ROUNDS) {

            //set the round number to the parameter passed in
            this.round = round;
        }
    }

    /**
     * Method to get player 1
     *
     * @return p1
     */
    public Player getP1() {

        //return player 1
        return p1;
    }

    /**
     * Method to set the first player
     *
     * @param p1
     */
    public void setP1(Player p1) {

        //set the player 1 to the parameter p1
        this.p1 = p1;
    }

    /**
     * Method to get the second player
     */
    public Player getP2() {

        //get the value of player 2
        return p2;
    }

    /**
     * Method to set the second player
     *
     * @param p2
     */
    public void setP2(Player p2) {

        //set the value of player 2 to the parameter p2
        this.p2 = p2;
    }

    /**
     * Method to check if the game is started
     *
     * @return gameStarted
     */
    public boolean isGameStarted() {

        //return the value of game started aka a boolean
        return gameStarted;
    }

    /**
     * Method to set if the game is started
     *
     * @param gameStarted
     */
    public void setGameStarted(boolean gameStarted) {

        //set the game started value using the passed in boolean parameter
        this.gameStarted = gameStarted;
    }

    /**
     *
     * Method to check to see if the game is over
     *
     * @return gameOver
     */
    public boolean isGameOver() {

        //get the value of the game over variable
        return gameOver;
    }

    /**
     * Method to set that the game is over
     *
     * @param gameOver
     */
    public void setGameOver(boolean gameOver) {

        //set the value of game over using the boolean parameter passed in
        this.gameOver = gameOver;
    }

    /**
     * Method to check if the game selection is 2 players
     *
     * @return
     */
    public boolean isTwoPlayers() {

        //return the boolean value of two players 
        return twoPlayers;
    }

    /**
     * Method to set that the game is 2 players
     *
     * @param twoPlayers
     */
    public void setTwoPlayers(boolean twoPlayers) {

        //set the boolean of two players using the parameter
        this.twoPlayers = twoPlayers;

        //set the game mode selected because they chose two players
        this.gameModeSelected = true;
    }

    /**
     * Method to add a new player to the game
     *
     * @param name
     */
    void addNewPlayer(String name) {

        //if the current number of players is zero
        if (numPlayers == 0) {

            //add a new player with their name
            p1 = new Player(name);

            //increment the number of players by 1
            numPlayers += 1;

            //if the current number if players is one
        } else if (numPlayers == 1) {

            //add a second player with their name
            p2 = new Player(name);

            //incremement the number of players by 1
            numPlayers += 1;

            //if the number of current players is neither 0 or 1
        } else {

            //print out the statement
            System.out.println("Shouldn't get here - trying to add more than one player");
        }
    }

    /**
     * Method to check if the game is ready to play
     *
     * @return ready
     */
    public boolean isGameReady() {

        // check to see if players have been set up
        //initialize the boolean ready to false
        boolean ready = false;

        //if there arent two players
        if (twoPlayers == false) {

            //if the first player has been chosen
            if (p1 != null) {

                //set the second player to the computer
                p2 = new Player("Computer");

                //increment the number of players in the game
                numPlayers++;

                //set game ready to true
                ready = true;
            }
            //if both player names have been typed
        } else {
            if ((p1 != null) && (p2 != null)) {

                //set game ready to true
                ready = true;
            }
        }

        //return the value of ready
        return ready;
    }

    /**
     * Method to select game mode
     *
     * @return
     */
    public boolean selectedGameMode() {

        //return the game mode selected
        return gameModeSelected;
    }

    /**
     * Method to start the game
     */
    public void startGame() {

        //initialize game started to true
        gameStarted = true;

        //start a new round
        startNewRound();
    }

    /**
     * Method to start a new round
     */
    public void startNewRound() {

        //increment the round number at the start of a new round
        round++;

        //initialize the game over status to false
        gameOver = false;

        //set it to player ones turn first
        p1Turn = true;

        //set the win status to one
        win = Win.NONE;

        //start the counter at 0 in a new round
        turnCounter = 0;

        //if there are two players
        if (twoPlayers) {

            //randomize which player goes first
            double temp = Math.random();
            if (temp > 0.5) {
                p1Turn = false;
                System.out.println("P2 goes first.");
            } else {
                System.out.println("P1 goes first");
            }
        }

        //set all of the tokens in the game array to blank
        for (int i = 0; i < 9; i++) {
            gameArray[i] = Token.Blank;
        }

        //create a new game board
        GameBoard myGameBoard = new GameBoard(this);

        //set the game board to visible
        myGameBoard.setVisible(true);
    }

    /**
     * Method to change the token based on the index passed in
     *
     * @param index
     * @return boolean
     */
    public boolean changeToken(int index) {
        // make sure this space is blank, if not return
                    
        if (gameArray[index] != Token.Blank) {
            System.out.println("Space is already used");
            return false;
        }

        // get token for player
        Token t;

        //if it is player ones turn
        if (p1Turn) {

            //set the token to x
            t = Token.X;

            //if it is not player ones turn
        } else {

            //set the token to o
            t = Token.O;
        }

        // set token at index
        gameArray[index] = t;

        //print out that the token is changing
        System.out.println("changes token");

        //increment the turn counter 
        turnCounter++;

        //print out what turn it is 
        System.out.println("Turn " + turnCounter);

        //if the game isnt won by the ninth turn
        if (turnCounter == 9) {

            //set the win value to none
            win = Win.NONE;

            //print out that the game is tie and no one won
            System.out.println("Its a tie");

            //set the game over value to true
            gameOver = true;

        }

        // see if won, if so, game is over and return true
        if (checkForWin(index)) {

            //print out that someone won
            System.out.println("Wins!");

            //set the game over value to true
            gameOver = true;

            //return the value true
            return true;

        }

        //change turns
        p1Turn = !p1Turn;

        //return the value true
        return true;
    }

    /**
     * Method to check if a space is black at a current index
     *
     * @param index
     * @return boolean
     */
    public boolean isSpaceBlank(int index) {

        //if the token at the game index is blank
        if (gameArray[index] == Token.Blank) {

            //return that the space is blank
            return true;

            //if the token at the game index is not blank
        } else {

            //return false meaning the space is taken
            return false;
        }
    }

    /**
     * Method to see if it is player ones turn
     *
     * @return p1Turn
     */
    public boolean isP1Turn() {

        //return the boolean of if it is player ones turn
        return p1Turn;
    }

    /**
     * Method to check for a win based on the index passed in
     *
     * @param index
     * @return over
     */
    public boolean checkForWin(int index) {

        //set the over value to false
        boolean over = false;

        //TO DO: check to see if there is a winner. If so, set win field and return true; otherwise, return false
        // Check that newly added token is in top left,
        // then compare the row/column
        // change the win field, part of the enum***
        //switch statement based on the passed in index
        switch (index) {

            //if the index passed in is 0
            //aka top left
            case 0:

                //if there are the same token in spaces 0, 1, and 2
                //aka top row of game
                if (gameArray[index] == gameArray[index + 1] && gameArray[index] == gameArray[index + 2]) {

                    //set the over value to true since the game is won
                    over = true;

                    //set the win value to top row
                    win = Win.TOP_ROW;

                } //handles win for top row
                //if there are the same token in spaces 0, 3, and 6
                //aka left col
                else if (gameArray[index] == gameArray[index + 3] && gameArray[index] == gameArray[index + 6]) {

                    //set the over value to true since the game is won
                    over = true;

                    //set the win value to the left col
                    win = Win.LEFT_COL;

                }//handles win for left col
                //if there are the same token in spaces 0, 4, and 8
                else if (gameArray[index] == gameArray[index + 4] && gameArray[index] == gameArray[index + 8]) {

                    //set the over value to true since the game is won
                    over = true;

                    //set the win value to diag 1 (top left to bottom right)
                    win = Win.DIAG1;

                }//handles win for diag 1
                break;

            //if the index passed in is 1
            // aka top middle
            case 1:

                //if there are the same tokens in spaces 1, 0, and 2
                if (gameArray[index] == gameArray[index - 1] && gameArray[index] == gameArray[index + 1]) {

                    //set the over value to true since the game is won
                    over = true;

                    //set the win value to the top row
                    win = Win.TOP_ROW;

                }//handles win for top row
                //if there are the same tokens in spaces 1, 4, and 7
                else if (gameArray[index] == gameArray[index + 3] && gameArray[index] == gameArray[index + 6]) {

                    //set the over value to true since the game is won
                    over = true;

                    //set the win value to the mid col
                    win = Win.MID_COL;

                }//handles win for mid col
                break;

            //if the index passed in is 2
            //aka top right
            case 2:

                //if there are the same tokens in spaces 2, 1, and 0
                if (gameArray[index] == gameArray[index - 1] && gameArray[index] == gameArray[index - 2]) {

                    //set the over value to true since the game is won
                    over = true;

                    //set the win value to the top row
                    win = Win.TOP_ROW;

                }// handles win for top row
                //if there are the same tokens in the spaces 2, 5, and 8
                else if (gameArray[index] == gameArray[index + 3] && gameArray[index] == gameArray[index + 6]) {

                    //set the over value to true since the game is won
                    over = true;

                    //set the win value to the right col
                    win = Win.RIGHT_COL;

                }//handles win for right col
                //if there are the same tokens in the spaces 2, 4, and 6
                else if (gameArray[index] == gameArray[index + 2] && gameArray[index] == gameArray[index + 4]) {

                    //set the over value to true since the game is won
                    over = true;

                    //set the win value to the diag 2(top right to bottom left)
                    win = Win.DIAG2;

                }//handles win for diag 2
                break;

            //if the index passed in is 3
            //aka middle left
            case 3:

                //if there are the same token sin the spaces 3, 4, 5
                if (gameArray[index] == gameArray[index + 1] && gameArray[index] == gameArray[index + 2]) {

                    //set the over value to true since the game is won
                    over = true;

                    //set the win value to the mid row
                    win = Win.MID_ROW;

                }//handles win for mid row
                //if there are the same tokens in the spaces 3, 0, and 6
                else if (gameArray[index] == gameArray[index - 3] && gameArray[index] == gameArray[index + 3]) {

                    //set the over value to true since the game is won
                    over = true;

                    //set the win value to the left col
                    win = Win.LEFT_COL;

                }//hanldes win for left col
                break;

            //if the index passed in is 4
            //aka center
            case 4:

                //if there are the same tokens in the spaces 4, 3, and 5
                if (gameArray[index] == gameArray[index - 1] && gameArray[index] == gameArray[index + 1]) {

                    //set the over value to true since the game is won
                    over = true;

                    //set the win value to the mid row
                    win = Win.MID_ROW;

                }//handles win for mid row
                //if there are the same tokens in the spaces 4, 1, and 7
                else if (gameArray[index] == gameArray[index - 3] && gameArray[index] == gameArray[index + 3]) {

                    //set the over value to true since the game is won
                    over = true;

                    //set the win value to the mid col
                    win = Win.MID_COL;

                }//handles win for mid col
                //if there are the same tokens in the spaces 4, 2, and 6
                else if (gameArray[index] == gameArray[index - 2] && gameArray[index] == gameArray[index + 2]) {

                    //set the over value to true since the game is won
                    over = true;

                    //set the win value to the diag 2 (top right to bottom left)
                    win = Win.DIAG2;

                }//handles win for diag 2
                //if there are the same tokens in the spaces 4, 0, and 8
                else if (gameArray[index] == gameArray[index - 4] && gameArray[index] == gameArray[index + 4]) {

                    //set the over value to true since the game is won
                    over = true;

                    //set the win value to the diag 1(top left to bottom right)
                    win = Win.DIAG1;

                }// handles win for diag 1
                break;

            //if the index passed in is 5
            //aka middle right
            case 5:

                //if there are the same tokens in the spaces 5, 3, and 4
                if (gameArray[index] == gameArray[index - 2] && gameArray[index] == gameArray[index - 1]) {

                    //set the over value to true since the game is won
                    over = true;

                    //set the win value to the mid row
                    win = Win.MID_ROW;

                }//handles win for mid row
                //if there are the same tokens in the spaces 5, 2, and 8
                else if (gameArray[index] == gameArray[index - 3] && gameArray[index] == gameArray[index + 3]) {

                    //set the over value to true since the game is won
                    over = true;

                    //set the win value to the right col
                    win = Win.RIGHT_COL;

                }//handles win for right cal

                break;

            ///if the index passed in is 6
            //aka bottom left
            case 6:

                //if there are the same tokens in the spaces 6, 7, 8
                if (gameArray[index] == gameArray[index + 1] && gameArray[index] == gameArray[index + 2]) {

                    //set the over value to true since the game is won
                    over = true;

                    //set the win value to the bot row
                    win = Win.BOT_ROW;
                }//handles win for bot row
                //if there are the same tokens in the spaces 6, 0, and 3
                else if (gameArray[index] == gameArray[index - 6] && gameArray[index] == gameArray[index - 3]) {

                    //set the over value to true since the game is won
                    over = true;

                    //set the win value to the left col
                    win = Win.LEFT_COL;

                }//handles win for left col
                //if there are the same tokens in the spaces 6, 2, and 4
                else if (gameArray[index] == gameArray[index - 4] && gameArray[index] == gameArray[index - 2]) {

                    //set the over value to true since the game is won
                    over = true;

                    //set the win value to the diag 2 (top right to bottom left)
                    win = Win.DIAG2;

                }//handles win for diag 2
                break;

            //if the index passed in is 7
            //aka bottom middle
            case 7:

                //if there are the same tokens in spaces 7, 6, 8
                if (gameArray[index] == gameArray[index - 1] && gameArray[index] == gameArray[index + 1]) {

                    //set the over value to true since the game is won
                    over = true;

                    //set the win value to the bot row
                    win = Win.BOT_ROW;

                }//handles bot row
                //if there are the same tokens in spaces 7, 1, and 4
                else if (gameArray[index] == gameArray[index - 6] && gameArray[index] == gameArray[index - 3]) {

                    //set the over value to true since the game is won
                    over = true;

                    //set the win value to the mid col
                    win = Win.MID_COL;

                }//handles win for mid col
                break;

            //if the index passed in is 8
            //aka bottom right
            case 8:

                //if there are the same tokens in spaces 8, 6, and 7
                if (gameArray[index] == gameArray[index - 2] && gameArray[index] == gameArray[index - 1]) {

                    //set the over value to true since the game is won
                    over = true;

                    //set the win value to the bot row
                    win = Win.BOT_ROW;

                }//handles win for bot row
                //if there are the same tokens in spaces 8, 5, and 2
                else if (gameArray[index] == gameArray[index - 3] && gameArray[index] == gameArray[index - 6]) {

                    //set the over value to true since the game is won
                    over = true;

                    //set the win value to the right col
                    win = Win.RIGHT_COL;

                }//handles win for right col
                //if there are the same tokens in spaces 8, 4, and 0
                else if (gameArray[index] == gameArray[index - 4] && gameArray[index] == gameArray[index - 8]) {

                    //set the over value to true since the game is won
                    over = true;

                    //set the win value to the diag 1 (top left to bot right)
                    win = Win.DIAG1;

                }//handle win for diag 1
                break;

            //default of switch statement
            default:

                //set over to false
                over = false;

                //set the win to none
                win = Win.NONE;
                break;

        }

        //return the status of over
        return over;

    }

    /**
     * Method to get the turn count
     *
     * @return turnCounter
     */
    public int getTurnCounter() {

        //return the value of the turn counter
        return turnCounter;
    }

    /**
     * Method to get the the token based on the index
     *
     * @param i
     * @return gameArray[i]
     */
    Token getToken(int i) {

        //return the token value
        return gameArray[i];
    }

    /**
     * Method to get the win status
     *
     * @return win
     */
    public Win getWin() {

        //return the win status
        return win;
    }

    
    

}

/**
 * Enum class for Token values
 *
 * @author jessi
 */
enum Token {
    X, O, Blank
};

/**
 * Enum class for Win values
 *
 * @author jessi
 */
enum Win {
    NONE, TOP_ROW, MID_ROW, BOT_ROW, LEFT_COL, MID_COL, RIGHT_COL, DIAG1, DIAG2
};
