package kanchan_ghuge;

public class Assignment26 {

	void printRemoveVowels(String input) {
		System.out.println("Remove Vowels from " + input + " = ");
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				input = input.replace(ch, '$');
			}
		}

		String str = String.valueOf('$');
		input = input.replace(str, "");
		System.out.println(input);
	}

	public static void main(String[] args) {
		new Assignment26().printRemoveVowels("technocredits");
	}
}
