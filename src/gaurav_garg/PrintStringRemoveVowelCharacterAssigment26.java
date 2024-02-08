package gaurav_garg;

public class PrintStringRemoveVowelCharacterAssigment26 {

	void printStringWihoutVowelCharacter(String str) {
		for (int i = 0; i < str.length(); i++) {
			char char1 = str.charAt(i);

			if (char1 == 'a' || char1 == 'e' || char1 == 'i' || char1 == 'o' || char1 == 'u') {
				str = str.replace(char1, '*');
			}
		}
		str = str.replace("*", "");
		System.out.print(str);
	}

	public static void main(String[] args) {
		new PrintStringRemoveVowelCharacterAssigment26().printStringWihoutVowelCharacter("technocredits");
	}
}
