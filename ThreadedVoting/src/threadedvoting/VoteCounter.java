/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadedvoting;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jessi
 */
public class VoteCounter implements Runnable {
    private String name;
    private int numVotes;

    public VoteCounter(String name) {
        this.name = name;
        this.numVotes =0;
    }

    @Override
    public void run() {
      while(true){
          try {
              numVotes++;
              System.out.println("Candidate " + name+ " has " + numVotes + " votes.");
              Thread.sleep(50);
          } catch (InterruptedException ex) {
              Logger.getLogger(VoteCounter.class.getName()).log(Level.SEVERE, null, ex);
          }
      }  
    }
    
    
}
