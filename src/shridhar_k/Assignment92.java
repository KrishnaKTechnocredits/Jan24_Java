package shridhar_k;
// [15 mins]
// program 1 (using map): input : abc xyz abc pqr 
// O/p
// abc - 2
// xyz - 1
// pqr - 1

// Max repeating word is abc.

// program 2 (without using map) [extra]
// input : abc xyz abc pqr [30 mins]
// O/p
// abc - 2
// xyz - 1
// pqr - 1

// Max repeating word is abc.
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Assignment92 {
    
    void getFreqOfWordMap(String str){
    	String maxStr = "";
    	int maxCount = 0;
        String[] arr = str.split(" ");
        Map <String,Integer> mapOfName = new HashMap <> ();
        for(String word : arr){
            if(mapOfName.containsKey(word)){
                int count = mapOfName.get(word);
                mapOfName.put(word, ++count);
                if(count > maxCount) {
                	maxCount = count;
                	maxStr = word;
                }
            }else{
                mapOfName.put(word , 1);
            }
        }
        System.out.println(mapOfName);
        System.out.println("Max repeating word is " + maxStr);
    }
    
    int getFreqOfWord(String[] strArr, String str){
        int count =0;
        for(int i=0;i< strArr.length;i++){
            if(str.equals(strArr[i])){
                count++;
            }
        }
        return count;
    }
    
    boolean isProcessed(String[] strArr, String str , int index){
        for(int i =0; i< index;i++){
            if(strArr[i].equals(str)){
                return false;
            }
        }
        return true;
    }
    
    void printWordFreqFromArr(String str){
    	int maxCount = 0;
    	String maxStr = "";
        String[] arr = str.split(" ");
        for(int i=0;i< arr.length;i++){
            if(isProcessed(arr , arr[i] , i)){
                int count = getFreqOfWord(arr , arr[i]);
                System.out.println(arr[i] +" -> "+count); 
                if(count > maxCount) {
                	maxCount = count;
                	maxStr = arr[i];
                }
            }  
        }
        System.out.println("Max repeating word is " + maxStr);
    }
    
    
    public static void main(String[] args) {
        String input = "abc xyz abc pqr";
        System.out.println("Word freq by Array");
        new Assignment92().printWordFreqFromArr(input);
        System.out.println();
        System.out.println("Word freq by Map ");
        new Assignment92().getFreqOfWordMap( input);
    }
}