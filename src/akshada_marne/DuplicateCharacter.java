package akshada_marne;

public class DuplicateCharacter {

	void findDuplicateChar(String str) {
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (index == str.indexOf(ch)) {
				if (str.indexOf(ch) != str.lastIndexOf(ch)) {
					System.out.print(ch);
				}
			}
		}
	}

	public static void main(String args[]) {
		DuplicateCharacter duplicateCharacter = new DuplicateCharacter();
		duplicateCharacter.findDuplicateChar("aakanksha");
	}

}
