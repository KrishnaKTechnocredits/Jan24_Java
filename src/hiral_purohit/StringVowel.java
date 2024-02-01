package hiral_purohit;

public class StringVowel {

	void printString(String str) {

		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				String vowel = String.valueOf(ch);
				str = str.replace(vowel, "*");
			}
		}
		str = str.replace("*", "");
		System.out.print(str);
	}

	public static void main(String[] args) {
		new StringVowel().printString("technocredits");
	}
}
