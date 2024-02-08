package ankita_s;

public class LastConsonantInString {
	char conso;

	void printLastConsonantInString(String str) {

		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
				conso = ch;
			}
		}
		System.out.println("Last consonemt in the string is:- " + conso);
	}

	public static void main(String[] args) {
		LastConsonantInString lastConsonantInString = new LastConsonantInString();
		lastConsonantInString.printLastConsonantInString("aakansha");
	}
}
