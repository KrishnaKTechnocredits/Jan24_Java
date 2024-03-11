//using Scanner class
//Print maximum and minimum value from user defined array.
//input : 
//Enter total numbers
//output : From array [10, 2, 1, 100, 98], maximum number is 100 and minimum number is 1

package atisha;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment80 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter total numbers  ");
		int length = sc.nextInt();
		int[] arr = new int[length];
		for (int i = 0; i < arr.length; i++) {

			System.out.println("enter num : ");
			arr[i] = sc.nextInt();
		}
		
		int max = arr[0];
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("From array" + Arrays.toString(arr) + "," + "maximum number is : " + max + " and minimum number is: "+ min );
		sc.close();
	}
}