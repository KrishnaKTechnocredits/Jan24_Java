package ankita_s;

public class Assignment56 {

	void unqvowels(String Str) {
		int count = 0;
		Str = Str.toLowerCase();
		for (int i = 0; i < Str.length(); i++) {
			char ch = Str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				if (Str.indexOf(ch) == Str.lastIndexOf(ch)) {
					System.out.print(ch);
				}
			}
		}
	}

	public static void main(String[] args) {
		String input = "technocredits";
		Assignment56 ass56 = new Assignment56();
		ass56.unqvowels(input);
	}
}
