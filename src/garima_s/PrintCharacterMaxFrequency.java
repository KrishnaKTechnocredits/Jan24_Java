/*Print the character with maximum frequency:
input: TeeCccChH
output: c->4
 */

package garima_s;

public class PrintCharacterMaxFrequency {
	int max;
	char maxCh;

	int getCharacterCount(String input, char targetChar) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (Character.toLowerCase(input.charAt(index)) == targetChar) {
				count++;
			}
		}
		return count;
	}

	void printCharacterMaxFrequency(String input) {
		int chCount = 0;
		char ch = 0;
		for (int index = 0; index < input.length(); index++) {
			ch = Character.toLowerCase(input.charAt(index));
			chCount = getCharacterCount(input, ch);
			if (max < chCount) {
				max = chCount;
				maxCh = ch;
			}
		}
		System.out.println(maxCh + "->" + max);
	}

	public static void main(String[] args) {
		String input = "TeeCccChH";
		System.out.print("Character with Maximum Frequency : ");
		new PrintCharacterMaxFrequency().printCharacterMaxFrequency(input);
	}
}
