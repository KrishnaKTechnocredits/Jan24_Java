package priya_t;

public class UniqueCharacterinString {

	void printUniqueChar() {

		String str = "technocredits";

		for (int index = 0; index < str.length(); index++) {

			if (str.indexOf(str.charAt(index)) == str.lastIndexOf(str.charAt(index)))
				System.out.println(str.charAt(index) + "  is unique");
        }

	}

	public static void main(String[] args) {

		UniqueCharacterinString uniquecharacter = new UniqueCharacterinString();
		uniquecharacter.printUniqueChar();
	}
 }
