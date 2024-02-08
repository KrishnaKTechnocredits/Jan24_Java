/*Assignment - 37: 4th Feb'2024
Print all the names with their frequency from given array.
 
input: {"techno", "credits", "samikash", "varsha", "techno"}
output:
techno = 2
credits=1
samikash=1
varsha=1 */

package padmaja;

public class PrintNameswithFreq {

	void getFreqOfString(String[] arr, String str) {
		int freqCount = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] == str)
				freqCount++;
		}
		System.out.println("Freq Count of " + str + " is " + freqCount);
	}

	void countNameFreq(String[] str) {
		for (int index = 0; index < str.length; index++) {
			String temp = str[index];

			for (int Index = index + 1; Index < str.length; Index++) {
				if (temp != str[Index]) {
					getFreqOfString(str, str[index]);
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		String input[] = { "techno", "credits", "samikash", "varsha", "techno" };
		PrintNameswithFreq freq = new PrintNameswithFreq();
		freq.countNameFreq(input);
	}
}
