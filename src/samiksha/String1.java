package samiksha;

import java.util.Arrays;

public class String1 {

	String printFirstChCapitalAndReverse(String str) {
		String output = "";
		for (int index = str.length() - 1; index >= 0; index--) {
			char ch = str.charAt(index);
			output = output + ch;
		}
		return output;
	}

	void printArray(String[] str) {
		String finalOutput = "";
		String[] output = new String[str.length];
		for (int i = 0; i < str.length; i++) {
			output[i] = printFirstChCapitalAndReverse(str[i]);
			finalOutput = finalOutput + output[i] + " ";
		}
		System.out.print(finalOutput.trim());
	}

	public static void main(String[] args) {
		String input = "Hi Hello Maulik";
		String[] arr = input.split(" ");
		new String1().printArray(arr);
	}

}
