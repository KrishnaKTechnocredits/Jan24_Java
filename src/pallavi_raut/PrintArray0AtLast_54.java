/*Assignment - 54 : 11th Feb'2024
Push all the zeros at the end of an array.
int[] arr = {10,-12,6,-3,0,0,-33,44,0,4};
output : {10,-12,6,-3,-33,44,4,0,0,0};*/
package pallavi_raut;

import java.util.Arrays;

public class PrintArray0AtLast_54 {

	public static void main(String[] args) {
		int[] arr = { 10, -12, 6, -3, 0, 0, -33, 44, 0, 4 };
		new PrintArray0AtLast_54().rearrangeString0AtLast(arr);
	}

	void rearrangeString0AtLast(int[] input) {
		int[] output = new int[input.length];
		int j = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i] != 0) {
				output[j] = input[i];
				j++;
			}
		}
		for (int index = 0; index < input.length; index++) {
			if (input[index] == 0) {
				output[j] = input[index];
				j++;
			}
		}
		System.out.print("Rearranged string is by adding 0 at last: " + Arrays.toString(output));
	}
}