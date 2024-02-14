/*  	
Count and print frequency of each character:
input: technocredits
output:
t:2, e:2, c:2, h:1, n:1, o:1, r:1, i:1, d:1, s:1 
*/

package garima_s;

public class PrintFrequencyCharacter {

	int count2Characters(String input, char targetChar) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == targetChar) {
				count++;
			}
		}
		return count;
	}

	void printCharacter(String input) {
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (!isCharMax2(input, ch, index)) {
				int chCount = count2Characters(input, ch);
				System.out.print(ch + ":" + chCount + " ");
			}
		}
	}

	boolean isCharMax2(String input, char targetChar, int count) {
		for (int index = 0; index < count; index++) {
			if (input.charAt(index) == targetChar) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		String input = "technocredits";
		System.out.print("Frequency of each Character : ");
		new PrintFrequencyCharacter().printCharacter(input);
	}
}
