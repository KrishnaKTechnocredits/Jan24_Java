package hiral_purohit;

import java.util.Arrays;

//Push all the zeros at the end of an array.
//int[] arr = {10,-12,6,-3,0,0,-33,44,0,4};
//output : {10,-12,6,-3,-33,44,4,0,0,0};

public class PushZeroAtEnd {

	int[] toGetNewString(int[] input) {
		int[] output = new int[input.length];
		int j = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i] > 0 || input[i] < 0) {
				output[j] = input[i];
				j++;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		int[] arr = { 10, -12, 6, -3, 0, 0, -33, 44, 0, 4 };
		int[] output = new PushZeroAtEnd().toGetNewString(arr);
		System.out.println(Arrays.toString(output));
	}
}
