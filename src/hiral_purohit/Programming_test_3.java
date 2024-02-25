package hiral_purohit;

import java.util.Arrays;

public class Programming_test_3 {

	String toReverseString(String str) {
		String temp = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			char ch = str.charAt(i);
			temp = temp + ch;
		}
		return temp;
	}

	String toGetUpper(String input) {

		for (int i = input.length() - 1; i >= 0; i--) {
			char ch1 = input.charAt(0);
			char ch2 = input.charAt(input.length() - 1);
			input = Character.toUpperCase(ch1) + input.substring(1, input.length()- 1) + Character.toUpperCase(ch2);
		}
		return input;
	}

	String[] toPrintReverseString(String[] str) {

		String[] output = new String[str.length];
		for (int i = 0; i < str.length; i++) {
			output[i] = toReverseString(str[i]);
			if (!str[i].equals(output[i])) {
				str[i] = toGetUpper(output[i]);
			}
		}
		return str;
	}

	public static void main(String[] args) {
		String[] arr = { "naman", "techno", "madam", "credits", "nitin" };
		arr = new Programming_test_3().toPrintReverseString(arr);
		System.out.println(Arrays.toString(arr));
	}
}
