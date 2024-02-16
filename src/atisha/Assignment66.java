//"Replace digits with a specific character ('*'):
//input: H2i H3el4lo P4un2e5
package atisha;

public class Assignment66 {

	String replaceDigit(String input) {

//		String str = input.toLowerCase();

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isDigit(ch)) {
				input = input.replace(ch, '*');

			}
		}
		System.out.println(input);
		return input;
	}

	public static void main(String[] args) {
		new Assignment66().replaceDigit("H2i H3el4lo P4un2e5");
	}
}
