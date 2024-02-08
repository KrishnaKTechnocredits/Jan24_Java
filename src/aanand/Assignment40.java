package aanand;

public class Assignment40 {

	boolean isStartWithConsonant(String str) {
		char ch = str.charAt(0);
		ch = Character.toLowerCase(ch);
		if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
			return true;
		} else
			return false;
	}

	boolean isEndWithVowel(String str) {
		char ch = str.charAt(str.length() - 1);
		ch = Character.toLowerCase(ch);
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			return true;
		} else
			return false;
	}

	void printNames(String[] name) {
		for (int i = 0; i < name.length; i++) {
			if (isStartWithConsonant(name[i]) == true && isEndWithVowel(name[i]) == true) {
				System.out.println(name[i]);
			}
		}
	}

	public static void main(String[] args) {
		String name[] = { "Aashvi", "Sameer", "Ansh", "Sveta", "Anand", "Techno", "Garima" };
		Assignment40 assignment40 = new Assignment40();
		assignment40.printNames(name);
	}
}