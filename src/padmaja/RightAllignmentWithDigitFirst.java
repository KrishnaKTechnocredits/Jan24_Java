/*Assignment - 70 WAP for Right Allignment with digits first.
 * String str = "H5el2lo Hi Tech3noc2redits Pulne";
output: 
        5бне11о
             Hi
32Technocredits
          1Pune
 */

package padmaja;

public class RightAllignmentWithDigitFirst {

	int getMaxLength(String[] str) {
		int maxLength = 0;
		for (int index = 0; index < str.length; index++) {
			int length = str[index].length();
			if (maxLength < length)
				maxLength = length;
		}
		return maxLength;
	}

	String getDigitFirst(String str) {
		String output1 = "";
		String output2 = "";
		String finalOutput = "";

		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch))
				output1 = output1 + ch;
			else if (Character.isLetter(ch))
				output2 = output2 + ch;
		}
		finalOutput = output1 + output2;
		return finalOutput;
	}

	String getSpaceCount(String str, int maxLength) {
		int spaceLength = maxLength - str.length();
		String spaceCount = "";
		for (int index = 0; index < spaceLength; index++) {
			spaceCount = spaceCount + " ";
		}
		return spaceCount;
	}

	void rightAllignedOutput(String[] arr) {
		String finalOutput = "";
		int maxLength = getMaxLength(arr);
		for (int index = 0; index < arr.length; index++) {
			String spaceCount = getSpaceCount(arr[index], maxLength);
			String output = getDigitFirst(arr[index]);
			finalOutput = spaceCount + output;
			System.out.println(finalOutput);
		}
	}

	public static void main(String[] args) {
		String input = "H5el2lo Hi Tech3noc2redits Pu1ne";
		String[] arr = input.split(" ");
		new RightAllignmentWithDigitFirst().rightAllignedOutput(arr);
	}
}