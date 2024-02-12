/*
 Assignment - 54 : 11th Feb'2024
Push all the zeros at the end of an array.
int[] arr = {10,-12,6,-3,0,0,-33,44,0,4};
output : {10,-12,6,-3,-33,44,4,0,0,0};
 */

package puja_poreddiwar;

import java.util.Arrays;

public class ArrayArrange1 {

	static int[] reArrangeArray1(int[] arr) {

		String PosNegOutput = "";
		String zeroOutput = "";

		for (int index = 0; index < arr.length; index++) {
			if (arr[index] != 0) {
				PosNegOutput = PosNegOutput + arr[index] + ",";
			}if (arr[index] == 0) {
				zeroOutput = zeroOutput + arr[index] + ",";
			}
		}
		String output = PosNegOutput + zeroOutput;
		output = output.substring(0, output.length() - 1);

		String[] strArr = output.split(",");
		for (int index = 0; index < arr.length; index++)
			arr[index] = Integer.parseInt(strArr[index]);
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = { 10, -12, 6, -3, 0, 0, -33, 44, 0, 4 };
		int[] output = ArrayArrange1.reArrangeArray1(arr);
		System.out.println(Arrays.toString(output));
	}

}
