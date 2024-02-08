package aanand;

public class Assignment41 {

	boolean isStartWithVowel(String str) {
		char ch = str.charAt(0);
		ch = Character.toLowerCase(ch);
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			return true;
		} else
			return false;
	}

	boolean isDigitInString(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				return true;
			}
		}
		return false;
	}

	void printArray(String[] name) {
		for (int i = 0; i < name.length; i++) {
			if (isStartWithVowel(name[i]) == true && isDigitInString(name[i]) == true) {
				System.out.println(name[i]);
			}
		}
	}

	public static void main(String[] args) {
		String[] name = { "Aakansha", "Aas3hvi", "Isha", "I2sh4a4n", "Var2sha" };
		Assignment41 assignment41 = new Assignment41();
		assignment41.printArray(name);
	}
}