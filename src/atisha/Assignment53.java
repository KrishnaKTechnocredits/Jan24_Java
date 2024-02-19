//Rearrange the numbers in the array, first all negative numbers followed by positive.
package atisha;

import java.util.Arrays;

public class Assignment53 {
	public static void main(String[] args) {
		int[] arr = { 10, -12, 6, -3, -33, 44, 4 };
		new Assignment53().reArranged(arr);
	}

	private void reArranged(int[] arr) {
		int j = 0;
		int[] nArray = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				nArray[j] = arr[i];
				j++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				nArray[j] = arr[i];
				j++;

			}
		}

		System.out.println(Arrays.toString(nArray));
	}
}
