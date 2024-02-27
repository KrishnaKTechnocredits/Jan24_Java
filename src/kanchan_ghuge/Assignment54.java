/*Push all the zeros at the end of an array.
int[] arr = {10,-12,6,-3,0,0,-33,44,0,4};
output : {10,-12,6,-3,-33,44,4,0,0,0};  */

package kanchan_ghuge;

import java.util.Arrays;

class Assignment54 {

	void rearrangeString(int[] input) {
		int[] output = new int[input.length];
		int j = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] != 0) {
				output[j] = input[index];
				j++;
			}
		}
		for (int index = 0; index < input.length; index++) {
			if (input[index] == 0) {
				output[j] = input[index];
				j++;
			}
		}
		System.out.println("Rearranged String is = " + Arrays.toString(output));
	}

	public static void main(String[] args) {
		int[] arr = { 10, -12, 6, -3, 0, 0, -33, 44, 0, 4 };
		new Assignment54().rearrangeString(arr);
	}
}
