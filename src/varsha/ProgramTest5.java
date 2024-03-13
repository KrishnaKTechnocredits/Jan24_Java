package varsha;

//Given the array, then divide the array in 2 array with equal size and do the sum of 2 array. 
//int arr[] = { 1, 10, 20, 12, 15, 6 };
//Divide the array-:
//[1, 10, 20]
//[12, 15, 6]
//Sum of 2 array
//[13, 25, 26]

import java.util.Arrays;

public class ProgramTest5 {

	int[] getTheSumOfTwoArray(int[] arr1, int[] arr2) {
		int[] output = new int[arr1.length];
		for (int i = 0; i < arr1.length; i++) {
			output[i] = arr1[i] + arr2[i];
		}
		return output;
	}

	int[] getTwoDifferentArray(int[] arr) {
		int count = 0;
		int[] arr1 = new int[arr.length / 2];
		int[] arr2 = new int[arr.length / 2];

		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = arr[count];
			count++;
		}
		
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = arr[count];
			count++;
		}
		
		System.out.println("Divide the array-: ");
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));

		int[] output = getTheSumOfTwoArray(arr1, arr2);
		return output;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 10, 20, 12, 15, 6 };

		ProgramTest5 programTest5 = new ProgramTest5();
		int[] output = programTest5.getTwoDifferentArray(arr);
		System.out.println("Sum of 2 array :" + Arrays.toString(output));
	}
}
