/*Assignmnet 76:
Input Array
[23, 34, 46, 67, 87]
[65, 43, 78, 45, 90]
Condition 1 output - create array with max number - [65, 43, 78, 67, 90]
Condition 2 output - create array with min number - [23, 34, 46, 45, 87]
Condition 3 output - Create new array with elements of both array (lenght1 + length2) [union of arrays] - [23, 34, 46, 67, 87, 65, 43, 78, 45, 90]
Condition 4 output - add array element (index to index) and sort - [88, 77, 124, 112, 177]*/

package madhura_kulkarni;

import java.util.Arrays;

public class Assignment76 {
	void printArrayWithMaximunNumber(int[] arr1, int[] arr2) {
		int[] output = new int[arr1.length];
		for (int i = 0; i < arr1.length; i++) {
			output[i] = arr1[i] > arr2[i] ? arr1[i] : arr2[i];
		}
		System.out.println("Condition 1: Array with max numbers: " + Arrays.toString(output));
	}

	void printArrayWithMinimunNumber(int[] arr1, int[] arr2) {
		int[] output = new int[arr1.length];
		for (int i = 0; i < arr1.length; i++) {
			output[i] = arr1[i] < arr2[i] ? arr1[i] : arr2[i];
		}
		System.out.println("Condition 2: Array with min numbers: " + Arrays.toString(output));
	}

	void printUnionOfArray(int[] arr1, int[] arr2) {
		int[] output = new int[arr1.length + arr2.length];
		int count = 0;
		for (int i = 0; i < arr1.length; i++) {
			output[i] = arr1[i];
			count++;
		}
		for (int i = 0; i < arr2.length; i++) {
			output[count] = arr2[i];
			count++;
		}
		System.out.println("Condition 3: Array with union of two arrays: " + Arrays.toString(output));
	}

	void printAdditionOfArrayAndSort(int[] arr1, int[] arr2) {
		int[] output = new int[arr1.length];
		for (int i = 0; i < arr1.length; i++) {
			output[i] = arr1[i] + arr2[i];
		}
		Arrays.sort(output);
		System.out
				.println("Condition 4: Array sortedv after indexwise addition of numbers: " + Arrays.toString(output));
	}

	public static void main(String[] args) {
		int[] num1 = { 23, 34, 46, 67, 87 };
		int[] num2 = { 65, 43, 78, 45, 90 };
		Assignment76 ass = new Assignment76();
		ass.printArrayWithMaximunNumber(num1, num2);
		ass.printArrayWithMinimunNumber(num1, num2);
		ass.printUnionOfArray(num1, num2);
		ass.printAdditionOfArrayAndSort(num1, num2);
	}

}
