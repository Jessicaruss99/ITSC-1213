/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringmanipulation;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nanajjar
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //use input from the user to test out methods 
        Scanner scnr = new Scanner(System.in); //create a Scanner object        

        String message = ""; //create a String variable and intilaize it
        char delimiter; //create a char variable 

        //display message to the user to ask for input
        System.out.println("Enter a sentence to be tokenized: ");
        message = scnr.nextLine();//read input from user
        System.out.println("Enter a single character as a delimiter: ");
        delimiter = scnr.nextLine().charAt(0); //read the input from the user

        StringMethods methodObj = new StringMethods();//create an object of our StringMethods class

        //Tokenize the String the user enterd by ccalline the tokenize method and 
        //passing in the text the user enterd and the delimeter character as the
        //arguments to that method
        String[] myTokens = methodObj.tokenize(message, delimiter);
        //print out the result
        System.out.println("\nThe result of tokenizing this text is:");
        for (int i = 0; i < myTokens.length; i++) {
            System.out.println(myTokens[i]);
        }

        //convert the array of Strings into an array of characters add a hyphen
        //between the characters of any two differnent Strings
        delimiter = '-';
        char[] myChars = methodObj.mergeStringArray(myTokens, delimiter);
        //print out the result
        System.out.println("\nThe result of using mergeStringArray this text is:");
        for (int i = 0; i < myChars.length; i++) {
            System.out.println(myChars[i]);
        }

        //convert the character array to a String
        String reString = new String(myChars);
        //should print out the original text the user printed with hyphens between words
        System.out.println("\nThe result of converting the array of characters from the mergeStringAray with a - delimiter to a String:");
        System.out.println(reString);

        //we don't want hyphens, we need space. Lets try this again!
        myChars = methodObj.mergeStringArray(myTokens, ' ');
        reString = new String(myChars);
        System.out.println("\nThe result of converting the array of characters from the mergeStringAray with a space delimiter to a String:");
        System.out.println(reString);

        //extract the words that start with a,e,i,o, u
        ArrayList<String> vowels = methodObj.startsWithVowel(reString);
        System.out.println("\nThe words that start with vowels:");
        //print out using enhanced for loop on one line with a space in between
        for (String vowelWord : vowels) {
            System.out.print(vowelWord + " ");
        }

        //extract the words that start with a,e,i,o, u and seprate into indiviual lists 
        ArrayList<ArrayList> vowelLists = methodObj.vowelWordList(reString);
        System.out.println("\nThe words that start with vowels sepearted:");
        //print out without using iteration 
        //add a new line since last print out did not use new line (println)
        System.out.println("\n" + vowelLists);
    }
}
