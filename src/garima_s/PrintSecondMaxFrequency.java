/*Print character with second-highest frequency:
input: aakanksha
output: k->2"
 */

package garima_s;

public class PrintSecondMaxFrequency {

	int getCountCharacter(String input, char targetChar) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == targetChar) {
				count++;
			}
		}
		return count;
	}

	char getMaxCharacter(String input) {
		int max = 0;
		char chMax = ' ';
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			int count = getCountCharacter(input, ch);
			if (max < count) {
				max = count;
				chMax = ch;
			}
		}
		return chMax;
	}

	void printSecondMaxCharacter(String input) {
		char ch = getMaxCharacter(input);
		String str = input.replace(String.valueOf(ch), "");
		ch = getMaxCharacter(str);
		int count = getCountCharacter(str, ch);
		System.out.println(ch + "-->" + count);
	}

	public static void main(String[] args) {
		String input = "aakanksha";
		System.out.print("Character have second highest frequency : ");
		new PrintSecondMaxFrequency().printSecondMaxCharacter(input);
	}
}