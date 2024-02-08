package hiral_purohit;

public class LastConsonant {

	void printConsonant(String str) {
		char lastCon = ' ';
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
				lastCon = ch;
			}
		}
		System.out.println("Last consonant character is " + lastCon);
	}

	public static void main(String[] args) {
		new LastConsonant().printConsonant("aakansha");
	}

}
