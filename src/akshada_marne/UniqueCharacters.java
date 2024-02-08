package akshada_marne;

public class UniqueCharacters {

	void findUniqueChar(String str) {
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (str.indexOf(ch) == str.lastIndexOf(ch)) {
				System.out.println(ch);
			}
		}
	}

	public static void main(String args[]) {
		UniqueCharacters uniqueCharacters = new UniqueCharacters();
		uniqueCharacters.findUniqueChar("technocredits");
	}

}
