/*Assignment - 53 : 11th Feb'2024
Rearrange the numbers in the array, first all negative numbers followed by positive.
int[] arr = {10,-12,6,-3,-33,44,4};
output : [-12,-3,-33,10,6,44,4]	*/
package pallavi_raut;

import java.util.Arrays;

public class RearrangeArrayNegativeFirst_53 {

	public static void main(String[] args) {
		int[] arr = { 10, -12, 6, -3, -33, 44, 4 };
		RearrangeArrayNegativeFirst_53 rearrangeArrayNegativeFirst = new RearrangeArrayNegativeFirst_53();
		rearrangeArrayNegativeFirst.rearrangeArray(arr);
	}

	void rearrangeArray(int[] input) {
		int[] output = new int[input.length];
		int j = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i] < 0) {
				output[j] = input[i];
				j++;
			}
		}

		for (int index = 0; index < input.length; index++) {
			if (input[index] > 0) {
				output[j] = input[index];
				j++;
			}
		}
		System.out.print("Rearranged array: " + Arrays.toString(output));
	}
}