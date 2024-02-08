package pallavi_raut;

public class FindLastConsonantinString {
	// char ch;

	void printLastConsonantinString(String str) {
		char ch;
		for (int index = str.length() - 1; index >= 0; index--) {
			ch = str.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {	
			}
			else {
				System.out.println("Last consonant in string is  " + str.charAt(index));
				break;
			}
		}

	}

	public static void main(String[] args) {
		FindLastConsonantinString findLastConsonantinString = new FindLastConsonantinString();
		findLastConsonantinString.printLastConsonantinString("Akanksha");
	}
}
