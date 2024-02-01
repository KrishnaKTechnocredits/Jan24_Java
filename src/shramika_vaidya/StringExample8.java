package shramika_vaidya;

class StringExample8 {

	void printFrequencyOfChar(String str) {
		int count = 0;
		char ch;
		for (int index = 0; index < str.length(); index++) {
			ch = str.charAt(index);
			count = 0;
			for (int i = 0; i < str.length(); i++) {
				if (ch == str.charAt(i)) {
					count++;
				}
			}
			if (count == 1) {
				System.out.print(ch);
			}
		}
	}

	public static void main(String[] args) {
		StringExample8 stringExample8 = new StringExample8();
		stringExample8.printFrequencyOfChar("technocredits");
	}
}