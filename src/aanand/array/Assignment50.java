package aanand.array;

public class Assignment50 {
	int getCountOfDigitInSTring(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Assignment50 assignment50 = new Assignment50();
		int output = assignment50.getCountOfDigitInSTring("H2i H3el4lo P4un2e5");
		System.out.println(output);
	}
}
