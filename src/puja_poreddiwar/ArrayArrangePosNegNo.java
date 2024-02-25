/*
 Assignment - 53 : 11th Feb'2024
Rearrange the numbers in the array, first all negative numbers followed by positive.
int[] arr = {10,-12,6,-3,-33,44,4};
output : [-12,-3,-33,10,6,44,4]	
 */

package puja_poreddiwar;

import java.util.Arrays;

public class ArrayArrangePosNegNo {

	static int[] reArrangeArray(int[] arr) {

		String neOutput = "";
		String peOutput = "";

		for (int index = 0; index < arr.length; index++) {
			if (arr[index] < 0) {
				neOutput = neOutput + arr[index] + ",";
			} else {
				peOutput = peOutput + arr[index] + ",";
			}
		}
		String output = neOutput + peOutput;
		output = output.substring(0, output.length() - 1);

		String[] strArr = output.split(",");
		for (int index = 0; index < arr.length; index++)
			arr[index] = Integer.parseInt(strArr[index]);
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = { 10, -12, 6, -3, -33, 44, 4 };
		int[] output = ArrayArrangePosNegNo.reArrangeArray(arr);
		System.out.println(Arrays.toString(output));
	}

}
