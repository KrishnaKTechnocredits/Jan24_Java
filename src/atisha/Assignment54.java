//Push all the zeros at the end of an array.//int[] arr = {10,-12,6,-3,0,0,-33,44,0,4};//output : {10,-12,6,-3,-33,44,4,0,0,0};
package atisha;

import java.util.Arrays;

public class Assignment54 {
	public static void main(String[] args) {
		int[] arr = { 10, -12, 6, -3, 0, 0, -33, 44, 0, 4 };
		new Assignment54().getZeroAtEnd(arr);
	}

	private void getZeroAtEnd(int[] arr) {
		int j = 0;
		int[] output = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				output[j] = arr[i];
				j++;
			}
		}
		System.out.println(Arrays.toString(output));
	}
}
