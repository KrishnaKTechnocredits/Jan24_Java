package garima_s;

public class StartWithVowelAndAtleast1Digit {
	boolean isStartWithVowel(String name) {
		char ch = name.charAt(0);
		ch = Character.toLowerCase(ch);
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			return true;
		else
			return false;
	}

	boolean isLeast1Digit(String name) {
		for (int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			if (Character.isDigit(ch) == true)
				return true;

		}
		return false;
	}

	void printNames(String[] names) {
		for (int index = 0; index < names.length; index++) {
			if (isStartWithVowel(names[index])&& isLeast1Digit(names[index])) {
				System.out.println(names[index]);
			}
		}
	}

	public static void main(String[] args) {
		String[] names = { "Aakansha", "Aas3hvi", "Isha", "I2sh4a4n", "Var2sha" };
		new StartWithVowelAndAtleast1Digit().printNames(names);
	}
}
