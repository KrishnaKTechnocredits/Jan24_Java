package nisarg_patel;

public class Assignment40StartWithConsonantAndEndsWithVowel {

	boolean isStartWithConsonant(String name) {
		char ch = name.charAt(0);
		ch = Character.toLowerCase(ch);
		if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u')
			return true;
		else
			return false;
	}

	boolean isEndWithVowel(String name) {
		char ch = name.charAt(name.length() - 1);
		ch = Character.toLowerCase(ch);
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			return true;
		else
			return false;
	}

	void printNames(String[] names) {
		for (int index = 0; index < names.length; index++) {
			if (isStartWithConsonant(names[index]) == true && isEndWithVowel(names[index]) == true) {
				System.out.println(names[index]);
			}
		}
	}

	public static void main(String[] args) {
		String[] names = { "Aashvi", "Sameer", "Ansh", "Sveta", "Rina", "Anand", "Techno" };
		new Assignment40StartWithConsonantAndEndsWithVowel().printNames(names);
	}
}
