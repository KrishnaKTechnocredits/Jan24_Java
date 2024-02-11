/*
 * Assignment - 53 : 11th Feb'2024
Rearrange the numbers in the array, first all negative numbers followed by positive.
int[] arr = {10,-12,6,-3,-33,44,4};
output : [-12,-3,-33,10,6,44,4]	
*/

package sarang_kulkarni;

import java.util.Arrays;

public class RearrangeNumbersInArr {

	int[] rearrange(int input[]) {
		
		int j = 0, i = 0;
		int arr[] = new int[input.length];
		for (i = 0; i < input.length; i++) {
			if (input[i] < 0) {
				arr[j] = input[i];
				j++;
			}
		}
		for (i = 0; i < input.length; i++) {
			if (input[i] > 0) {
				arr[j] = input[i];
				j++;
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int arr[] = { 10, -12, 6, -3, -33, 44, 4 };
		RearrangeNumbersInArr rearrange = new RearrangeNumbersInArr();
		int[] output = rearrange.rearrange(arr);
		System.out.println(Arrays.toString(output));
	}
}
