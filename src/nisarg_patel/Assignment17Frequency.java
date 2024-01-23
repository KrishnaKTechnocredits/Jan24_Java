package nisarg_patel;

public class Assignment17Frequency {

	int count = 0;

	void printFreqChar(String input, char targetCh) {
		for (int num = 0; num < input.length(); num++) {
			char ch = input.charAt(num);
			if (ch == targetCh) {
				count++;
			}
		}
		System.out.println("The Frequency of " + targetCh + " is " + count);
	}

	public static void main(String[] args) {
		Assignment17Frequency assignment17Frequency = new Assignment17Frequency();
		assignment17Frequency.printFreqChar("technocredits", 't');
	}
}
