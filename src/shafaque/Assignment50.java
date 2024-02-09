package shafaque;

public class Assignment50 {

	int countOfDigit(String str) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		String str = "H2i H3el4lo P4un2e5";
		int count = new Assignment50().countOfDigit(str);
		System.out.println(count);

	}

}
