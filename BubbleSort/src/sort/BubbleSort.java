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
public class BubbleSort {

    public BubbleSort() {

    }

    public int[] bubbleSort(int[] array) {
   //TODO: Implement the bubbleSorting algorithm in this method
   
   int size = array.length;
   boolean firstSwap = false;
   int swapCount =0;
   int temp = 0;
   
   while(size>=2){
       for( int i =0; i<=size-2;i++){
           if(array[i]>array[i+1]){
               temp = array[i];
               array[i] = array[i+1];
               array[i+1] = temp;
               if(i==0){
                   firstSwap=true;
               } else{
                   firstSwap=false;
               }
                       swapCount = swapCount+1;
           }
       }
       size = size-1;
       
       if(firstSwap || swapCount ==0){
           return array;
       }
   }

    return array;
    }

}
