package shramika_vaidya;

class StringExample10 {

	void printDuplicateChar(String str) {
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (index == str.indexOf(ch)) {
				if (str.indexOf(ch) == str.lastIndexOf(ch)) {
					System.out.print(ch);
				}
			}
		}
	}

	public static void main(String[] args) {
		new StringExample10().printDuplicateChar("technocredits");
	}
}
