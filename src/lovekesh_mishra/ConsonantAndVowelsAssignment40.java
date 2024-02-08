package lovekesh_mishra;

class ConsonantAndVowelsAssignment40 {

	boolean isStartsWithConsonant(String str) {
		char ch = str.charAt(0);
		if (ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U') {
			return true;
		} else
			return false;
	}

	boolean isLastWithvowel(String str) {
		char ch = str.charAt(str.length() - 1);
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			return true;
		} else
			return false;
	}

	void printAllNames(String[] input) {
		System.out.println("output is ---->");
		for (int i = 0; i < input.length; i++) {
			if (isStartsWithConsonant(input[i]) == true && isLastWithvowel(input[i]) == true) {
				System.out.println(input[i]);

			}
		}
	}

	public static void main(String[] args) {
		ConsonantAndVowelsAssignment40 ans = new ConsonantAndVowelsAssignment40();
		String[] names = { "Aashvi", "Sameer", "Ansh", "Sveta", "Anand", "Techno", "Garima" };
		ans.printAllNames(names);
	}

}
