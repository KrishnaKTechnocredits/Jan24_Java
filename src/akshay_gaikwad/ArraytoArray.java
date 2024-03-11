//[23, 34, 46, 67, 87]
//[65, 43, 78, 45, 90]
package akshay_gaikwad;

import java.util.Arrays;

public class ArraytoArray {

	int[] getMaxNumArrays(int[] arr1, int[] arr2) {
		int[] output = new int[arr1.length];
		for (int index = 0; index < output.length; index++) {
			if (arr1[index] > arr2[index]) {
				output[index] = arr1[index];
			} else {
				output[index] = arr2[index];
			}
		}
		return output;
	}

	int[] getMinNumArrays(int[] arr1, int[] arr2) {
		int[] output = new int[arr1.length];
		for (int index = 0; index < output.length; index++) {
			if (arr1[index] < arr2[index]) {
				output[index] = arr1[index];
			} else {
				output[index] = arr2[index];
			}
		}
		return output;
	}
	
	int[] mergeArray(int[] arr1, int[] arr2) {
		int[] output = new int[arr1.length + arr2.length];
		int outputIndex = 0;
		for(int num : arr1) {
			output[outputIndex++] = num;
		}
		for(int num : arr2) {
			output[outputIndex++] = num;
		}
		return output;
	}
	
	int[] addArrays(int[] arr1, int[] arr2) {
		int[] output = new int[arr1.length];
		for (int index = 0; index < output.length; index++) {
			output[index] = arr1[index] + arr2[index];
		}
		Arrays.sort(output);
		return output;
	}
	public static void main(String[] args) {
		int[] arr1 = {23, 34, 46, 67, 87};
		int arr2[] = {65, 43, 78, 45, 90};
		ArraytoArray obj = new ArraytoArray();
		System.out.println("Max Numbers from given array : " + Arrays.toString(obj.getMaxNumArrays(arr1, arr2)));
		System.out.println("Min Numbers from given array : " + Arrays.toString(obj.getMinNumArrays(arr1, arr2)));
		System.out.println("All Numbers from given array : " + Arrays.toString(obj.mergeArray(arr1, arr2)));
		System.out.println("Addition of Numbers from given array : " + Arrays.toString(obj.addArrays(arr1, arr2)));

		
		
	}
}
