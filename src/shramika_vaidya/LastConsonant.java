package shramika_vaidya;

public class LastConsonant {

	void printLastConsonant(String str) {
		for (int i = str.length() - 1; i >= 0; i--) {
			char ch = str.charAt(i);
			if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
				System.out.println(ch);
				break;
			}
		}
	}

	public static void main(String[] args) {
		new LastConsonant().printLastConsonant("aakansha");
	}
}
