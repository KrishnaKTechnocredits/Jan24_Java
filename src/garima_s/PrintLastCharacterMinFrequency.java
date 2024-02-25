/*Print last character with minimum frequency:
input: aakanksha
output: h->1
 */

package garima_s;

public class PrintLastCharacterMinFrequency {
	void printLastCharacterMinFrequency(String input) {
		int count=0;
		for (int index = (input.length() - 1); index >= 0; index--) {
			char ch = input.charAt(index);
			if (input.indexOf(ch) == input.lastIndexOf(ch)) {
				count++;
				System.out.println(ch+"-->"+count);
				break;
			}
		}
	}

	public static void main(String[] args) {
		String input = "aakankaha";
		System.out.print("Last Character with Minimum Frequency : ");
		new PrintLastCharacterMinFrequency().printLastCharacterMinFrequency(input);
	}
}
