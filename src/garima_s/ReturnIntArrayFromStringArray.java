/*Return an integer array from a String Array
 * input={ "tech1no3cr4edits", "prathm5es6h", "a4ksha7y", "padmaja" }
 * output=134
56
47
0
 */

package garima_s;

public class ReturnIntArrayFromStringArray {
	int getIntFromString(String name) {
		String temp = "0";
		for (int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			if (Character.isDigit(ch)) {
				temp += ch;
			}
		}
		return Integer.parseInt(temp);
	}

	void displayIntArray(String[] input) {
		int[] output = new int[input.length];
		System.out.println("Interger Array from String Array :");
		for (int index = 0; index < input.length; index++) {
			output[index] = getIntFromString(input[index]);
			System.out.println(output[index]);
		}
	}

	public static void main(String[] args) {
		String[] input = { "tech1no3cr4edits", "prathm5es6h", "a4ksha7y", "padmaja" };
		new ReturnIntArrayFromStringArray().displayIntArray(input);
	}
}
