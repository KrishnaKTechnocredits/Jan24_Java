//Assignment 17 : Print the frequency of the given character from the given String.

package padmaja;

public class FrequencyOfCharacter {
	void printFrequency(String input) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == 't')
				count++;
		}
		System.out.println("Frequency of t in technocredit is " + count);
	}

	public static void main(String[] args) {
		FrequencyOfCharacter frequency = new FrequencyOfCharacter();
		frequency.printFrequency("technocredit");
	}
}
