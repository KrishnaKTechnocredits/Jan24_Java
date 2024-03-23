/*
 * 
 Assignment - 83 - 21st March'2024
 
 "I__am___in_pune____
Output:
I -> 2
am -> 3
in -> 1
pune -> 4"
 */

package phenol_verma;

public class UnderScoreCount {

	public static void printUnderscoreLengths(String input) {
		int startUnderscore = 0;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == '_') {
				if (index > startUnderscore) {
					String word = input.substring(startUnderscore, index);
					int underscoreCount = countUnderscores(input, index);
					System.out.println(word + " -> " + underscoreCount);
					startUnderscore = index + underscoreCount;
				}
			} else if (index == input.length() - 1) {
				String word = input.substring(startUnderscore, index + 1);
				int underscoreCount = countUnderscores(input, index);
				System.out.println(word + " -> " + underscoreCount);
			}
		}
	}

	public static int countUnderscores(String input, int index) {
		
		int count = 0;
		for (int i = index; i < input.length(); i++) {
			if (input.charAt(i) == '_') {
				count++;
			} else {
				break;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		String input = "I__am___in_pune____Hi";
		System.out.println("Original String - " + input);
		System.out.println("*******Output*******");
		printUnderscoreLengths(input);
	}

}
