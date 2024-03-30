package shridhar_k;
// Print numbers present uniquely from array using Array. 8.45 - 8.53
// Print numbers present uniquely from array using ArrayList.8.54 - 9.5
// Print numbers present uniquely from array using HashMap. 9.12 - 9.26
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;

class Assignment84 {
    
    int numFreqInArray(int[] arr , int num){
        int count = 0;
        for(int i =0;i<arr.length;i++){
            if(num == arr[i]){
                count++;
            }     
        }
        return count;
    }
    
    void printUniqueNum(int[] arr){
        for(int i =0; i< arr.length;i++){
            if(numFreqInArray(arr , arr[i]) == 1){
                System.out.println(arr[i]);
            } 
        }
    }
    
    ArrayList<Integer> getIntegerArrFromArray (int[] arr){
        ArrayList<Integer> numList = new ArrayList<>();
        for(int num : arr){
            numList.add(num);
        }
        return numList;
    }
    
    void printFreqArrayList(int[] arr){
        ArrayList<Integer> integerArray = getIntegerArrFromArray(arr);
        for(Integer num : integerArray){
            if(integerArray.indexOf(num) == integerArray.lastIndexOf(num)){
                System.out.println(num);
             }
        }
    }
    
    HashMap <Integer,Integer> getNumArrayFreqHashMap(int[] arr){
        HashMap <Integer,Integer> mapOfNumFreq = new HashMap<>();
        for(int num : arr){
            if(mapOfNumFreq.containsKey(num)){
                int count = mapOfNumFreq.get(num);
                mapOfNumFreq.put(num , ++count);
            }else{
                mapOfNumFreq.put(num , 1);
            }
        }
        return mapOfNumFreq;
    }
    
    void printUniqueHashMap(int[] arr){
        HashMap <Integer,Integer> mapWithNumFreq = getNumArrayFreqHashMap(arr);
        Set<Integer> setOfKeys = mapWithNumFreq.keySet();
        for(int num : setOfKeys){
            if(mapWithNumFreq.get(num) == 1){
                System.out.println(num);
            }
        }
    }

    
    public static void main(String[] args) {
        int[] arr = {1,1,24,3,5,48,54,3,48};
        System.out.println("unique num from array using Array.");
        new Assignment84().printUniqueNum(arr);
        System.out.println("unique num from array using ArrayList.");
        new Assignment84().printFreqArrayList(arr);
        System.out.println("unique num from array using HashMap.");
        new Assignment84().printUniqueHashMap(arr);
    }
}