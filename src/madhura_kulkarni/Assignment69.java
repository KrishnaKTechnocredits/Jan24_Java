/*Assignment- 69 : 22nd Feb'2024
String str = "Hell2lo Hi Technocredits Pune";
output :
        Hello
           Hi
Technocredits
         Pune
*/

package madhura_kulkarni;

public class Assignment69 {

	int findMaxLen(String[] arr) {
		int maxLength = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length() > maxLength) {
				maxLength = arr[i].length();
			}
		}
		return maxLength;
	}

	String removeDigitFromString(String input) {
		String output = "";
		for (int i = 0; i < input.length(); i++) {
			if (!Character.isDigit(input.charAt(i))) {
				output = output + input.charAt(i);
			}
		}
		return output;
	}

	String addSpaceInString(String str1, int maxLen) {
		String output = removeDigitFromString(str1);
		int reqSpace = maxLen - output.length();
		String str2 = "";
		for (int i = 0; i < reqSpace; i++) {
			str2 = str2 + " ";
		}
		return str2 + output;
	}

	void rightAllignString(String str) {
		String array[] = str.split(" ");
		String[] output = new String[array.length];
		for (int i = 0; i < array.length; i++) {
			int maxWordLength = findMaxLen(array);
			String outputString = addSpaceInString(array[i], maxWordLength);
			output[i] = outputString;
			System.out.println(output[i]);
		}
	}

	public static void main(String[] args) {
		String str = "Hel12lo Hi Technocredits Pune";
		new Assignment69().rightAllignString(str);
	}

}
