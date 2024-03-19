/*Print maximum and minimum value from user defined array.
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
package aanand.array;


import java.util.Arrays;
import java.util.Scanner;

public class Assignment80 {

	void scannerDemo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total numbers: ");
		int len = sc.nextInt();
		int[] input = new int[len];
		for (int i = 0; i < len; i++) {
			System.out.println("Enter num: ");
			input[i] = sc.nextInt();
		}
		sc.close();
		maxNum(input);
		minNum(input);
	}

	void maxNum(int[] arr) {
		int maxNumber = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] > maxNumber) {
				maxNumber = arr[index];
			}
		}
		System.out.println("Max number is: " + maxNumber);
	}

	void minNum(int[] arr) {
		int minNumber = arr[0];
			for (int index = 0; index < arr.length; index++) {
			if (arr[index] < minNumber) {
				minNumber = arr[index];
			}
		}
		System.out.println("Min number is: " + minNumber);
	}

	public static void main(String[] args) {
		Assignment80 assignment80 = new Assignment80();
		assignment80.scannerDemo();
	}
}
