package aanand;

//	Remove all the vowels from given String.
//	input : technocredits
//	output : tchncrdts

public class Assignment26 {

	void printremoveVowelString(String input) {
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				input = input.replace(String.valueOf(ch), "");
			}
		}
		System.out.println(input);
	}

	public static void main(String[] args) {
		Assignment26 assignment26 = new Assignment26();
		assignment26.printremoveVowelString("technocredits");

	}
}