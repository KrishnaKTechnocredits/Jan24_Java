/*Assignment- 70 : 22nd Feb'2024
String str = "H5el6lo Hi Tech3noc2redits Pulne";
output :
        56Hello
             Hi
32Technocredits
          1Pune
*/

package madhura_kulkarni;

public class Assignment70 {

	int findMaxLen(String[] arr) {
		int maxLength = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length() > maxLength) {
				maxLength = arr[i].length();
			}
		}
		return maxLength;
	}

	String checkDigitFromString(String input) {
		String output = "";
		String digitString="";
		for (int i = 0; i < input.length(); i++) {
			if (Character.isDigit(input.charAt(i))) {
				digitString = digitString + input.charAt(i);
			}
			else {
				output = output + input.charAt(i);
				}
			}
		return digitString + output;
	}

	String addSpaceInString(String str1, int maxLen) {
		String output = checkDigitFromString(str1);
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
		String str = "H5el6lo Hi Tech3noc2redits Pu1ne";
		new Assignment70().rightAllignString(str);
	}

}
