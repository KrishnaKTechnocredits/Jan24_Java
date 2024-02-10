package shafaque;

public class Assignment51 {

	String printStringWithoutDigit(String str) {
		String output = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (!Character.isDigit(ch)) {
				output = output + ch;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		String input = "H2i H3el4lo P4un2e5";
		String str = new Assignment51().printStringWithoutDigit(input);
		System.out.println(str);
	}

}
