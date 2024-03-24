package garima_s;

import java.util.Arrays;

public class Assignment_87 {

	String getReverseWord(String input) {
		String str = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			str += input.charAt(i);
		}
		return str;
	}

	void reverseString(String str) {
		String output = "";
		String[] str1 = str.split(" ");
		for (int i = 0; i < str1.length; i++) {
			output += getReverseWord(str1[i]) + " ";
		}
		System.out.println(output.trim());
	}

	public static void main(String[] args) {
		String str = "Welcome to Technocredits";
		new Assignment_87().reverseString(str);
	}
}
