package kanchan_ghuge;

class Assignment17 {

	void printString(String inputString, char character) {
		int count = 0;
		for (int index = 0; index < inputString.length(); index++) {
			char ch = inputString.charAt(index);
			if (ch == character) {
				count++;
			}
		}
		System.out.println("Frequency of " + character + " in " + inputString + " is " + count);
	}

	public static void main(String[] args) {
		Assignment17 assignment17 = new Assignment17();
		assignment17.printString("technocredits", 't');
	}
}
