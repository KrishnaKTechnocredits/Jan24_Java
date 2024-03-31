package shridhar_k;
// Print frequency of each character from given input. [using Map] 3.20
//Print frequency of each word from given input. [using Map]
//Print frequency of each number from given input. [using Map]
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Assignment86 {
    
    void findCharFreq(String str){
        char[] chArr = str.toCharArray();
        Map <Character , Integer> charMap = new HashMap <Character, Integer> ();
        for(Character ch : chArr){
            if(charMap.containsKey(ch)){
                Integer count = charMap.get(ch);
                charMap.put(ch , ++count );
            }else{
                charMap.put(ch , 1);
            }    
        }
        System.out.println(charMap);
    }
    
    void findStringFreq(String str1){
        String[] str = str1.split(" ");
        Map<String , Integer> mapOfString = new HashMap<>();
        for(String value : str){
            if(mapOfString.containsKey(value)){
                int count = mapOfString.get(value);
                mapOfString.put(value , ++count);
            }else{
                mapOfString.put(value,1);
            }
        }
        System.out.println(mapOfString);
    }
    
    void findEachNumFreq(int[] intArr){
        Map<Integer,Integer> mapOfNum = new HashMap <> ();
        for(int num : intArr){
            if(mapOfNum.containsKey(num)){
                int count = mapOfNum.get(num);
                mapOfNum.put(num , ++count);
            }else{
                mapOfNum.put(num , 1);
            }
        }
        System.out.println(mapOfNum);
    }
    
    public static void main(String[] args) {
        String str = "Technocredit";
        int[] data = {10,10,3,4,3,3,3,3,55,56};
        String str1 = "Hi Hi Hello Hello Hello Rahul Akshay Akshay akshay";
        new Assignment86().findCharFreq(str);
        new Assignment86().findStringFreq(str1);
        new Assignment86().findEachNumFreq(data);
    }
}