/*"Replace digits with a specific character ('*'):
input: H2i H3el4lo P4un2e5
output: H*i H*el*lo P*un*e*"*/

package akshay_gaikwad;

public class ReplaceDigitWithStar {
	
	String replaceDigitsWithStar(String input) {
		for(int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch))
				input = input.replace(ch, '*');
		}
		return input;
	}
	
	public static void main(String[] args) {
		System.out.println(new ReplaceDigitWithStar().replaceDigitsWithStar("H2i H3el4lo P4un2e5"));
	}
}
