package varsha;

public class FrequencyOfChar {

	void printFrequencyInfo(String input, char character) {
		int count = 0;
		input = input.toLowerCase();
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == character) {
				count++;
			}
		}
		System.out.println("Frequency of " + character + " in " + input + " is " + count);
	}

	public static void main(String[] args) {
		FrequencyOfChar frequencyOfChar = new FrequencyOfChar();
		frequencyOfChar.printFrequencyInfo("technocrediTs teaches Technology", 't');
	}
}
