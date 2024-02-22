/*
 * Program 1: 
input : Hi Hello Maulik
output : iH olleH kiluaM
 */

package puja_poreddiwar;

//Program 1:
public class Assignment67_1ReverseString {

	String reverseofString(String input) {
		String str = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			char ch = input.charAt(i);
			str = str + ch;
		}
		return str;
	}

	void getReversedString(String[] str) {
		String temp = "";
		String output = "";
		for (int i = 0; i < str.length; i++) {
			temp = reverseofString(str[i]);
			output += temp + " ";
		}
		System.out.println(output.trim());
	}

	public static void main(String[] args) {
		String input = "Hi Hello Maulik";
		String[] arr = input.split(" ");
		new Assignment67_1ReverseString().getReversedString(arr);
	}
}
