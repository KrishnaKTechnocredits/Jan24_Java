package kanchan_ghuge;

class Assignment19 {

	void printFrequency(String inputString, char character) {
		int count = 0;
		inputString = inputString.toLowerCase();
		System.out.println("String in Lower case=" + inputString);
		for (int index = 0; index < inputString.length(); index++) {
			char ch = inputString.charAt(index);
			if (ch == character) {
				count++;
			}
		}
		System.out.println("Frequency of " + character + " in " + inputString + " is " + count);
	}

	public static void main(String[] args) {
		Assignment19 assignment19 = new Assignment19();
		assignment19.printFrequency("technocrediTs teaches Technology", 't');
	}
}
