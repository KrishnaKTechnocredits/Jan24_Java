package garima_s;

public class MoreThan5CharacterAndUpperCase {

	boolean isStartWithUpperCase(String name) {
		char ch = name.charAt(0);
		if (Character.isUpperCase(ch) == true)
			return true;
		else
			return false;
	}

	void printNames(String[] names) {
		boolean temp = false;
		for (int index = 0; index < names.length; index++) {
			temp = isStartWithUpperCase(names[index]);
			if (names[index].length() <= 5 && temp == true) {
				System.out.println(names[index]);
			}
		}
	}

	public static void main(String[] args) {
		String[] names = { "Aashvi", "Sameer", "Ansh", "Sveta", "Rina", "Anand", "Techno" };
		new MoreThan5CharacterAndUpperCase().printNames(names);
	}
}
