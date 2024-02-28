
/*Rearrange the numbers in the array, first all negative numbers followed by positive.
int[] arr = {10,-12,6,-3,-33,44,4};
output : [-12,-3,-33,10,6,44,4]   */

package kanchan_ghuge;

import java.util.Arrays;

class Assignment53 {

	void arrangeString(int[] input) {
		int[] output = new int[input.length];
		int j = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] < 0) {
				output[j] = input[index];
				j++;
			}
		}
		for (int index = 0; index < input.length; index++) {
			if (input[index] > 0) {
				output[j] = input[index];
				j++;
			}
		}
		System.out.println("Reaaranged String = " + Arrays.toString(output));
	}

	public static void main(String[] args) {
		int[] arr = { 10, -12, 6, -3, -33, 44, 4 };
		new Assignment53().arrangeString(arr);
	}
}