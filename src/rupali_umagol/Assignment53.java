//Rearrange the numbers in the array, first all negative numbers followed by positive.
//input :  arr = {10,-12,6,-3,-33,44,4};
//output : [-12,-3,-33,10,6,44,4];
package rupali_umagol;

import java.util.Arrays;

public class Assignment53 {

	int[] getSortedArray(int[] input) {
		int j = 0;
		int[] arr = new int[input.length];
		for (int i = 0; i < input.length; i++) {
			if (input[i] < 0) {
				arr[j] = input[i];
				j++;
			}
		}
		for (int i = 0; i < input.length; i++) {
			if (input[i] > 0) {
				arr[j] = input[i];
				j++;
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		Assignment53 assignment53 = new Assignment53();
		int[] arr = { 10, -12, 6, -3, -33, 44, 4 };
		int[] output = assignment53.getSortedArray(arr);
		System.out.println(Arrays.toString(output));
	}
}