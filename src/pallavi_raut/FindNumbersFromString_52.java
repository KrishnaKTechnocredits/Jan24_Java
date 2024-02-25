/*Assignment - 52 : 10th Feb'2024
String[] arr = {"tech1no3cr4edits","prathm5es6h","a4ksha7y","Padmaja"};
output : {134,56,47,0}*/

package pallavi_raut;

public class FindNumbersFromString_52 {

	public static void main(String[] args) {
		String[] arr = { "tech1no3cr4edits", "prathm5es6h", "a4ksha7y", "Padmaja" };
		int output[] = new FindNumbersFromString_52().getOutputString(arr);
		System.out.println("Output String after extracting digits from it: ");
		for (int i = 0; i < output.length; i++) {
			System.out.print(output[i] + " ");
		}
	}

	int[] getOutputString(String[] str) {
		int[] numArray = new int[str.length];
		for (int i = 0; i < str.length; i++) {
			numArray[i] = findDigitsInString(str[i]);
		}
		return numArray;
	}

	int findDigitsInString(String input) {
		String temp = "0";
		for (int index = 0; index < input.length(); index++) {
			if (Character.isDigit(input.charAt(index)))
				temp = temp + input.charAt(index);
		}
		return Integer.parseInt(temp);
	}
}