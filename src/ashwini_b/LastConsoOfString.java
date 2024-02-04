package ashwini_b;

/*
 print last non repetitive consonant of string
 input aakanksha
 output :h
 */
public class LastConsoOfString {

	void printLastConsonent(String input) {
		for (int i = input.length() - 1; i >= 0; i--) {
			char ch = input.charAt(i);
			if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
				if (input.indexOf(ch) == input.lastIndexOf(ch)) {
					System.out.println("Last nonrepetitive consonant is " + ch);
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		LastConsoOfString lastConsoOfString = new LastConsoOfString();
		lastConsoOfString.printLastConsonent("aakanksha");
	}
}
