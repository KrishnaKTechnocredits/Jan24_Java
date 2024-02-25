/*
Assignment - 54 : 11th Feb'2024
PhenolV_Assignment_60
Push all the zeros at the end of an array.
int[] arr = {10,-12,6,-3,0,0,-33,44,0,4};
output : {10,-12,6,-3,-33,44,4,0,0,0};

 */

package phenol_verma;

import java.util.Arrays;

public class ArrPushZeroAtEnd {

	void rearangeDigit(int arr[]) {
		int outputIndex = 0;
		int outputArr[] = new int[arr.length];
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] != 0) {
				outputArr[outputIndex] = arr[index];
				outputIndex++;
			}
		}
		System.out.println("Output array - " + Arrays.toString(outputArr));
	}

	public static void main(String[] args) {
		ArrPushZeroAtEnd arrPushZeroAtEnd = new ArrPushZeroAtEnd();
		int[] arr = { 10, -12, 6, -3, 0, 0, -33, 44, 0, 4 };
		System.out.println("Original Array - " + Arrays.toString(arr));
		arrPushZeroAtEnd.rearangeDigit(arr);
	}
}
