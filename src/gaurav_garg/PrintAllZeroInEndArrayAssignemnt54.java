/*
 Push all the zeros at the end of an array.
int[] arr = {10,-12,6,-3,0,0,-33,44,0,4};
output : {10,-12,6,-3,-33,44,4,0,0,0};
 */
package gaurav_garg;

import java.util.Arrays;

public class PrintAllZeroInEndArrayAssignemnt54 {

	void printZeroAtEnd(int[] arr) {
		int arr2[] = new int[arr.length];
		int a = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] > 0) {
				arr2[a] = arr[index];
				a++;
			}
			if (arr[index] < 0) {
				arr2[a] = arr[index];
				a++;
			}
		}
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] == 0) {
				arr2[a] = arr[index];
				a++;
			}
		}
		System.out.print(Arrays.toString(arr2));
	}

	public static void main(String[] args) {
		int[] arr = { 10, -12, 6, -3, 0, 0, -33, 44, 0, 4 };
		new PrintAllZeroInEndArrayAssignemnt54().printZeroAtEnd(arr);
	}
}
