package varsha;

//WAP to remove all digits from given String.
//String str = "H2i H3el4lo P4un2e5";
//output : Hi Hello Pune

public class SimpleString {

	String getStringWithoutDigit(String input) {
		String output = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (!Character.isDigit(ch)) {
				output = output + ch;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		String input = "H2i H3el4lo P4un2e5";
		String str = new SimpleString().getStringWithoutDigit(input);
		System.out.println(str);
	}
}
