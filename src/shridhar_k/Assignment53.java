/*
 * Rearrange the numbers in the array, first all negative numbers followed by positive.
int[] arr = {10,-12,6,-3,-33,44,4};
output : [-12,-3,-33,10,6,44,4]
 */

package shridhar_k;

import java.util.Arrays;

public class Assignment53 {

	private int[] rearrange(int[] arr) {
		int[] output = new int[arr.length];
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			int num = arr[i];
			if (num < 0) {
				output[count] = num;
				count++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			int num = arr[i];
			if (num > 0) {
				output[count] = num;
				count++;
			}
		}
		return output;
	}

	void printOutput(int[] intArr) {
		int[] rearranged = rearrange(intArr);
		String output = Arrays.toString(rearranged);
		output = output.replace('[', '{').replace(']', '}');
		System.out.println("output: " + output);
	}

	public static void main(String[] args) {
		Assignment53 assignment53 = new Assignment53();
		int[] arr = { 10, -12, 6, -3, -33, 44, 4 };
		assignment53.printOutput(arr);
	}
}
