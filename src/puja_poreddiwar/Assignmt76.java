package puja_poreddiwar;

import java.util.Arrays;

public class Assignmt76 {

	int[] printArrayWithlargeNum(int[] arr1, int[] arr2) {

		int length = arr1.length > arr2.length ? arr1.length : arr2.length;
		int[] result = new int[length];
		for (int index = 0; index < result.length; index++) {
			result[index] = arr1[index] > arr2[index] ? arr1[index] : arr2[index];
		}
		return result;
	}
	
	int[] printArrayWithSmallerNum(int[] arr1, int[] arr2) {

		int length = arr1.length < arr2.length ? arr1.length : arr2.length;
		int[] result = new int[length];
		for (int index = 0; index < result.length; index++) {
			result[index] = arr1[index] < arr2[index] ? arr1[index] : arr2[index];
		}
		return result;
	}
	
	int[] printUnionOfArray1(int[] arr1, int[] arr2) {

		int length = arr1.length + arr2.length ;
		int[] result = new int[length];
		int count = 0;
		for (int index = 0; index < arr1.length; index++) {
			result[count] = arr1[index] ;
			count++;
		}
		for (int index = 0; index < arr2.length; index++) {
			result[count] = arr2[index] ;
			count++;
		}
		return result;
	}
	
	int[] printAdditionOfArray(int[] arr1, int[] arr2) {

		int length = arr1.length > arr2.length ? arr1.length : arr2.length;
		int[] result = new int[length];
		for (int index = 0; index < result.length; index++) {
			result[index] = arr1[index] + arr2[index];
		}
		return result;
	}

	public static void main(String[] args) {
		int[] arr1 = { 23, 34, 46, 67, 87 };
		int[] arr2 = { 65, 43, 78, 45, 90 };
		Assignmt76 temp = new Assignmt76();
		
		int[] output1 = temp.printArrayWithlargeNum(arr1, arr2);
		System.out.println("Array with Maximum numbers = " + Arrays.toString(output1));
		
		int[] output2 = temp.printArrayWithSmallerNum(arr1, arr2);
		System.out.println("Array with Minimum numbers = " + Arrays.toString(output2));
		
		int[] output3 = temp.printUnionOfArray1(arr1, arr2);
		System.out.println("Union of Array = " + Arrays.toString(output3));
		
		int[] output4 = temp.printAdditionOfArray(arr1, arr2);
		System.out.println("Addition of array = " + Arrays.toString(output4));
	}
}
