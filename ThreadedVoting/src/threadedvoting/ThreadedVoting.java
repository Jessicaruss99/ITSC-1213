/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadedvoting;

/**
 *
 * @author jessi
 */
public class ThreadedVoting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //VoteCounter voteCounter1 = new VoteCounter("Celine");
        //Thread counter1 = new Thread (voteCounter1);
        
        Thread counter1 = new Thread (new VoteCounter("Celine"));
        Thread counter2 = new Thread(new VoteCounter("Bruce"));
        counter1.start();
        counter2.start();
        Thread counter3 = new Thread(new VoteCounter("Elizabeth"));
        counter3.start();
    }
    
}
