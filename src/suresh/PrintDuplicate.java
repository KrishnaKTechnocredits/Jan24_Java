package suresh;

public class PrintDuplicate {

	void pritntDuplicateChar(String input) {
		for (int i = 0; i <= input.length() - 1; i++) {
			char ch = input.charAt(i);
			{
				if (input.indexOf(ch) == input.lastIndexOf(ch)) {
					System.out.print(ch);
				}
			}

		}
	}

	public static void main(String[] args) {
		new PrintDuplicate().pritntDuplicateChar("technocredits");
	}
}
