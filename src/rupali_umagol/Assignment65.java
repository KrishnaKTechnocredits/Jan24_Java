/*"Remove digits and whitespace characters:
input: H2i H3el4lo P4un2e5
output: HiHelloPune"*/
package rupali_umagol;

public class Assignment65 {
	public static void main(String[] args) {
		String input = "H2i H3el4lo P4un2e5";
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isDigit(ch)) {
				input = input.replace(Character.toString(ch), " ");
			}
		}
		System.out.println(input.replaceAll(" ", ""));
	}
}
