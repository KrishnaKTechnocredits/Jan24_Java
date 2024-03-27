package hiral_purohit;

import java.util.Arrays;

/* find the second highest number from given array using sorting and using array.*/

public class Assignment_95_p2 {

	int[] toGetUniqueElement(int[] arr) {
		int[] temp = new int[arr.length];
		int j = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				temp[j++] = arr[i];
			}
		}
		temp[j++] = arr[arr.length - 1];

		int[] output = new int[j];
		for (int k = 0; k < j; k++) {
			output[k] = temp[k];
		}
		return output;
	}

	void toGetMaxSortedArray(int[] arr, int n) {
		Arrays.sort(arr);
		int[] output = toGetUniqueElement(arr);
		int max = output[output.length - n];
		System.out.println("maximun number is: " + max);
	}

	public static void main(String[] args) {
		int[] input = { 2, 22, 3, 55, 66, 77, 77, 34, 26 };
		Assignment_95_p2 assignment_95_p2 = new Assignment_95_p2();
		System.out.println(".........2th max number.........");
		assignment_95_p2.toGetMaxSortedArray(input, 2);
		System.out.println(".........4th max number.........");
		assignment_95_p2.toGetMaxSortedArray(input, 4);
	}
}
