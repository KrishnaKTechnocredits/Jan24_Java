
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

output : From array [10, 2, 1, 100, 98], maximum number is 100 and minimum number is 1
 */
package sasmita;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment80 {

	void maxNumberValue(int[] arr) {
		int maxNumber = 0;
		for (int index = 0; index < arr.length; index++) {
			if (maxNumber < arr[index]) {
				maxNumber = arr[index];

			}
		}
		System.out.println("Maxnumber : " + maxNumber);
	}

	void minNumberValue(int[] arr) {
		int minNumber = arr[0];
		for (int index = 0; index < arr.length; index++) {
			if (minNumber > arr[index]) {
				minNumber = arr[index];

			}
		}
		System.out.println("Minnumber : " + minNumber);
	}

	public static void main(String[] args) {
		Assignment80 assignment80 = new Assignment80();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter total numbers: ");
		int[] arr = new int[scanner.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter number :");
			arr[i] = scanner.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		assignment80.maxNumberValue(arr);
		assignment80.minNumberValue(arr);
		scanner.close();
	}
}
