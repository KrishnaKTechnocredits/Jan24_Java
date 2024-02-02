package aanand;

public class Assignment25 {

	void duplicateCharInString(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (i == str.indexOf(ch)) {
				if (str.indexOf(ch) != str.lastIndexOf(ch)) {
					System.out.print(ch);
				}
			}
		}
	}

	public static void main(String[] args) {
		Assignment25 assignment25 = new Assignment25();
		assignment25.duplicateCharInString("aakanksha");
	}
}