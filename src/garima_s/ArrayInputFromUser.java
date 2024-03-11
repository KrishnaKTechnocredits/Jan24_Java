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

package garima_s;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInputFromUser {

	void findMaxNum(int[] arr) {
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
		}
		System.out.println("Maximum Number : " + max);
	}

	void findMinNum(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min)
				min = arr[i];
		}
		System.out.println("Minimum Number : " + min);
	}

	public static void main(String[] args) {
		ArrayInputFromUser arrayInputFromUser = new ArrayInputFromUser();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Total Numbers : ");
		int[] arr = new int[sc.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter Number :");
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		arrayInputFromUser.findMaxNum(arr);
		arrayInputFromUser.findMinNum(arr);
		sc.close();
	}

}
