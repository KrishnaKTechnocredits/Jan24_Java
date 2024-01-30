package garima_s;

public class UniqueCharacter {

	void printCharacter(String str) {
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (str.indexOf(ch) == str.lastIndexOf(ch)) {
				System.out.print(str.charAt(index));
			}
		}
	}

	public static void main(String[] args) {
		System.out.print("Unique Characters of given String : ");
		new UniqueCharacter().printCharacter("technocredits");
	}
}