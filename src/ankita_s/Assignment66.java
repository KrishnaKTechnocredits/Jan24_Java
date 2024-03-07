package ankita_s;

public class Assignment66 {

	void replacedigits(String inpStr) {
		String output = inpStr;
		for (int i = 0; i < output.length(); i++) {
			char ch = output.charAt(i);
			if (Character.isDigit(ch)) {
				output = output.replace(ch, '*');
			}
		}
		System.out.println(output);
	}

	public static void main(String[] args) {
		String input = "H2i H3el4lo P4un2e5";
		Assignment66 ass65 = new Assignment66();
		ass65.replacedigits(input);
	}
}
