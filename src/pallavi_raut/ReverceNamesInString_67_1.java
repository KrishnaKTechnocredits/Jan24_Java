/*Create required methods to complete below 3 programs.
Its on you how many java classes you want to write, all methods in same class is also ok.

Program 1: 
input : Hi Hello Maulik
output : iH olleH kiluaM   */


//Assignment 67 part -1
package pallavi_raut;

public class ReverceNamesInString_67_1 {

	public static void main(String[] args) {
		String str = "Hi Hello Maulik";
		String[] arr = str.split(" ");
		System.out.println("Input String : " + str);
		ReverceNamesInString_67_1 reverceNamesInString = new ReverceNamesInString_67_1();
		reverceNamesInString.printStringReverse(arr);
	}

	String[] printStringReverse(String[] str) {
		String[] output = new String[str.length];
		for (int i = 0; i < str.length; i++) {
			String temp = getReverseString(str[i]);
			output[i] = temp + " ";
			System.out.print(output[i]);
		}
		return output;
	}

	String getReverseString(String str) {
		String str1 = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			char ch = str.charAt(i);
			str1 = str1 + ch;
		}
		return str1;
	}
}