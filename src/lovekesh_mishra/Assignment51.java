package lovekesh_mishra;

class Assignment51 {

	public static void main(String[] args) {
		Assignment51 ans = new Assignment51();
		ans.countOfDigits("H2i H3el4lo P4un2e5");
	}

	void countOfDigits(String input) {
		String str = "";
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (!Character.isDigit(ch)) {
				str = str + ch;

			}

		}
		System.out.println("output is----> " + str);
	}

}
