/*
 * Assignment - 80 : 10th March'2024

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


package puja_poreddiwar;

import java.util.Arrays;
import java.util.Scanner;


public class Assignment80ScannerClass {
 
		
	
	void getMinNumber(int[] arr) {
		int maxNum = 0;
		int minNum = arr[0];
		for (int index = 1; index < arr.length; index++) {
			if (maxNum < arr[index]) {
				maxNum = (int) arr[index];
			}
			if (minNum > arr[index]) {
				minNum = (int) arr[index];
			}
		}
		System.out.println("Maximum Number in a given array : " + maxNum);
		System.out.println("Minimum Number in a given array : " + minNum);
	
		
	}
	
	public static void main(String[] agrs) {
		System.out.println("Enter interger array you want to consider: ");
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int[] arr = new int[length];
		
		for (int i =0;i<arr.length;i++) {
			System.out.println("Enter value: ");
			arr[i] = sc.nextInt();
		}
		
		System.out.println("-------------");
		System.out.println(Arrays.toString(arr));
		sc.close();
		
		new Assignment80ScannerClass().getMinNumber(arr);
		
	}
	
}
