package priya_t;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment26_RemoveVowelsfromString {

	public static void main(String[] args) {

		Assignment26_RemoveVowelsfromString obj = new Assignment26_RemoveVowelsfromString();

		String str = "technocredits";
		String removedString = "";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (!obj.isVowel(ch)) {
                removedString = removedString + ch;
			}
		}
		System.out.println("String after removing vowels : " + removedString);

	}

	// function to check if a character is vowel or not
	public boolean isVowel(char c) {
		String vowels = "aeiou";
		for (int i = 0; i < 5; i++) {

			if (c == vowels.charAt(i)) {
				return true;
			}
		}
		return false;
	}
}
