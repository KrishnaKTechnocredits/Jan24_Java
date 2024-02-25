package lovekesh_mishra;

class Assignment50 {

	public static void main(String[] args) {
		Assignment50 ans = new Assignment50();
		ans.countOfDigits("H2i H3el4lo P4un2e5");
	}

	void countOfDigits(String input) {
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isDigit(ch)) {
				count++;
			}

		}
		System.out.println("count of digits is----> " + count);
	}

}
