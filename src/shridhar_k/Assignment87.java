package shridhar_k;
/*[15-20 mins]
Code to reverse words in string:
 Input: Welcome to Technocredits
 Output: emocleW ot stiderconhceT*/ 
// Online Java Compiler 11.28 - 11.40
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Assignment87 {
    
    String getReverseString(String str){
        String output = "";
        for(int i = str.length()-1 ; i >= 0; i--){
            char ch = str.charAt(i);
            output += ch;
        }
        return output;
    }
    
    void printString(String str){
        String output = "";
        String[] strArr = str.split(" ");
        for(int i =0 ; i <strArr.length;i++){
            if(i == strArr.length - 1)
            output = output + getReverseString(strArr[i]);
            else
            output = output + getReverseString(strArr[i]) + " ";
        }
        System.out.println(output);
    }
    
    public static void main(String[] args) {
        String str = "Welcome to Technocredits";
        new Assignment87().printString(str);
    }
}