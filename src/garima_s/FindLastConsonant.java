package garima_s;

public class FindLastConsonant {
	void printLastConsonant(String value) {
		for (int index = (value.length() - 1); index >= 0; index--) {
			char ch = value.charAt(index);
			if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
				System.out.println(ch);
				break;
			}
		}

	}

	public static void main(String[] args) {
		new FindLastConsonant().printLastConsonant("aakansha");
	}
}