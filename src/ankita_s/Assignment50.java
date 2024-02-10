package ankita_s;

public class Assignment50 {
	void countofdigits(String str) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				count++;
			}
		}
		System.out.println("count of digit is:-" + count);
	}

	public static void main(String[] args) {
		String str = "H2iH3el4loP4un2e5";
		Assignment50 ass50 = new Assignment50();
		ass50.countofdigits(str);
	}
}
