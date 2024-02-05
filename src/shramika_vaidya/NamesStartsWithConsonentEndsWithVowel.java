package shramika_vaidya;

public class NamesStartsWithConsonentEndsWithVowel {

	boolean isNameStartsWithConsonent(String str) {
		char ch = str.charAt(0);
		ch = Character.toLowerCase(ch);
		if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
			return true;
		} else
			return false;
	}

	boolean isNameEndsWithVowel(String str) {
		char ch = str.charAt(str.length() - 1);
		ch = Character.toLowerCase(ch);
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			return true;
		} else
			return false;
	}

	void printStringName(String[] names) {
		for (int i = 0; i < names.length; i++) {
			if (isNameStartsWithConsonent(names[i]) == true && isNameEndsWithVowel(names[i]) == true) {
				System.out.println(names[i]);
			}
		}
	}

	public static void main(String[] args) {
		String[] arr = { "Aashvi", "Sameer", "Ansh", "Sveta", "Anand", "Techno", "Garima" };
		NamesStartsWithConsonentEndsWithVowel namesStartsWithConsonentEndsWithVowel = new NamesStartsWithConsonentEndsWithVowel();
		namesStartsWithConsonentEndsWithVowel.printStringName(arr);
	}
}
