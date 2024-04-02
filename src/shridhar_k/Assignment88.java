package shridhar_k;
// [15-20 mins] - 12.33 - 12.53
// Write a code to reverse only first and last word of statement.
// Input: Welcome to the Technocredits
// Output : emocleW to the stiderconhceT
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Assignment88 {
    String reverseString(String str){
        String output = "";
        for(int i =str.length() - 1;i >= 0;i--){
            output += str.charAt(i);
        }
        return output;
    }

    void printString(String str){
        String outPutString ="";
        String[] strArr = str.split(" ");
        for(int i = 0;i < strArr.length;i++){
            if(i == 0 || i == strArr.length - 1){
                if(i == 0){
                   outPutString = outPutString + reverseString(strArr[i]) + " ";
                }else{
                    outPutString = outPutString + reverseString(strArr[i]);
                }
            }else
                outPutString =  strArr[i] + " "; 
        System.out.print(outPutString);
        }
    }
    
    public static void main(String[] args) {
        String str = "Welcome to Technocredits";
        new Assignment88().printString(str);
    }
}