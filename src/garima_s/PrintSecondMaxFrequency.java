/*Print character with second-highest frequency:
input: aakanksha
output: k->2"
 */

package garima_s;

public class PrintSecondMaxFrequency {
	int max, secMax;
	char chMax;

	int getCountCharacter(String input, char targetChar) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == targetChar) {
				count++;
			}
		}
		return count;
	}

	void printSecondMaxCharacter(String input) {
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			int count = getCountCharacter(input, ch);
			if (max < count) {
				secMax = max;
				max = count;
				chMax = ch;
			} else if (secMax < count && max > count) {
				secMax = count;
				chMax = ch;
			}
		}
		System.out.println(chMax + "-->" + secMax);
	}

	public static void main(String[] args) {
		String input = "aakanksha";
		System.out.print("Character have second highest frequency : ");
		new PrintSecondMaxFrequency().printSecondMaxCharacter(input);
	}
}