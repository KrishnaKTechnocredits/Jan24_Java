package gaurav_garg;

public class PrintUniqueCharacterInStringIndexoffAssignemnt24 {

	void printUniqueCharacter(String str) {
		for (int i = 0; i < str.length(); i++) {
			char char1 = str.charAt(i);

			int numb1 = str.indexOf(char1);
			int numb2 = str.lastIndexOf(char1);
			if (numb1 == numb2) {
				System.out.print(char1);
			}
		}
	}

	public static void main(String[] args) {
		new PrintUniqueCharacterInStringIndexoffAssignemnt24().printUniqueCharacter("technocredits");
	}
}
