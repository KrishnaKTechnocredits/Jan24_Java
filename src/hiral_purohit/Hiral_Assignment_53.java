package hiral_purohit;

import java.util.Arrays;
//Rearrange the numbers in the array, first all negative numbers followed by positive.
//int[] arr = {10,-12,6,-3,-33,44,4};
//output : [-12,-3,-33,10,6,44,4]	

public class Hiral_Assignment_53 {

	int[] toGetArray(int[] arr) {
		int[] output = new int[arr.length];
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				output[j] = arr[i];
				j++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				output[j] = arr[i];
				j++;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		int[] arr = { 10, -12, 6, -3, -33, 44, 4 };
		int[] output = new Hiral_Assignment_53().toGetArray(arr);
		System.out.println(Arrays.toString(output));
	}

}
