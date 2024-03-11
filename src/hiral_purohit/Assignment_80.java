package hiral_purohit;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_80 {

	void toFindMaxInArray(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("max number is: " + max);
	}

	void printMinInArray(int[] arr) {
		int min =arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("min number is: " + min);
	}

	public static void main(String[] arr) {
		Assignment_80 assignment_80 = new Assignment_80();
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number for array: ");
		System.out.println("------------------------");
		int[] num = new int[scanner.nextInt()];
		for (int i = 0; i < num.length; i++) {
			System.out.println("Enter Next Number :");
			num[i] = scanner.nextInt();
		}
		System.out.println("------------------------");
		System.out.println(Arrays.toString(num));
		System.out.println("------------------------");
		assignment_80.toFindMaxInArray(num);
		System.out.println("------------------------");
		assignment_80.printMinInArray(num);
		scanner.close();
	}
}
