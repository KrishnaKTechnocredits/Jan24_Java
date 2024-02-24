/*Assignment - 49 : 8th Feb'2024

Write a method which accept String Array and return char Array. 
return last character of each word, if last character is digit, then consider second last character.

input : techno credits32 pune4 indi5a
output : o3ea */

package padmaja;

public class PrintLastCharOfArray {
	char getLastChar(String str) {
		char c = ' ';
		char ch = str.charAt(str.length() - 1);
		if (Character.isDigit(ch))
			c = str.charAt(str.length() - 2);
		else
			c = ch;
		return c;
	}

	void printString(String[] arr) {
		String str = "";
		for (int index = 0; index < arr.length; index++) {
			char ch = getLastChar(arr[index]);
			str = str + ch;
		}
		System.out.println(str);
	}

	public static void main(String[] args) {
		String str = "techno credits32 pune4 indi5a";
		String[] input = str.split(" ");
		new PrintLastCharOfArray().printString(input);
	}
}
