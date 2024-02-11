package ankita_s;

public class Assignment51 {

	void removedigits(String input) {
		String str1 = "";
		for (int i = 0; i < input.length(); i++) {
			if (!Character.isDigit(input.charAt(i))) {
				str1 += input.charAt(i);
			}
		}
		System.out.println(str1);
	}

	public static void main(String[] args) {
		String str = "H2i H3el4lo P4un2e5";
		Assignment51 ass51 = new Assignment51();
		ass51.removedigits(str);
	}
}
