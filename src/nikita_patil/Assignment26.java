package nikita_patil;

public class Assignment26 {
	void removeVowels(String input) {
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				input = input.replace(ch, '*');
			}
		}
		input = input.replace("*", "");
		System.out.println(input);

	}

	public static void main(String[] args) {
	Assignment26 a = new Assignment26();
		a.removeVowels("technocredits");
	}

}



