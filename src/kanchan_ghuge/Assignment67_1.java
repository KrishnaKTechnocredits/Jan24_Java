/*Create required methods to complete below 3 programs.
Its on you how many java classes you want to write, all methods in same class is also ok.

Program 1: 
input : Hi Hello Maulik
output : iH olleH kiluaM */

package kanchan_ghuge;

public class Assignment67_1 {

	String reverse(String str) {
		String output = "";
		for (int index = str.length() - 1; index >= 0; index--) {
			output += str.charAt(index);
		}
		return output;
	}

	void printData(String[] str) {
		String finalstr = "";
		for (int index = 0; index < str.length; index++) {
			finalstr = finalstr + reverse(str[index]) + " ";
		}
		System.out.println("Output String : " + finalstr);
	}

	public static void main(String[] args) {
		String input = "Hi Hello Maulik";
		System.out.println("Input String : " + input);
		String[] str = input.split(" ");
		new Assignment67_1().printData(str);
	}
}
