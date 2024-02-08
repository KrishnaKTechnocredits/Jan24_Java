package lovekesh_mishra;

class StringAssignment17 {

	void frequency(String input, char countChar) {
		int count = 0;
		for (int index = 0; index <= input.length() - 1; index++) {
			char ch = input.charAt(index);
			if (ch == countChar) {
				count++;
			}
		}
		System.out.println("Frequency of " + countChar + " in technocredits is " + count);
	}

	public static void main(String[] args) {
		StringAssignment17 stringAssignment17 = new StringAssignment17();
		stringAssignment17.frequency("technocredits", 't');
	}
}
