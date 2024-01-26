package shramika_vaidya;

class StringExample4 {

	void printAllCharacter(String input) {
		for (int index = input.length() - 1; index >= 0; index--) {
			System.out.println(input.charAt(index));
		}
	}

	public static void main(String[] args) {
		StringExample4 stringExample4 = new StringExample4();
		stringExample4.printAllCharacter("Techno");
	}
}