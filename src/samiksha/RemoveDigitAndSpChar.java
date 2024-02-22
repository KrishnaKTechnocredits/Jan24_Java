package samiksha;

public class RemoveDigitAndSpChar {

	void removeDigitAndSpCh(String str) {
		String output = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isLetter(ch)) {
				output = output + ch;
			}
		}
		System.out.println(output);
	}

	public static void main(String[] args) {
		new RemoveDigitAndSpChar().removeDigitAndSpCh("H2i H3el4lo P4un2e5");
	}
}
