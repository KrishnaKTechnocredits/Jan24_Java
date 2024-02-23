/*
 * Program 1: 
input : Hi Hello Maulik
output : iH olleH kiluaM
 */

package shridhar_k.Assignment67;

import java.util.Arrays;

public class Program1 {
	String reverseString(String inpStr) {
		String output = "";
		for(int i = inpStr.length() - 1 ;i>=0;i--) {
			output = output + inpStr.charAt(i);
		}
		return output;
	}
	
	void arrangeString(String inpStr) {
		//String processString = "";
		String[] inpArr = inpStr.split(" ");
		for(int i =0; i < inpArr.length;i++) {
			inpArr[i] = reverseString(inpArr[i]);
		}
		String output = Arrays.toString(inpArr);
		output = output.replace(String.valueOf('['), "").replace(String.valueOf(']'), "");
		System.out.println(output);
	}
	
	public static void main(String[] args) {
		String input = "Hi Hello Maulik";
		new Program1().arrangeString(input);
	}
}
