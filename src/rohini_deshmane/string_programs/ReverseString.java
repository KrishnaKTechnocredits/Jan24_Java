package rohini_deshmane.string_programs;

import java.util.Arrays;

/*
 Assignment - 87 : 24th March'2024 [15-20 mins]
Code to reverse words in string:
 Input: Welcome to Technocredits
 Output: emocleW ot stiderconhceT
 */
public class ReverseString {

	String reverseStr(String str) {
		String reverse = "";
		for(int i=str.length()-1; i>=0;i--) {
			reverse =  reverse+ str.charAt(i);
		}
		return reverse;
	}
	
	void printReverseString(String str) {
		String[] strArr = str.split(" ");
		String reverseStr="";
		System.out.println(Arrays.toString(strArr));
		for(int i=0; i<strArr.length; i++) {
			reverseStr = reverseStr + " "+reverseStr(strArr[i]);
		}
		System.out.println(reverseStr);
	}
	
	public static void main(String[] args) {
		String str = "Welcome to Technocredits";
		ReverseString reverseString = new ReverseString();
		reverseString.printReverseString(str);
	}
}
