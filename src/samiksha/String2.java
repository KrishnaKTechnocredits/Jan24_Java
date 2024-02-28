package samiksha;

import java.util.Arrays;

public class String2 {

	String printStr(String str) {
		String output = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.toUpperCase().charAt(0);
			output = ch + str.toLowerCase().substring(1, str.length());
		}
		return output;
	}

	void printArray(String[] str) {
		String finalOutput = "";
		String[] output = new String[str.length];
		for (int i = 0; i < str.length; i++) {
			output[i] = printStr(str[i]);
			finalOutput = finalOutput + output[i] + " ";
		}
		System.out.println(finalOutput.trim());
	}

	public static void main(String[] args) {
		String input = "hi hEllO how are you";
		String[] output = input.split(" ");
		new String2().printArray(output);
	}
}
