// Push all the zeros at the end of an array.
//int[] arr = {10,-12,6,-3,0,0,-33,44,0,4};
//output : {10,-12,6,-3,-33,44,4,0,0,0};

package sasmita;

import java.util.Arrays;

public class Assignement54 {

	int[] getNewArray(int[] arr) {
		int[] output = new int[arr.length];
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0 || arr[i] > 0) {
				output[j] = arr[i];
				j++;
			}
		}

		return output;
	}

	public static void main(String[] args) {
		int[] arr = { 10, -12, 6, -3, 0, 0, -33, 44, 0, 4 };
		int[] output = new Assignement54().getNewArray(arr);
		System.out.println(Arrays.toString(output));

	}

}