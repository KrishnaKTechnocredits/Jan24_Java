package prathamesh_tati.array;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMinValueScannerClass {
	static int max;
	static int min;

	int MaxNumberLogic(int[] arr) {
		max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i])
				max = arr[i];
		}
		return max;
	}

	int MinNumberLogic(int[] arr) {
		min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i])
				min = arr[i];
		}
		return min;
	}

	int[] acceptInputArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total numbers");
		int length = sc.nextInt();

		int[] arr = new int[length];
	
		System.out.println("Enter " + length + " numbers to store in array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = new MaxMinValueScannerClass().acceptInputArray();
		System.out.println("Entered Array is ==> " + Arrays.toString(arr));
		new MaxMinValueScannerClass().MaxNumberLogic(arr);
		new MaxMinValueScannerClass().MinNumberLogic(arr);
		System.out.println("Maxiumum No is " + max + " and Minimum No is " + min);
	}
}
