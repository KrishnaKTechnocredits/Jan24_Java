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

output : From array [10, 2, 1, 100, 98], maximum number is 100 and minimum number is 1*/
package madhura_kulkarni;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment80 {
	void getInputArray(int arrLength) {
		int[] input = new int[arrLength];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total " + arrLength + " elements :");
		for (int i = 0; i < input.length; i++) {
			input[i] = sc.nextInt();
		}
		System.out.println("From array " + Arrays.toString(input) + ", maximum number is " + getMaximumNumber(input)
				+ " and minimum number is " + getMinimumNumber(input));
		sc.close();
	}

	int getMaximumNumber(int[] arr) {
		int maxNum = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > maxNum)
				maxNum = arr[i];
		}
		return maxNum;
	}

	int getMinimumNumber(int[] arr) {
		int minNum = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < minNum)
				minNum = arr[i];
		}
		return minNum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the required length of array : ");
		int arrLength = sc.nextInt();
		Assignment80 ass = new Assignment80();
		ass.getInputArray(arrLength);
		sc.close();
	}

}
