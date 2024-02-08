package ashwini_b;

/*
Assignment - 40 : 4th Feb'2024
Print all the names from given array which should start with consonant and ends with vowel.
input: {"Aashvi", "Sameer", "Ansh", "Sveta", "Anand", "Techno", "Garima"}
Output : Sveta
		 Techno
		 Garima
 */
public class ArrayNameConVow {

	void PrintAllName(String[] StrArray) {
		for (int i = 0; i < StrArray.length; i++) {
			String str = StrArray[i];
			char firstch = str.charAt(0);
			if (firstch != 'A' && firstch != 'E' && firstch != 'I' && firstch != 'O' && firstch != 'U') {
				char lastch = str.charAt(str.length() - 1);
				if (lastch == 'a' || lastch == 'e' || lastch == 'i' || lastch == 'o' || lastch == 'u') {
					System.out.println(str);
				}
			}
		}
	}

	public static void main(String[] args) {
		String[] inputarry = { "Aashvi", "Sameer", "Ansh", "Sveta", "Anand", "Techno", "Garima" };
		ArrayNameConVow arrayNameConVow = new ArrayNameConVow();
		arrayNameConVow.PrintAllName(inputarry);
	}
}
