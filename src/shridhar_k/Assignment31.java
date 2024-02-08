//Write a program to find character having maximum frequency from given String.

package shridhar_k;

public class Assignment31 {
	int getFreqencyOfChar(String inputStr , char ch) {
		int count = 0;
		for (int i =0 ; i < inputStr.length() - 1; i++) {
			if(inputStr.charAt(i) == ch) {
				count++;
			}
		}
		return count;
	}
	
	void processData(String inputStr) {
		int maxFreq = 1;
		char charOfMaxFreq = ' ';
		System.out.println("input: " + inputStr);
		for(int i =0; i < inputStr.length() - 1 ; i++) {
			char ch = inputStr.charAt(i);
			int charFreq = getFreqencyOfChar(inputStr, ch);
			if (maxFreq < charFreq) {
				maxFreq = charFreq;
				charOfMaxFreq = ch;
			}
		}
		if(maxFreq == 1) {
			System.out.println( inputStr + " having all unique characters.");
		}
		else
			System.out.println("Output: " + inputStr + " -> " + charOfMaxFreq + " -> " + maxFreq);
		System.out.println();
	}
	
	public static void main(String[] args) {
		Assignment31 assignment31 = new Assignment31();
		String input = "aakanksha";
		assignment31.processData(input);
		input = "teecccchnoceredites";
		assignment31.processData(input);
		input = "maulik";
		assignment31.processData(input);

	}

}
