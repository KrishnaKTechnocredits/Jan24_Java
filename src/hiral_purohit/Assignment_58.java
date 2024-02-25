package hiral_purohit;

public class Assignment_58 {

	int toPrintUniqueChar(String str, char targetChar) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (targetChar == ch) {
				count++;
			}
		}
		return count;
	}

	void toPrintlastChar(String str) {
		for (int i = str.length() - 1; i < str.length(); i--) {
			char ch = str.charAt(i);
			int count = toPrintUniqueChar(str, ch);
			if (count == 1) {
				System.out.println("Print last character with minimum frequency: " + ch);
				break;
			}
		}
	}

	public static void main(String[] args) {
		new Assignment_58().toPrintlastChar("aakanksha");
	}

}
