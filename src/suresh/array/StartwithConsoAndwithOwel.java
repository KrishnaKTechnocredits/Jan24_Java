/*
 Print all the names from given array which should start with consonant and ends with vowel.

input: {"Aashvi", "Sameer", "Ansh", "Sveta", "Anand", "Techno", "Garima"}
Output : Sveta
		 Techno
		 Garima
 * 
 */
package suresh.array;

public class StartwithConsoAndwithOwel {

	boolean getFirstLetterConso(String input) {
		// char ch=input.charAt(input.length()-1);
		char ch = input.charAt(0);
		ch = Character.toUpperCase(ch);
		if (ch != 'A' || ch != 'E' || ch != 'I' || ch != 'O')

			return true;
		else
			return false;
	}

	boolean getLastCharEven(String input) {
		char ch = input.charAt(input.length() - 1);
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == '0')

			return true;
		else
			return false;
	}

	void getStringWord(String[] index) {
		for (int i = 0; i < index.length; i++) {
			String name = index[i];
			boolean flag1 = getFirstLetterConso(name);
			boolean flag2 = getLastCharEven(name);
			if (flag1 == flag2)

				System.out.println(name);

		}
	}

	public static void main(String[] args) {
		String[] arry = { "Aashvi", "Sameer", "Ansh", "Sveta", "Anand", "Techno", "Garima" };

		new StartwithConsoAndwithOwel().getStringWord(arry);
	}
}
