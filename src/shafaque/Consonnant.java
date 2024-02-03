package shafaque;

public class Consonnant {

	void outConsonnant() {
		String str = "aakansha";
		str = str.toLowerCase();
		char lastConsonantChar = '*';
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (ch != 'a' || ch != 'e' || ch != 'i' || ch != 'o' || ch != 'u') {
				if (str.indexOf(ch) == str.lastIndexOf(ch)) {
					lastConsonantChar = str.charAt(index);
				}

			}
		}
		System.out.println("The last consonant in string is " + lastConsonantChar);
	}

	public static void main(String[] args) {
		new Consonnant().outConsonnant();
	}

}
