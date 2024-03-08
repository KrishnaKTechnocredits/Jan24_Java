package shramika_vaidya;

import java.util.Arrays;

public class ArrayOfMinNumFromBothIndex {

	int[] getMaxNumArray(int[] input1, int[] input2) {
		int length = input1.length > input2.length ? input2.length : input1.length;
		int[] output = new int[length];
		for (int i = 0; i < length; i++) {
			output[i] = input1[i] < input2[i] ? input1[i] : input2[i];
		}
		System.out.println(Arrays.toString(output));
		return output;
	}

	public static void main(String[] args) {
		int[] arr1 = { 23, 34, 46, 67, 87 };
		int[] arr2 = { 65, 43, 78, 45, 90 };
		new ArrayOfMinNumFromBothIndex().getMaxNumArray(arr1, arr2);
	}
}
