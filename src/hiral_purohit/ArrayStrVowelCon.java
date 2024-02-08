package hiral_purohit;

public class ArrayStrVowelCon {

	boolean isStartsWithCon(String str) {
		char ch = str.charAt(0);
		if (ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U')
			return true;
		else
			return false;
	}

	boolean isEndsWithVowel(String str) {
		char ch = str.charAt(str.length() - 1);
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			return true;
		else
			return false;
	}

	void printAllNames(String[] names) {
		for (int index = 0; index < names.length; index++) {
			String input = names[index];
			if (isStartsWithCon(input) == true && isEndsWithVowel(input) == true) {
				System.out.println(input);
			}
		}
	}

	public static void main(String[] args) {
		String[] arr = { "Aashvi", "Sameer", "Ansh", "Sveta", "Anand", "Techno", "Garima" };
		ArrayStrVowelCon arrayStrVowelCon = new ArrayStrVowelCon();
		arrayStrVowelCon.printAllNames(arr);
	}

}
