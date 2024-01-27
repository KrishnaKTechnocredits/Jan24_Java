package akshada_marne;

public class CharacterFrequency {

	int count = 0;

	void checkCharFreq(String input, char targetchar) {
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == targetchar) {
				count++;
			}
		}
		System.out.println("Frequency of t in technocredits is " +count);
	}

	public static void main(String args[]) {
		CharacterFrequency characterFrequency = new CharacterFrequency();
		characterFrequency.checkCharFreq("technocredits", 't');
	}
}
