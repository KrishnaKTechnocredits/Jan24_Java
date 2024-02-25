package gaurav_garg;

import java.util.Arrays;

public class RearrangeArrayPositiveToNegativeAssignment53 {

	void printArrayAscedingToDesceding(int[] arr) {
		int j = 0;
		int[] arr2 = new int[arr.length];
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] < 0) {
				arr2[j] = arr[index];
				j++;
			}
		}
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] > 0) {
				arr2[j] = arr[index];
				j++;
			}
		}

		System.out.println(Arrays.toString(arr2));

	}

	public static void main(String[] args) {
		int[] arr = { 10, -12, 6, -3, -33, 44, 4 };
		new RearrangeArrayPositiveToNegativeAssignment53().printArrayAscedingToDesceding(arr);

	}
}
