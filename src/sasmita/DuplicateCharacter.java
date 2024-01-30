package sasmita;

public class DuplicateCharacter {

	void dupchar(String str) {
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (index == str.indexOf(ch)) {
				if (str.indexOf(ch) != str.lastIndexOf(ch)) {
					System.out.println(str.charAt(index));
				}
			}
		}
	}

	public static void main(String[] args) {
		DuplicateCharacter dupli = new DuplicateCharacter();
		dupli.dupchar("aakanksha");
	}
}
