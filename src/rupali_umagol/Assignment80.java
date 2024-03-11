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
package rupali_umagol;

import java.util.Scanner;

public class Assignment80 {

	void maxAndMinNum(int[] arr) {
		int max = 0;
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Maximun number is : " +max+ " Minimun number is : " + min);
	}

	public static void main(String[] args) {
		Assignment80 assignment80 = new Assignment80();
		System.out.println("Enter total numbers : ");
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		int[] arr = new int[total];
		System.out.println("Enter num : ");
		for (int i = 0; i < total; i++) {
			arr[i] = sc.nextInt();
		}
		assignment80.maxAndMinNum(arr);
	}
}
