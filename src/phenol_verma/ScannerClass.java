/*Assignment - 80 : 10th March'2024

Print maximum and minimum value from user defined array.
 
NOTE : use Scanner class.

input : 
Enter total numbers
5
Enter num : 10
Enter num : 2
Enter num : 1
Enter num : 100
Enter num : 98

output : From array [10, 2, 1, 100, 98], maximum number is 100 and minimum number is */

package phenol_verma;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerClass {

	void retrunMaxValue(int[] arr) {
		int maxValue = 0;
		for (int index = 0; index < arr.length; index++) {
			if (maxValue < arr[index]) {
				maxValue = arr[index];
			}
		}
		System.out.println("Max value in array - " + maxValue);
	}

	void retrunMinValue(int[] arr) {
		int minValue = arr[0];
		for (int index = 0; index < arr.length; index++) {

			if (minValue > arr[index]) {
				minValue = arr[index];
			}
		}
		System.out.println("Min value in array - " + minValue);
	}

	public static void main(String[] args) {
		ScannerClass scannerClass = new ScannerClass();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the lenght of the array - ");
		int lenght = scanner.nextInt();
		System.out.println();

		int[] arr = new int[lenght];

		int count = 1;
		for (int index = 0; index < lenght; index++) {
			System.out.print("Enter the " + count++ + " of array - ");
			arr[index] = scanner.nextInt();
		}

		System.out.println("Original Array - " + Arrays.toString(arr));

		scannerClass.retrunMaxValue(arr);
		scannerClass.retrunMinValue(arr);
	}
}
