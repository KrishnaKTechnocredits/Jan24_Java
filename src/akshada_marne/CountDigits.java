package akshada_marne;

public class CountDigits {

	void count(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (Character.isDigit(ch)) {
				count++;
			}
		}
		System.out.print(count);

	}

	public static void main(String args[]) {
		CountDigits countDigits = new CountDigits();
		countDigits.count("H2i H3el4lo P4un2e5");
	}
}
