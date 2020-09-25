/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RussJessica_Assignment1_ITSC1213;

import BookClasses.*;
import java.io.*;
import java.nio.*;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import javax.swing.JFileChooser;

/**
 * This is the test harness for Assignment 1, and it is used to call and test
 * the audio poetry methods.
 *
 * @author Jessica russ
 */
public class Assignment1_ITIS1213 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        
        //TODO: change the path below to reflect the path to your mediasources file
        String path = "C:\\Users\\jessi\\OneDrive\\Desktop\\mediasources";

        //*********************************************************************
        // DO NOT CHANGE THE CODE BELOW
        int spliceIndex[] = new int[200];
        int numSplicePoints = 0;
        String soundFilename;
        String spliceFilename;

        // next two lines create a custom file chooser, with a specific frame heading
        JFileChooser myChooser = new JFileChooser(path);
        myChooser.setDialogTitle("Please select a sound file...");
        // now set media path to point to media sources
        FileChooser.setMediaPath(path);
        // open file chooser and get name of sound file
        soundFilename = FileChooser.pickPath(myChooser);
        // create a sound object from this filename
        Sound mySound = new Sound(soundFilename);

        // try to open the second file, which contains the list of splice points
        myChooser.setDialogTitle("Now select the file that contains the splice points...");
        spliceFilename = FileChooser.pickPath(myChooser);
        // open the file
        File file = new File(spliceFilename);
        // create a scanner object variable so we can read in the file, token by token
        Scanner s = null;
        // some of the code below could generate exceptions, so enclose in try-catch
        try {
            s = new Scanner(new BufferedReader(new FileReader(file)));
            // check if there is another token in the file
            while (s.hasNext()) {
                // check if it's a number
                if (s.hasNextInt()) {
                    // add it to the array, increment number of items in array
                    spliceIndex[numSplicePoints] = s.nextInt();
                    numSplicePoints++;
                } else {
                    // if it's not a number, skip it
                    s.next();
                }
            }

        } catch (FileNotFoundException fnfe) {
            System.out.println("main method: splicefile not found");
        } catch (InputMismatchException ime) {
            System.out.println("main method: splice input not integer");
        } catch (NoSuchElementException nsee) {
            System.out.println("main method: no such element after " + numSplicePoints);
        } finally {
            // this gets called no matter what, to close the scanner
            if (s != null) {
                s.close();
            }
        }

        // create an audiopoem object out of the sound and the splicearary
        AudioPoem myPoem = new AudioPoem(mySound, spliceIndex, numSplicePoints);

        // DO NOT CHANGE THE CODE ABOVE
        //**********************************************************
        //**********************************************************
        // TODO: Put your Assignment 1 test code to play the different AudioPoem methods here
        myPoem.play();
        
        //ASSIGNMENT 1 PART 1 TESTING FOR CODE CORRECTNESS
        
        //play the method play
        myPoem.play();
        //checked and plays "this is a test" as expected
        
        //pause for one second between invoking next method
        Thread.sleep(1000);
        
        //play the method play with parameter pause for 200 milliseconds
        myPoem.play(200);
        //checked
        
        //pause for one second between invoking next method
        Thread.sleep(1000);
        
        //play the method playDoublets with parameter 2 for the num doublets
        myPoem.playDoublets(2);
        //checked
        
        //pause for one second between invoking next method
        Thread.sleep(1000);
        
        //play the method play random order with parameter total words equal 
        //to 3 and the pause length to 200 milliseconds
        myPoem.playRandomOrder(3, 200);
        //checked
        
        //pause for one second between invoking next method
        Thread.sleep(1000);
        
        //play the method play random unique with parameter pause equal to 300
        myPoem.playRandomUnique(300);
        //checked
        
        //pause for one second between invoking next method
        Thread.sleep(1000);
        
        //play the method play reverse order with parameter pause equal to 250
        myPoem.playReverseOrder(250);
        //checked
        
        //pause for one second between invoking next method
        Thread.sleep(1000);
        
        //ASSIGNMENT 1 PART 2 CODE TESTING
        
        //play the method play with parameter pause for 200 milliseconds
        myPoem.play(200, "play", "C:\\Users\\jessi\\OneDrive\\Desktop\\mediasources");
        //checked
        
        //pause for one second between invoking next method
        Thread.sleep(1000);
        
        //play the method playDoublets with parameter 2 for the num doublets
        myPoem.playDoublets(2, "doublets", "C:\\Users\\jessi\\OneDrive\\Desktop\\mediasources");
        //checked
        
        //pause for one second between invoking next method
        Thread.sleep(1000);
        
        //play the method play random order with parameter total words equal 
        //to 3 and the pause length to 200 milliseconds
        myPoem.playRandomOrder(3, 200, "randomorder", "C:\\Users\\jessi\\OneDrive\\Desktop\\mediasources");
        //checked
        
        //pause for one second between invoking next method
        Thread.sleep(1000);
        
        //play the method play random unique with parameter pause equal to 300
        myPoem.playRandomUnique(300, "randomunique", "C:\\Users\\jessi\\OneDrive\\Desktop\\mediasources");
        //checked
        
        //pause for one second between invoking next method
        Thread.sleep(1000);
        
        //play the method play reverse order with parameter pause equal to 250
        myPoem.playReverseOrder(250, "reverseorder", "C:\\Users\\jessi\\OneDrive\\Desktop\\mediasources");
        //checked
        
        //pause for one second between invoking next method
        Thread.sleep(1000);
        
        
        
        
        //ASSIGNMENT 1 PART 3 CODE TESTING 
        
        //play the method play quadruplets with paremetner quad
        myPoem.playQuadruplets(2);
        //checked

    }
}
