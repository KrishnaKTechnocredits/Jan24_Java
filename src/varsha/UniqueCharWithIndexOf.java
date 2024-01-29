package varsha;

public class UniqueCharWithIndexOf {

	void printUniqueChar(String input) {
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (input.indexOf(ch) == input.lastIndexOf(ch)) {
				System.out.print(ch);
			}
		}
	}

	public static void main(String[] args) {
		UniqueCharWithIndexOf uniqueCharWithIndexOf = new UniqueCharWithIndexOf();
		uniqueCharWithIndexOf.printUniqueChar("technocredits");
	}

}
