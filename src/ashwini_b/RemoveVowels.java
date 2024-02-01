package ashwini_b;

/*
 Assignment - 26 : 30th Jan'24
Remove all the vowels from given String.
input : technocredits
output : tchncrdts
 */
public class RemoveVowels {

	void removeVowelsFrmString(String input) {
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				input = input.replace(ch, '*');
			}
		}
		// System.out.println(input);
		input = input.replace("*", "");
		System.out.println(input);

	}

	public static void main(String[] args) {
		RemoveVowels removeVowels = new RemoveVowels();
		removeVowels.removeVowelsFrmString("technocredits");
	}

}
