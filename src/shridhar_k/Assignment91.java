package shridhar_k;
// [45 mins 12.43 - 1.10
// 1.Shift all the zeros at the end of array.
// input : [1,0,0,12,63,4,0,0,5,6,7]
// output : [1,12,16,4,5,6,7,0,0,0,0]

// 2.Shift all the zeros at the begining of array.
// input : [1,0,0,12,63,4,0,0,5,6,7]
// output : [0,0,0,0,1,12,16,4,5,6,7]  
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Assignment91 {
    
    void rearrangeArrayZeroEnd(int[] arr){
        int[] temp = new int[arr.length];
        int countF = 0;
        int cLast = arr.length - 1;
        for(int i=0;i< arr.length;i++){
            if( arr[i] == 0){
               temp[cLast] = arr[i];
               cLast-- ;
            }else{
                temp[countF] = arr[i];
               ++countF ;
            }
        }
       System.out.println("zeros at the end :- " + Arrays.toString(temp));
    }
    
    void rearrangeZeroFirst(int[] arr){
        int[] temp = new int[arr.length];
        int countF = 0;
        int countl = arr.length - 1;
        for(int i =0;i<arr.length;i++){
            if(arr[i] == 0){
                temp[countF] = arr[i];
                countF++;
            }else{
                temp[countl] = arr[i];
                countl--;
            }
        }
        System.out.println( "zeros at the First :- "+ Arrays.toString(temp));
    }
    public static void main(String[] args) {
        int[] intArr = {1,0,0,12,63,4,0,0,5,6,7};
        new Assignment91().rearrangeArrayZeroEnd(intArr);
        new Assignment91().rearrangeZeroFirst(intArr);
    }
}