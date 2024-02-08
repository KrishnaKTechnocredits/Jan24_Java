package aanand;

public class Assignment45 {

	int getUpperCharCount(String str) {
		int upperCount = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isUpperCase(ch)) {
				upperCount++;
			}
		}
		return upperCount;
	}

	int getLowerCharCount(String str) {
		int lowerCount = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isLowerCase(ch)) {
				lowerCount++;
			}
		}
		return lowerCount;
	}

	void printOutput(String[] input) {

		for (int i = 0; i < input.length; i++) {
			String str = input[i];
			if (getUpperCharCount(str) > getLowerCharCount(str)) {
				System.out.println(input[i]);
			}
		}
	}

	public static void main(String[] args) {
		String input[] = { "aAShVI", "TEchNoCRediTs", "ANSh", "dhARMma", "vIDhItA" };
		Assignment45 assignment45 = new Assignment45();
		assignment45.printOutput(input);
	}
}