package priya_t;

public class ProgrammingTest2_lastConsonantfromString {

	public void printchar(String str) {
		str = str.toLowerCase();
		char c = ' ';
		int count = 0;
		for (int i = str.length() - 1; i >= 0; i--) {
			char ch = str.charAt(i);
			if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
				if (str.indexOf(ch) == str.lastIndexOf(ch)) {
					System.out.println(ch);
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		ProgrammingTest2_lastConsonantfromString lastno = new ProgrammingTest2_lastConsonantfromString();
		lastno.printchar("aakansha");
	}
}
