package hiral_purohit;

public class ArrayStrVowelCon {

	boolean isStartsWithVowel(String str) {
		char ch = str.charAt(0);
		if (ch == 0 && ch != 'A' || ch != 'E' || ch != 'I' || ch != 'O' || ch != 'U')
			return true;
		else
			return false;
	}

	boolean isEndsWithCon(String str) {
		char ch = str.charAt(str.length() - 1);
		if (ch == str.length() - 1 && ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			return true;
		else
			return false;
	}

	void printAllNames(String[] names) {
		for (int index = 0; index < names.length; index++) {
			String input = names[index];
			boolean flag = isStartsWithVowel(input) && isEndsWithCon(input);
			if (flag == true)
				System.out.println(input);
		}
	}

	public static void main(String[] args) {
		String[] arr = { "Aashvi", "Sameer", "Ansh", "Sveta", "Anand", "Techno", "Garima" };
		ArrayStrVowelCon arrayStrVowelCon = new ArrayStrVowelCon();
		arrayStrVowelCon.printAllNames(arr);
	}

}
