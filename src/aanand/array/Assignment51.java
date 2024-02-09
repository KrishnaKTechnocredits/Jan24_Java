package aanand.array;

public class Assignment51 {

	String removeDigitsFromString(String str) {
		String ans="";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (!Character.isDigit(ch)) {
				ans = ans + ch;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		Assignment51 assignment51 = new Assignment51();
		String output = assignment51.removeDigitsFromString("H2i H3el4lo P4un2e5");
		System.out.println(output);
	}
}