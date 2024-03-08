package shramika_vaidya;

import java.util.Arrays;

public class ReturnNewArrayOfSumOfArrayIndexAndSort {

	int[] getMaxNumArray(int[] input1, int[] input2) {
		int[] output = new int[input1.length];
		for (int i = 0; i < input1.length; i++) {
			output[i] = input1[i] + input2[i];
		}
		Arrays.sort(output);
		System.out.println(Arrays.toString(output));
		return output;
	}

	public static void main(String[] args) {
		int[] arr1 = { 23, 34, 46, 67, 87 };
		int[] arr2 = { 65, 43, 78, 45, 90 };
		new ReturnNewArrayOfSumOfArrayIndexAndSort().getMaxNumArray(arr1, arr2);
	}
}
