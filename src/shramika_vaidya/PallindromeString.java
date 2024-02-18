package shramika_vaidya;

import java.util.Arrays;

public class PallindromeString {

	String getStringReverce(String str) {
		String str1 = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			char ch = str.charAt(i);
			str1 = str1 + ch;
		}
		return str1;
	}

	String[] setFirstAndLastLetterCapitalIfNotPallindrome(String[] input) {
		String[] output = new String[input.length];
		for (int i = 0; i < input.length; i++) {
			String temp = getStringReverce(input[i]);
			if (temp.equals(input[i])) {
				output[i] = temp;
			} else
				temp = temp.toUpperCase().charAt(0) + temp.substring(1, temp.length() - 1)
						+ temp.toUpperCase().charAt(temp.length() - 1);
			output[i] = temp;
		}

		String str1 = Arrays.toString(output);
		str1 = str1.replace('[', '{').replace(']', '}');
		System.out.println(str1);
		return output;
	}

	public static void main(String[] args) {
		String[] arr = { "naman", "techno", "madam", "credits", "nitin" };
		new PallindromeString().setFirstAndLastLetterCapitalIfNotPallindrome(arr);
	}
}
