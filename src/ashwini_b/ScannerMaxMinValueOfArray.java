package ashwini_b;

import java.util.Arrays;
import java.util.Scanner;

/*
Assignment - 80 : 10th March'2024--
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

output : From array [10, 2, 1, 100, 98], maximum number is 100 and minimum number is 1
 */
public class ScannerMaxMinValueOfArray {

	void printMax1MinNumber(int[] inputarray) {
		int maxnum = inputarray[0];
		int minnum = inputarray[0];
		for (int i = 0; i < inputarray.length; i++) {
			if (inputarray[i] > maxnum) {
				maxnum = inputarray[i];
			}
			if (inputarray[i] < minnum) {
				minnum = inputarray[i];
			}
		}
		System.out.println("From arraya" + Arrays.toString(inputarray) + ", maximum number is " + maxnum
				+ " and minimum number is " + minnum);
		// System.out.println("Maximum no. is " + maxnum);
		// System.out.println("Minimum no. is " + minnum);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter total numbers ");
		int size = scanner.nextInt();
		int[] array = new int[size];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter num : ");
			array[i] = scanner.nextInt();
		}
		System.out.println(Arrays.toString(array));
		ScannerMaxMinValueOfArray object = new ScannerMaxMinValueOfArray();
		object.printMax1MinNumber(array);
	}

}
