package samiksha;

import java.util.Scanner;

public class MinMaxByScanner {
	void getMinMaxNum(int[] arr) {
		int min = arr[0];
		int max = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] > max) {
				max = arr[index];
			}
			if (arr[index] < min) {
				min = arr[index];
			}
		}
		System.out.println("max num is " + max);
		System.out.println("min num is " + min);
	}

	public static void main(String[] args) {
		MinMaxByScanner minMax = new MinMaxByScanner();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int length = sc.nextInt();
		System.out.println("numbers : ");
		int[] arr = new int[length];

		for (int index = 0; index < arr.length; index++) {
			arr[index] = sc.nextInt();
		}
		minMax.getMinMaxNum(arr);
	}
}
