package shridhar_k;
// Print numbers not presented uniquely from array using Array. 11.24 - 12.1
// Print numbers not presented uniquely from array using ArrayList.12.50 -1.03
// Print numbers not presented uniquely from array using HashMap. 1.5 - 1.25
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Assignment85 {
    
    int getFrequencyOfNum(int[] arr , int num){
        int count = 0;
        for(int value : arr){
            if(num == value){
                count++;
            }
        }
        return count;
    }
    
    boolean isProcessed (int arr[] , int count, int index , int num){
        int countNum = 0;
        for(int i =0; i<= index;i++){
                if(num == arr[i]){
                    countNum++;
                }
            }
            if(count == countNum){
               return true; 
            }
            return false;
        }
        
    
    
    void printDupNumfromArray(int[] arr){
        for(int i = 0;i< arr.length;i++){
            int count = getFrequencyOfNum(arr , arr[i]);
            if( count > 1 && isProcessed(arr , count , i , arr[i]) ){
                System.out.println(arr[i]);
            }
        }
    }
    
    ArrayList<Integer> getIntegerArrayFromIntArr(int[] arr){
        ArrayList<Integer> numList = new ArrayList<> ();
        for(int num : arr){
            numList.add(num); 
        }
        return numList;
    }
    
    void printDumNumByArrayList(int[] arr){
        ArrayList<Integer> numList = getIntegerArrayFromIntArr(arr);
        for(int i=0;i< numList.size();i++){
            Integer num = numList.get(i);
            if( i== numList.lastIndexOf(num) &&  numList.indexOf(num) != numList.lastIndexOf(num)){
                System.out.println(num);
            }
        }
    }
    
    HashMap <Integer, Integer> getNumFreqByHashMap(int[] arr){
        HashMap <Integer , Integer> numMap = new HashMap<>();
        for(Integer num : arr){
            if(numMap.containsKey(num)){
                int count = numMap.get(num);
                numMap.put(num , ++count);
            }else{
                numMap.put(num , 1);
            }
        }
        return numMap;
    }
    
    void printDupNum(int[] arr){
        HashMap <Integer , Integer> numFreqMap = getNumFreqByHashMap(arr);
        Set<Integer> numSet = numFreqMap.keySet();
        for(Integer num : numSet ){
            if(numFreqMap.get(num) > 1){
                System.out.println(num);
            }
        }
    }
    
    
    public static void main(String[] args) {
        int[] arr = {1,1,24,2,5,48,2,54,2,48};
        System.out.println("DUP num from array using Array.");
        new Assignment85().printDupNumfromArray(arr);
        System.out.println("unique num from array using ArrayList.");
        new Assignment85().printDumNumByArrayList(arr);
        System.out.println("unique num from array using HashMap.");
        new Assignment85().printDupNum(arr);
    }
}