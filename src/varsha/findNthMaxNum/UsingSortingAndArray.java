package varsha.findNthMaxNum;

import java.util.Arrays;

//1. find the second highest number from given array using sorting and using array.
//input : {2,22,3,55,66,77,77,34,26}
//output : 66

public class UsingSortingAndArray {

	int findNthMaxNumber(int[] numbers, int target) {
		int[] arr = Arrays.copyOf(numbers, numbers.length);
		Arrays.sort(arr);
		int distinctCount = 1;
		int prev = arr[arr.length - 1];

		for (int i = arr.length - 2; i >= 0; i--) {
			if (arr[i] != prev) {
				distinctCount++;
				prev = arr[i];
			}
			if (distinctCount == target) {
				return arr[i];
			}
		}
		return arr[0];
	}

	public static void main(String[] args) {
		int[] arr = { 2, 22, 3, 55, 66, 77, 77, 34, 26 };
		UsingSortingAndArray obj = new UsingSortingAndArray();
		System.out.println(obj.findNthMaxNumber(arr, 2));
		System.out.println(obj.findNthMaxNumber(arr, 3));
		System.out.println(obj.findNthMaxNumber(arr, 4));
	}
}
