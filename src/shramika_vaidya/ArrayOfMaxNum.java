package shramika_vaidya;

import java.util.Arrays;

public class ArrayOfMaxNum {

	int[] getMaxNumArray(int[] input1, int[] input2) {
		int length = input1.length > input2.length ? input2.length : input1.length;
		int[] output = new int[length];
		for (int i = 0; i < length; i++) {
			if (input1[i] > input2[i])
				output[i] = input1[i];
			else
				output[i] = input2[i];
		}
		String str = Arrays.toString(output);
		System.out.println(str);
		return output;
	}

	public static void main(String[] args) {
		int[] arr1 = { 23, 34, 46, 67, 87 };
		int[] arr2 = { 65, 43, 78, 45, 90 };
		new ArrayOfMaxNum().getMaxNumArray(arr1, arr2);

	}
}
