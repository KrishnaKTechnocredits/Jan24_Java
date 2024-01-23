package samiksha;

public class Frequency {
	int count;

	void printFreqOfChar(String input, char targetCh) {
		for (int num = 0; num < input.length(); num++) {
			char ch = input.charAt(num);
			if (ch == targetCh) {
				count++;
			}
		}
		System.out.println("The frequency of " + targetCh + " is " + count);
	}

	public static void main(String[] args) {
		Frequency frequency = new Frequency();
		frequency.printFreqOfChar("technocredits", 't');
	}
}
