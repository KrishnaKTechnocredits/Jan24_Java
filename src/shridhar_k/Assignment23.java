//Print all the characters from given String having frequency 1 
//(print unique characters from given string) [without indexOf & lastIndexOf]
package shridhar_k;

public class Assignment23 {

	int frequencyOfChar(String input, char ch) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (ch == input.charAt(index)) {
				count++;
			}
		}
		return count;
	}

	void printCharFreqOne(String inputStr) {
		String output = "";
		for (int index = 0; index < inputStr.length(); index++) {
			int chFreq = frequencyOfChar(inputStr, inputStr.charAt(index));
			if (chFreq == 1) {
				output = output + inputStr.charAt(index);
			}
		}
		System.out.print("Output: " + output);
	}

	public static void main(String[] arg) {
		new Assignment23().printCharFreqOne("technocredits");
	}
}
