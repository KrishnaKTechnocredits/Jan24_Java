package shramika_vaidya;

class StringExample3 {

	void printAllCharacter(String input) {
		for (int index = input.length() - 1; index >= 0; index--) {
			System.out.println(input.charAt(index));
		}
	}

	public static void main(String[] args) {
		StringExample3 stringExample3 = new StringExample3();
		stringExample3.printAllCharacter("Techno");
	}
}