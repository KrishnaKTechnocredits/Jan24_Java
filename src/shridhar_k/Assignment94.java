package shridhar_k;
// [18-20 mins] 8.53 - 9.00
// Input- Kajol is Working in Roche
// Output- Roche in Working is Kajol

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Assignment94 {
    
    void reverseString(String str){
        String[] strArr = str.split(" ");
        String output ="";
        for(int i=strArr.length-1 ;i >= 0;i--){
            output += strArr[i] + " ";
        }
        output = output.trim();
        System.out.println(output);
    }

    public static void main(String[] args) {
        String str1 = "Kajol is Working in Roche";
        new Assignment94().reverseString(str1);
    }
}