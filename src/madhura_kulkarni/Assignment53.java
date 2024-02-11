/*Assignment - 53 : 11th Feb'2024
Rearrange the numbers in the array, first all negative numbers followed by positive.
int[] arr = {10,-12,6,-3,-33,44,4};
output : [-12,-3,-33,10,6,44,4]	*/

package madhura_kulkarni;

import java.util.Arrays;

public class Assignment53 {

	void rearrangeString(int[] input) {
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
		System.out.print("Rearranged string: " + Arrays.toString(output));
	}

	public static void main(String[] args) {
		int[] arr = { 10, -12, 6, -3, -33, 44, 4 };
		new Assignment53().rearrangeString(arr);
	}

}
