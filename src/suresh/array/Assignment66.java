/*
 "Replace digits with a specific character ('*'):
input: H2i H3el4lo P4un2e5
output: H*i H*el*lo P*un*e*"
 */
package suresh.array;

public class Assignment66 {

	void getRemoveTheDigit(String input) {

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			boolean flage = (Character.isDigit(ch));
			if (flage == true) {

				input = input.replace(Character.toString(ch), "*");

			}

		}
		System.out.println(input);
	}

	public static void main(String[] args) {
		String input = "H2i H3el4lo P4un2e5";

		Assignment66 assignment66 = new Assignment66();
		assignment66.getRemoveTheDigit(input);
	}
}
