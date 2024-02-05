//Assignment - 40 : 4th Feb'2024 
package puja_poreddiwar;

public class PrintNameWithConAndVow {

	boolean isStartWithConsonant(String name) {
		char ch = name.charAt(0);
		ch = Character.toLowerCase(ch);
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			return false;
		else
			return true;
	}

	boolean isStartWithVowels(String name) {
		char ch = name.charAt(name.length() - 1);
		ch = Character.toLowerCase(ch);
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			return true;
		else
			return false;
	}

	void printNames(String[] names) {
		for (int index = 0; index < names.length; index++) {
			if (isStartWithConsonant(names[index]) == true && isStartWithVowels(names[index]) == true) {
				System.out.println(names[index]);
			}
		}

	}

	public static void main(String[] args) {
		String[] names = { "Aashvi", "Sameer", "Ansh", "Sveta", "Anand", "Techno", "Garima" };
		new PrintNameWithConAndVow().printNames(names);

	}

}
