package kanchan_ghuge;

/*Assignment - 40 : 4th Feb'2024

Print all the names from given array which should start with consonant and ends with vowel.

input: {"Aashvi", "Sameer", "Ansh", "Sveta", "Anand", "Techno", "Garima"}
Output : Sveta
	 Techno
	 Garima  */

class Assignment40 {

	boolean isStartWithConsonant(String input) {
		char ch = input.charAt(0);
		ch = Character.toLowerCase(ch);
		if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u')
			return true;
		else
			return false;
	}

	boolean isEndWithVowel(String input) {
		char ch = input.charAt(input.length() - 1);
		ch = Character.toLowerCase(ch);
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			return true;
		else
			return false;
	}

	void printTheName(String[] name) {
		for (int index = 0; index < name.length; index++) {
			if (isStartWithConsonant(name[index]) == true && isEndWithVowel(name[index]) == true)
				System.out.println(name[index]);
		}
	}

	public static void main(String[] args) {
		String[] name = { "Aashvi", "Sameer", "Ansh", "Sveta", "Anand", "Techno", "Garima" };
		new Assignment40().printTheName(name);
	}
}