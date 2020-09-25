/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringmanipulation;

import java.util.ArrayList;

/**
 *
 * @author nanajjar
 */
public class StringMethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Q1
        // String string1  = "The moon ";
        //string1.replace("oo", "78");
        //System.out.println(string1);
        
        //Q2
        //String string1 = "The moon ";
        //String string2 = string1.replace("oo", "78");
        //System.out.println(string2);
        
        //Q3
        //String string1 = "The moon ";
        //String string2 = "is half.";
        //System.out.println(string1+string2);
        
        //Q4
       //String string1 = "The moon ";
        //String string2 = "is half.";
        //System.out.println(string1.concat(string2));
        
        //Q5
        //String string1 = "The moon ";
        //String string2= "is half.";
        //System.out.println(string1.concat(string2));
        //System.out.println(string1);
        
        //Q6
        //String string1 = "The moon is made of bleu cheese.";
        //System.out.println(string1.substring(20));
        
        //Q7
        //String string1 = " Hello ";
        //System.out.println("*"+ string1.trim()+"*");
        
        //Q8
        //String string1 = "Hello";
        //System.out.println(string1.charAt(1));
        
        //Q9
        //String string1 = "Hello";
        //System.out.println(string1.toUpperCase());
        
        //Q10
        //String string1 = "Hello";
        //string1.toUpperCase();
        //System.out.println(string1);
        
        //Q11
        //String string1 = "A1B2C3";
        //if(Character.isLetter(string1.charAt(2)))
        //   System.out.println("Letter");
        //else
        //    System.out.println("Not Letter");
                
        //Q12
        //String string1 = "A1 B 2C 3";
        //if(Character.isWhitespace(string1.charAt(3)))
        //   System.out.println("Space");
        //else
        //    System.out.println("Not Space");

    }

    //tokenizing a String using the built-in split method
    public static String[] tokenizeWithSplit(String sentence, char delimiter) {
        //using split based on space
        String[] lineSplit = sentence.split(Character.toString(delimiter));

        return lineSplit;

    }

    //tokenize a String iterating through its characters
    public static String[] tokenize(String text, char delimiter) {
        String[] myTokens;// this array is used to store the tokenized words

        int index = 0;
        int numDelims = 0;

        //iterate(loop) through the String to count how many delimiters there
        //are to set the size of the array that will hold the tokens
        while (index < text.length()) {
            if (text.charAt(index) == delimiter) {
                numDelims++;
            }
            index++;
        }
        //intialize the array with the correct size
        //we add 1 since there might be a token after the last delimiter counted
        myTokens = new String[numDelims + 1];
        for (int i = 0; i < myTokens.length; i++) {
            myTokens[i] = "";
        }

        int numToken = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == delimiter) {
                numToken++;
            } else {
                myTokens[numToken] = myTokens[numToken] + text.charAt(i);
            }
        }

        return myTokens;
    }

    public char[] mergeStringArray(String[] words, char symbol) {
        //char array size
        int returnSize = 0;

        //iterate  
        for (int i = 0; i < words.length; i++) {
            returnSize = returnSize + words[i].length();
        }

        //add in the needed elements for the symbol we are adding
        //between each character
        returnSize = returnSize + words.length - 1;

        //now that we know the size we can create the array to hold/store 
        //the characters this method will return
        char[] mergedStringArray = new char[returnSize];

        //we need a counters
        int a = 0;

        //iterate through the array of Strings to iterate get each String 
        //element and extract the characters
        for (int j = 0; j < words.length; j++) {
            for (int x = 0; x < words[j].length(); x++) {
                mergedStringArray[a] = words[j].charAt(x);
                a++;
            }
            //add the symbol as long as this is not the last word
            if (j != words.length - 1) {
                mergedStringArray[a] = symbol;
            }
            //increament a 
            a++;
        }

        return mergedStringArray;

    }

    public ArrayList<String> startsWithVowel(String text) {
        //list to store words starting with vowel
        ArrayList<String> vowelList = new ArrayList();

        //split String into array of words
        //can also use the String class split() method
        String[] words = tokenize(text, ' ');

        //variable to store an all lower-case copy of word
        String lowerCase;

        for (String word : words) {
            //convert to lowercase
            lowerCase = word.toLowerCase();
            //check of if first character in word is a,e,i,o,u
            if (lowerCase.charAt(0) == 'a' || lowerCase.charAt(0) == 'e'
                    || lowerCase.charAt(0) == 'i' || lowerCase.charAt(0) == 'o'
                    || lowerCase.charAt(0) == 'u') {
                //word starts with vowel add to list
                vowelList.add(word);

            }
        }
        //return list
        return vowelList;
    }

    public ArrayList<ArrayList> vowelWordList(String text) {

        //create ArrayLists for each vowel words
        ArrayList<String> a_words = new ArrayList();
        ArrayList<String> e_words = new ArrayList();
        ArrayList<String> i_words = new ArrayList();
        ArrayList<String> o_words = new ArrayList();
        ArrayList<String> u_words = new ArrayList();

        //list to store inidividual lists of vowel words
        ArrayList<ArrayList> vowelList = new ArrayList();

        //split String into array of words
        //can also use the String class split() method
        String[] words = tokenize(text, ' ');

        //variable to store an all lower-case copy of word
        String lowerCase;

        for (String word : words) {
            //convert to lowercase
            lowerCase = word.toLowerCase();
            //check of if first character in word is a,e,i,o,u
            switch (lowerCase.charAt(0)) {
                case 'a':
                    a_words.add(word);
                    break;
                case 'e':
                    e_words.add(word);
                    break;
                case 'i':
                    i_words.add(word);
                    break;
                case 'o':
                    o_words.add(word);
                    break;
                case 'u':
                    u_words.add(word);
                    break;
                default:
                    break;
            }
        }

        //add individual lists to final list
        vowelList.add(a_words);
        vowelList.add(e_words);
        vowelList.add(i_words);
        vowelList.add(o_words);
        vowelList.add(u_words);

        //return list
        return vowelList;

    }
}
