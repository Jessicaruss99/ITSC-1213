/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;

/**
 *
 * @author nanajjar
 */
public class BubbleSortTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //TODO: Define and initialize an integer array named testArray with the following elements: 1, 10, 9, 7,4, 2*/
                 int[] testArray = {1,10,9,7,4,2};
        
      //TODO: create a bubble sort object
        BubbleSort b = new BubbleSort();
      
        //TODO: use this object to sort array and overwrite it
         testArray = b.bubbleSort(testArray);
        
        //TODO: print out sorted array
        for(int i=0; i<testArray.length; i++){
        System.out.println(testArray[i]);
        }
        
    }

}
