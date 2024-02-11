/*Push all the zeros at the end of an array.
input arr = {10,-12,6,-3,0,0,-33,44,0,4};
output : {10,-12,6,-3,-33,44,4,0,0,0}; 
 */
package rupali_umagol;

import java.util.Arrays;

public class Assignment54 {

	static int[] getZeroEnd(int[] input) {
		int j = 0;
		int[] output = new int[input.length];
		for (int i = 0; i < input.length; i++) {
			if (input[i] != 0) {
				output[j] = input[i];
				// System.out.println(output[j]);
				j++;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		int[] input = { 10, -12, 6, -3, 0, 0, -33, 44, 0, 4 };
		int[] output = getZeroEnd(input);
		System.out.println(Arrays.toString(output));
	}
}