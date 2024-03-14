package puja_poreddiwar;

import java.util.Arrays;

public class ProgramTest4 {

	void printArray(int[] arr) {

		int size = arr.length / 2;
		int[] array1 = new int[size];
		int[] array2 = new int[size];
		int count = 0;
		for (int i = 0; i < size; i++) {
			array1[i] = arr[count];
			count++;
		}

		for (int i = 0; i < size; i++) {
			array2[i] = arr[count];
			count++;
		}
		System.out.println("Original Array = " + Arrays.toString(arr));
		System.out.println("New Array1 = " + Arrays.toString(array1));
		System.out.println("New Array2 = " + Arrays.toString(array2));
		printAdditionOfArrayElement(array1,array2);
	}

	void printAdditionOfArrayElement(int[] arr1, int[] arr2) {
		int[] sumOfArray = new int[arr1.length];
		for(int i =0;i<arr1.length;i++) {
			sumOfArray[i] = arr1[i]+arr2[i];
		}
			System.out.println("Addition of array elements = "  + Arrays.toString(sumOfArray));	
	}

	public static void main(String[] args) {
		int[] arr = { 1, 10, 20, 12, 15, 6 };
		ProgramTest4 temp = new ProgramTest4();
		temp.printArray(arr);

	}

}
