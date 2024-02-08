package dharma;

public class CharEx2 {

	void getUniqueChar(String input) {
		for (int index = 0 ; index < input.length() ; index++) {
			char ch = input.charAt(index);
			if (input.indexOf(ch) == input.lastIndexOf(ch)) {
				System.out.print(ch);
			}
		}
	}

	public static void main(String[] args) {
		new CharEx2().getUniqueChar("technocredits");
		
	}
}
