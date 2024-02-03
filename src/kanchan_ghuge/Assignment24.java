package kanchan_ghuge;

class Assignment24 {

	void printUniqueCharacter(String str) {
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (str.indexOf(ch) == str.lastIndexOf(ch)) {
				char temp = str.charAt(index);
				System.out.print(temp);
			}
		}
	}

	public static void main(String[] args) {
		new Assignment24().printUniqueCharacter("technocredits");
	}
}
