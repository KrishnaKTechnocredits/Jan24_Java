/*Programming Test 4
 * PhenolV_Assignment_85
Given the array, then divide the array in 2 array with equal size and do the sum of 2 array. 
int arr[] = { 1, 10, 20, 12, 15, 6 };
Divide the array-:
[1, 10, 20]
[12, 15, 6]
Sum of 2 array
[13, 25, 26]*/

package phenol_verma;

import java.util.Arrays;

public class DivideArraySum {

	void arrayDivide(int[] arr) {
		int lengthArr = arr.length;
		int[] arr1 = new int[lengthArr / 2];
		int[] arr2 = new int[lengthArr / 2];
		int[] outputArr = new int[lengthArr / 2];
		int count = 0;

		if (lengthArr % 2 != 0) {
			System.out.println("Given array cant be divided in to 2 parts equally");

		} else {
			for (int index = 0; index < arr.length; index++)
				if (index < arr.length / 2) {
					arr1[index] = arr[index];
				} else {
					arr2[count] = arr[index];
					count++;
				}
			for (int index = 0; index < lengthArr / 2; index++) {
				outputArr[index] = arr1[index] + arr2[index];
			}
			
			System.out.print("Output Array 1  - ");
			System.out.println(Arrays.toString(arr1));

			System.out.print("Output Array 2  - ");
			System.out.println(Arrays.toString(arr2));
			
			System.out.print("Sum of 2 array  - ");
			System.out.println(Arrays.toString(outputArr));
		}
	}

	public static void main(String[] args) {
		DivideArraySum divideArraySum = new DivideArraySum();

		System.out.print("Original Array - ");
		int[] arr = { 1, 10, 20, 12, 15, 6 };
		System.out.println(Arrays.toString(arr));

		divideArraySum.arrayDivide(arr);
	}
}
