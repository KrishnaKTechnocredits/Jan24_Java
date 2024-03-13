/*
 Remove digits and whitespace characters:
input: H2i H3el4lo P4un2e5
output: HiHelloPune"
 */
package suresh.array;

public class Assignment61 {

	void getRemoveSpaceDigit(String input) {
		String str = " ";
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (ch != ' ' && !Character.isDigit(ch)) {
				str = str + ch;
			}
		}
		System.out.println(str);

	}

	public static void main(String[] args) {
		Assignment61 assignment61 = new Assignment61();
		assignment61.getRemoveSpaceDigit("H2i H3el4lo P4un2e5");
	}
}
