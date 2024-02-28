package samiksha;

import java.util.Arrays;

public class String3 {

	String printReverseString(String str) {
		String output = "";
		for (int index = str.length() - 1; index >= 0; index--) {
			char ch = str.charAt(index);
			output = output + ch;
		}
		char ch1 = output.toUpperCase().charAt(0);
		output = ch1 + output.toLowerCase().substring(1, output.length());
		return output;
	}

	void printArray(String[] str) {
		String finalOutput = "";
		String[] output = new String[str.length];
		for (int i = 0; i < str.length; i++) {
			output[i] = printReverseString(str[i]);
			finalOutput = finalOutput + output[i] + " ";
		}
		System.out.println(finalOutput.trim());
	}

	public static void main(String[] args) {
		String input = "Hi Hello Maulik";
		String[] arr = input.split(" ");
		new String3().printArray(arr);
	}

}
