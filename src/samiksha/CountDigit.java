package samiksha;

public class CountDigit {

	void printCountOfDigit(String str) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				count++;
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		new CountDigit().printCountOfDigit("H2i H3el4lo P4un2e5");
	}
}
