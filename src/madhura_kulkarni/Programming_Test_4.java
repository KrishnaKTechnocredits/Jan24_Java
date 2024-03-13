package madhura_kulkarni;

import java.util.Arrays;

public class Programming_Test_4 {
	void devideArrayInTwoArraysAndAdd(int[] arr) {
		int len = arr.length / 2;
		int index = 0;
		int[] num1 = new int[len];
		int[] num2 = new int[len];
		for (int i = 0; i < num1.length; i++) {
			num1[i] = arr[i];
			index++;
		}
		for (int i = 0; i < num2.length; i++) {
			num2[i] = arr[index];
			index++;
		}
		getSumOfArray(num1, num2);
	}

	void getSumOfArray(int[] arr1, int[] arr2) {
		int[] output = new int[arr1.length];
		for (int i = 0; i < arr1.length; i++) {
			output[i] = arr1[i] + arr2[i];
		}
		System.out.println("Array 1: " + Arrays.toString(arr1));
		System.out.println("Array 2: " + Arrays.toString(arr2));
		System.out.println("Sum of Array elements : " + Arrays.toString(output));
	}

	public static void main(String[] args) {
		int[] num = { 1, 10, 20, 12, 15, 6 };
		Programming_Test_4 pr = new Programming_Test_4();
		pr.devideArrayInTwoArraysAndAdd(num);
	}

}
