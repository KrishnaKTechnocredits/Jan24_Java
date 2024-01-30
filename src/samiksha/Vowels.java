package samiksha;

public class Vowels {

	void printRemainingCh(String str) {
		for (int index = 0; index <= str.length() - 1; index++) {
			char ch = str.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				str = str.replace(ch, '*');
			}
		}
		String input = str.replace("*", "");
		System.out.println(input);
	}

	public static void main(String[] args) {
		Vowels vowels = new Vowels();
		vowels.printRemainingCh("technocredits");
	}

}
