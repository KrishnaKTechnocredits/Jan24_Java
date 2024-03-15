package technocredits.arrayExamples;

import java.util.Arrays;

//enhance for loop
public class ArrayLoop2 {

	int[] buildArrayUsingLargeNumbers(int[] arr1, int[] arr2) {
		/*
		 * int length = 0; if(arr1.length > arr2.length) length = arr2.length; else
		 * length = arr1.length;
		 */

		int length = arr1.length > arr2.length ? arr2.length : arr1.length;
		int[] result = new int[length];
		for (int index = 0; index < result.length; index++) {
			result[index] = arr1[index] > arr2[index] ? arr1[index] : arr2[index];
		}
		return result;
	}

	void display(int[] arr) {
		System.out.println(Arrays.toString(arr));
		for(int num : arr) {
			System.out.println(num);
		}
	}

	public static void main(String[] args) {
		int[] num1 = { 10, 14, 66, 34, 24, 13 };
		int[] num2 = { 45, 22, 62, 31, 39, 11, 25, 55 };
		ArrayLoop2 loop2 = new ArrayLoop2();
		int[] output = loop2.buildArrayUsingLargeNumbers(num1, num2);
		loop2.display(output);
	}
}
