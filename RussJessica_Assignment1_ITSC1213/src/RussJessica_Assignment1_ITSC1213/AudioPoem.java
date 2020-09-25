/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RussJessica_Assignment1_ITSC1213;

import BookClasses.FileChooser;
import BookClasses.Sound;
import BookClasses.SoundException;
import BookClasses.SoundSample;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class contains methods for mixing up the words in an audio file and
 * creating sound poetry out of them. It contains many stub methods which need
 * to be completed as part of Assignment 1.
 *
 * @author Jessica Russ
 */
public class AudioPoem {

    static final int MAX_NUM_WORDS = 100;
    static private Sound[] myWordArray = new Sound[MAX_NUM_WORDS];

    static private int numWords = 0;

    public AudioPoem(Sound originalSource, int[] spliceArray, int numSplicePoints) {

        // break the sound into sepearate words, copying each into the word array
        for (int i = 0, j = 0; i < numSplicePoints; i = i + 2, j++) {
            myWordArray[j] = new Sound(spliceArray[i + 1] - spliceArray[i]);
            for (int x = spliceArray[i], y = 0; x < spliceArray[i + 1]; x++, y++) {
                myWordArray[j].setSampleValueAt(y, originalSource.getSampleValueAt(x));
            }
            numWords++;
        }

    }
//ASSIGNMENT 1 PART 1
    /**
     * Plays the words, in order with a 200 millisecond pause between each
     *
     * @throws InterruptedException
     */
    public void play() throws InterruptedException {
        // play the words in order
        for (int i = 0; i < numWords; i++) {
            myWordArray[i].blockingPlay();
            Thread.sleep(200);
        }
    }

    /**
     * Plays the words, in order with a parameter-specified pause between each
     *
     * @param pause the number of milliseconds to pause between words
     * @throws InterruptedException
     */
    public void play(int pause) throws InterruptedException {
        // play the words in order with a specified millisecond pause
        for(int i=0; i<numWords; i++){
            myWordArray[i].blockingPlay();
            Thread.sleep(pause);
}
    }

    /**
     * Plays the words in random order, each word can be played multiple times
     *
     * @param totalWords the total number of words that will be played
     * @param pause the number of milliseconds to pause between words
     * @throws InterruptedException
     */
    public void playRandomOrder(int totalWords, int pause) throws InterruptedException {
        //create a for loop to go through the words
        for( int i =0; i<totalWords; i++){
            //repeat through words
            
            //create a random number that is within the amount of number of words
            int randNum =(int)(Math.random()*numWords);
            
            //print out the random number
            System.out.println(randNum);
            
            //play the word
            myWordArray[randNum].blockingPlay();
            
            //pause for param pause
            Thread.sleep(pause);
        }
    }

    /**
     * Plays the words in random order, playing each word only once
     *
     * @param pause the number of milliseconds to pause between words
     * @throws InterruptedException
     */
    public void playRandomUnique(int pause) throws InterruptedException {
        //make an int array to hold the numbers
        int randomNumArray[]= new int[numWords];
        
        //create a random unique list
        for (int i =0; i<numWords;i++){
            randomNumArray[i] =(int)(Math.random()*numWords);
            
            //loop through to make sure it isnt the same
            for(int j= 0; j<i; j++){
                if(randomNumArray[i]==randomNumArray[j]){
                    i--;
                    break;
                }
            }
        }
        
        //play the words in the random unique order with pause parameter
        for( int i=0; i<numWords; i++){
            int num = randomNumArray[i];
            System.out.println(num);
            myWordArray[num].blockingPlay();
            Thread.sleep(pause);
        }
    }

    /**
     * Plays the sound words in reverse order (e.g. 'this is a test' will be
     * played 'test a is this')
     *
     * @param pause the number of milliseconds to pause between words
     * @throws InterruptedException
     */
    public void playReverseOrder(int pause) throws InterruptedException {

        //create an int array to hold the number of given words
        int numArray[] = new int[numWords];
        
        //set up the left to be equal to 0
        int left =0;
        
        //set up the right be the length of the array minus 1
        int right = numArray.length -1;
        
        //put the numbers in the array
        for (int i =0; i<numWords ;i++){
            //print out the number
            System.out.println(i);
            
            //set the number in the array to the number 
            numArray[i]=i;
        }
        
        //reorder the numbers from greatest to smallest
        while (left<right){
            //switch the values for left and right 
            int newNum = numArray[left];
            
            numArray[left]=numArray[right];
            
            numArray[right]=newNum;
            
            //increment the left side
            left++;
            
            //decrement the right side
            right--;
        }
        //play the words in the new reversed order
        for (int i=0; i<numWords;i++){
            int num = numArray[i];
            
            //print out num
            System.out.println(num);
            
            myWordArray[num].blockingPlay();
            
            //pause for parameter number pause
            Thread.sleep(pause);
        }
    }

    /**
     * Plays random pairs of consecutive words with only a 100 millisecond pause
     * between them, with a four hundred millisecond pause between pairs Ex: for
     * 'this is a test' a pair would only be 'this is' or 'is a' or 'a test'
     *
     * @param numDoublets the number of doublets to play
     * @throws InterruptedException
     */
    public void playDoublets(int numDoublets) throws InterruptedException {
        for(int i =0; i<numDoublets;i++){
            //want to generate a random number within the number of words
            int randNum = (int)(Math.random()*(numWords-1));
            
            //play first part of pair
            myWordArray[randNum].blockingPlay();
            
            //print out the random number
            System.out.println(randNum);
            
            //100 milisecond pause
            Thread.sleep(100);
            
            //play second part of pair
            myWordArray[randNum+1].blockingPlay();
            
            //print out the random number plus one
            System.out.println(randNum+1);
            
            //400 millisecond pause between pairs
            Thread.sleep(400);
        }
    }
    
    
    
    
    //ASSIGNMENT 1 PART 2
    
    //create the number of silent samples
    private static int calculateNumberofSilentSamples(Sound sound, int pause){
        int numSilentSamples = (int)(pause/1000*(sound.getSamplingRate()));
        
        //return the calculation of number of silent samples
        return numSilentSamples;
    }
    
    //method to write the sound to a file
    private static void writeSoundToFile(String path, String filename, Sound newSound){
        //set up the path to where the files are
        FileChooser.setMediaPath(path);
        
        //open up the sound
        Sound sound1 = new Sound(filename);
        
        //explore the sound
        sound1.explore();
        
        //print out the filename
        System.out.println(sound1.getFileName());
        
        //create the path and filename
        sound1.write(path+filename);
    }
    
    /**
     * Plays the words, in order with a parameter-specified pause between each and writes the resulting sound out to a file
     * @param pause the number of milliseconds to pause between words
     * @param filename the name of the file to write
     * @param path the path where the file should be written
     * @throws InterruptedException
     */
    public void play(int pause, String filename, String path) throws InterruptedException {
        //initialize the counter for the total number of sound samples
        int totalSoundSamples =0;
        
        //initialize the counter for the number of pauses 
        int pauseNumSamples= (int)(pause/1000.0*(myWordArray[0].getSamplingRate()));
        System.out.println("Calculate the number of samples we need to pause for");
        
        //print out the number of pauses
        System.out.println(pauseNumSamples);
        
        //print out the total number of samples
        System.out.println("Total number of samples:");
        
        //use a for loop to get the number of samples for each piece
        for(int i= 0; i<numWords; i++){
            totalSoundSamples = (totalSoundSamples+myWordArray[i].getNumSamples());
            
            //print out this number
            //System.out.println(totalSoundSamples);
            
            //get the number of the silent samples based on the pauses
            totalSoundSamples = totalSoundSamples +pauseNumSamples;
            
            //print out number of total samples
            System.out.println(totalSoundSamples);
        }
        
        //create a new sound
        Sound newSound = new Sound (totalSoundSamples);
        
        //create a new array to hold the samples 
        SoundSample[] sampleArray =newSound.getSamples();
        SoundSample[] newArray;
        int newIndex=0;
        
        SoundSample sample =null;
        
        for(int i=0; i<numWords;i++){
            myWordArray[i].blockingPlay();
            
            newArray = myWordArray[i].getSamples();
            
        }
        // play the words in order with a specified millisecond pause
        for(int i=0; i<numWords; i++){
            myWordArray[i].blockingPlay();
            Thread.sleep(pause);
            }
        this.writeSoundToFile(path, filename, newSound);
    }
    
    
     /**
     *Plays random pairs of consecutive words with only a 100 millisecond pause
     * between them, with a four hundred millisecond pause between pairs
     * and writes the resulting sound out to a file
     * @param numDoublets the number of doublets to play
     * @param filename the name of the file to write
     * @param path the path where the file should be written
     * @throws InterruptedException
     */
    public void playDoublets(int numDoublets, String filename, String path) throws InterruptedException {
         //initialize the counter for the total number of sound samples
        int totalSoundSamples =0;
        
        //create a new sound
        Sound newSound = new Sound (totalSoundSamples);
        
        //create a new array to hold the samples 
        SoundSample[] sampleArray =newSound.getSamples();
        SoundSample[] newArray;
        int newIndex=0;
        
        SoundSample sample =null;
        
        for(int i=0; i<numWords;i++){
            myWordArray[i].blockingPlay();
            
            newArray = myWordArray[i].getSamples();
            
            
        }

        for(int i =0; i<numDoublets;i++){
            //want to generate a random number within the number of words
            int randNum = (int)(Math.random()*(numWords-1));
            
            //play first part of pair
            myWordArray[randNum].blockingPlay();
            
            //print out the random number
            System.out.println(randNum);
            
            //100 milisecond pause
            Thread.sleep(100);
            
            //play second part of pair
            myWordArray[randNum+1].blockingPlay();
            
            //print out the random number plus one
            System.out.println(randNum+1);
            
            //400 millisecond pause between pairs
            Thread.sleep(400);
        }
         this.writeSoundToFile(path, filename, newSound);

    }
    
    /**
     *Plays the words in random order, each word can be played multiple times
     * and writes the resulting sound out to a file
     * @param totalWords the total number of words that will be played
     * @param pause the number of milliseconds to pause between words
     * @param filename the name of the file to write
     * @param path the path where the file should be written
     * @throws InterruptedException
     */
    public void playRandomOrder(int totalWords, int pause,String filename, String path) throws InterruptedException {
        //initialize the counter for the total number of sound samples
        int totalSoundSamples =0;
        
        //create a new sound
        Sound newSound = new Sound (totalSoundSamples);
        
        //create a new array to hold the samples 
        SoundSample[] sampleArray =newSound.getSamples();
        SoundSample[] newArray;
        int newIndex=0;
        
        SoundSample sample =null;
        
        for(int i=0; i<numWords;i++){
            myWordArray[i].blockingPlay();
            
            newArray = myWordArray[i].getSamples();
            
            
        }

        //initialize the counter for the number of pauses 
        int numSilentSamples = this.calculateNumberofSilentSamples(newSound, pause);
        
        //use a for loop to get the number of samples for each piece
        for(int i= 0; i<numWords; i++){
            totalSoundSamples = (totalSoundSamples+myWordArray[i].getNumSamples());
            
            //print out this number
            //System.out.println(totalSoundSamples);
            
            //get the number of the silent samples based on the pauses
            totalSoundSamples = totalSoundSamples +numSilentSamples;
            
            //print out number of total samples
            System.out.println(totalSoundSamples);
        }

        
        //create a for loop to go through the words
        for( int i =0; i<totalWords; i++){
            //repeat through words
            
            //create a random number that is within the amount of number of words
            int randNum =(int)(Math.random()*numWords);
            
            //print out the random number
            System.out.println(randNum);
            
            //play the word
            myWordArray[randNum].blockingPlay();
            
            //pause for param pause
            Thread.sleep(pause);
        }
        this.writeSoundToFile(path, filename, newSound);

    }
    
     /**
     *Plays the words in random order, playing each word only once
     * and writes the resulting sound out to a file
     * @param pause the number of milliseconds to pause between words
     * @param filename the name of the file to write
     * @param path the path where the file should be written
     * @throws InterruptedException
     */
    public void playRandomUnique( int pause,String filename, String path) throws InterruptedException {
        //initialize the counter for the total number of sound samples
        int totalSoundSamples =0;
        
        //create a new sound
        Sound newSound = new Sound (totalSoundSamples);
        
        //create a new array to hold the samples 
        SoundSample[] sampleArray =newSound.getSamples();
        SoundSample[] newArray;
        int newIndex=0;
        
        SoundSample sample =null;
        
        for(int i=0; i<numWords;i++){
            myWordArray[i].blockingPlay();
            
            newArray = myWordArray[i].getSamples();
            
            
        }

        //initialize the counter for the number of pauses 
        int numSilentSamples =this.calculateNumberofSilentSamples(newSound, pause);
        
        //use a for loop to get the number of samples for each piece
        for(int i= 0; i<numWords; i++){
            totalSoundSamples = (totalSoundSamples+myWordArray[i].getNumSamples());
            
            //print out this number
            //System.out.println(totalSoundSamples);
            
            //get the number of the silent samples based on the pauses
            totalSoundSamples = totalSoundSamples +numSilentSamples;
            
            //print out number of total samples
            System.out.println(totalSoundSamples);
        }

        //make an int array to hold the numbers
        int randomNumArray[]= new int[numWords];
        
        //create a random unique list
        for (int i =0; i<numWords;i++){
            randomNumArray[i] =(int)(Math.random()*numWords);
            
            //loop through to make sure it isnt the same
            for(int j= 0; j<i; j++){
                if(randomNumArray[i]==randomNumArray[j]){
                    i--;
                    break;
                }
            }
        }
        
        //play the words in the random unique order with pause parameter
        for( int i=0; i<numWords; i++){
            int num = randomNumArray[i];
            System.out.println(num);
            myWordArray[num].blockingPlay();
            Thread.sleep(pause);
        }
        this.writeSoundToFile(path, filename, newSound);

    }
    
    /**
     *Plays the sound words in reverse order
     * and writes the resulting sound out to a file
     * @param pause the number of milliseconds to pause between words
     * @param filename the name of the file to write
     * @param path the path where the file should be written
     * @throws InterruptedException
     */
    public void playReverseOrder( int pause,String filename, String path) throws InterruptedException {
       //initialize the counter for the total number of sound samples
        int totalSoundSamples =0;
        
        //create a new sound
        Sound newSound = new Sound (totalSoundSamples);
        
        //create a new array to hold the samples 
        SoundSample[] sampleArray =newSound.getSamples();
        SoundSample[] newArray;
        int newIndex=0;
        
        SoundSample sample =null;
        
        for(int i=0; i<numWords;i++){
            myWordArray[i].blockingPlay();
            
            newArray = myWordArray[i].getSamples();
            
            
        }

        //initialize the counter for the number of pauses 
        int numSilentSamples =this.calculateNumberofSilentSamples(newSound, pause);

        //use a for loop to get the number of samples for each piece
        for(int i= 0; i<numWords; i++){
            totalSoundSamples = (totalSoundSamples+myWordArray[i].getNumSamples());
            
            //print out this number
            //System.out.println(totalSoundSamples);
            
            //get the number of the silent samples based on the pauses
            totalSoundSamples = totalSoundSamples +numSilentSamples;
            
            //print out number of total samples
            System.out.println(totalSoundSamples);
        }

 
        //create an int array to hold the number of given words
        int numArray[] = new int[numWords];
        
        //set up the left to be equal to 0
        int left =0;
        
        //set up the right be the length of the array minus 1
        int right = numArray.length -1;
        
        //put the numbers in the array
        for (int i =0; i<numWords ;i++){
            //print out the number
            System.out.println(i);
            
            //set the number in the array to the number 
            numArray[i]=i;
        }
        
        //reorder the numbers from greatest to smallest
        while (left<right){
            //switch the values for left and right 
            int newNum = numArray[left];
            
            numArray[left]=numArray[right];
            
            numArray[right]=newNum;
            
            //increment the left side
            left++;
            
            //decrement the right side
            right--;
        }
        //play the words in the new reversed order
        for (int i=0; i<numWords;i++){
            int num = numArray[i];
            
            //print out num
            System.out.println(num);
            
            myWordArray[num].blockingPlay();
            
            //pause for parameter number pause
            Thread.sleep(pause);
        }
        this.writeSoundToFile(path, filename, newSound);

    }
    
    
    
    
    //ASSIGNMENT 1 PART 3
     /**
     * Plays random pairs of 4 of consecutive words with only a 100 millisecond pause
     * between them, with a four hundred millisecond pause between pairs 
     *
     * @param numQuad the number of quadruplets to play
     * @throws InterruptedException
     */
    public void playQuadruplets(int numQuad) throws InterruptedException {
        for(int i =0; i<numQuad;i++){
            //want to generate a random number within the number of words
            int randNum = (int)(Math.random()*(numWords-1));
            
            //play first part of 4
            myWordArray[randNum].blockingPlay();
            
            //print out the random number
            System.out.println(randNum);
            
            //100 milisecond pause
            Thread.sleep(100);
            
            //play second part of 4
            myWordArray[randNum+1].blockingPlay();
            
            //print out the random number plus one
            System.out.println(randNum+1);
            
            //100 milisecond pause
            Thread.sleep(100);
            
            //play third part of 4
            myWordArray[randNum+2].blockingPlay();
            
            //print out the random number plus two
            System.out.println(randNum+2);
            
            //100 milisecond pause
            Thread.sleep(100);
            
            //play fourth part of 4
            myWordArray[randNum+3].blockingPlay();
            
            //print out the random number plus three
            System.out.println(randNum+3);
            
            //400 millisecond pause between pairs
            Thread.sleep(400);
        }
    }
}
