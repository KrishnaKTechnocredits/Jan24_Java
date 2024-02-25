/*String str = "Hello Hi Technocredits Pune";
output:
                  Hello
                     Hi
		  Technocredits
               	   Pune
 */

package puja_poreddiwar;

public class Assignment69 {

	int getMaxLength(String[] str) {
		int temp = 0;
		int maxLength = 0;
		for (int i = 0; i < str.length; i++) {
			String str1 = str[i];
			temp = str1.length();
			if (temp >= maxLength) {
				maxLength = temp;
			}
		}
		return maxLength;
	}

	String getProcessWord(String word, int maxLength) {
		String output = "";
		int requiredSpace = maxLength - word.length();
		for (int i = 0; i < requiredSpace; i++) {
			output = output + " ";
		}
		output += word;
		return output;
	}

	void processData() {
		String str = "Hello Hi Technocredits Pune";
		String[] input = str.split(" ");
		int maxLength = getMaxLength(input);
		for (int i = 0; i < input.length; i++) {
			String output = getProcessWord(input[i], maxLength);
			System.out.println(output);
		}
	}

	public static void main(String[] args) {
		new Assignment69().processData();
	}
}
