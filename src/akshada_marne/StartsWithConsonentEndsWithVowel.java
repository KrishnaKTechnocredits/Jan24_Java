package akshada_marne;

public class StartsWithConsonentEndsWithVowel {

	boolean startsWithConsonent(String str) {
		str = str.toLowerCase();
		char ch = str.charAt(0);
		if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {

			return true;
		} else {
			return false;

		}

	}

	boolean endssWithVowels(String str) {
		str = str.toLowerCase();
		char ch = str.charAt(str.length() - 1);
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {

			return true;
		} else {
			return false;

		}

	}

	void printOutput(String[] input) {
		for (int i = 0; i < input.length; i++) {
			boolean flag = startsWithConsonent(input[i]);
			boolean flag2 = endssWithVowels(input[i]);

			if (flag == true && flag2 == true)
				System.out.println(input[i]);
		}

	}

	public static void main(String args[]) {
		StartsWithConsonentEndsWithVowel startsWithConsonentEndsWithVowel = new StartsWithConsonentEndsWithVowel();
		String[] arr = { "Aashvi", "Sameer", "Ansh", "Sveta", "Anand", "Techno", "Garima" };
		startsWithConsonentEndsWithVowel.printOutput(arr);
	}
}
