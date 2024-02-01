package suresh;

public class DontPrintDuplicateChar {

	void getTheChar(String input) {
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (i == input.indexOf(ch))
				//System.out.println(i);
			if (input.indexOf(ch) != input.lastIndexOf(ch)) {
				System.out.println(ch);
			}
		}
	}

	public static void main(String[] args) {
		new DontPrintDuplicateChar().getTheChar("aakanksha");
	}
}
