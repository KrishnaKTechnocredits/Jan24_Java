package shramika_vaidya;

import java.util.Arrays;

public class TwoArrayMerge {

	int[] getNewMergedArray(int[] input1, int[] input2) {
		int length = input1.length + input2.length;
		int[] output = new int[length];
		int j = 0;
		for (int i = 0; i < input1.length; i++) {
			output[j] = input1[i];
			j++;
		}
		for (int i = 0; j < length; i++) {
			output[j] = input2[i];
			j++;
		}
		System.out.println(Arrays.toString(output));
		return output;
	}

	public static void main(String[] args) {
		int[] arr1 = { 23, 34, 46, 67, 87 };
		int[] arr2 = { 65, 43, 78, 45, 90 };
		new TwoArrayMerge().getNewMergedArray(arr1, arr2);
	}
}
