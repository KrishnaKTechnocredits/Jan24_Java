/*
 Assignment - 53 : 11th Feb'2024
 PhenolV_Assignment_59
Rearrange the numbers in the array, first all negative numbers followed by positive.
int[] arr = {10,-12,6,-3,-33,44,4};
output : [-12,-3,-33,10,6,44,4]	

 */

package phenol_verma;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrRearangeDigit {
	
	void rearangeDigit (int arr[]) {
		int outputIndex = 0;
		int outputArr[] = new int[arr.length];
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] < 0) {
				outputArr[outputIndex] = arr[index];
				outputIndex++;
			}
		}
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] > 0) {
				outputArr[outputIndex] = arr[index];
				outputIndex++;
			}
		}
		System.out.println("Output array - " + Arrays.toString(outputArr));
	}
	
	public static void main(String[] args) {
		ArrRearangeDigit arrRearangeDigit = new ArrRearangeDigit();
		int[] arr = {10,-12,6,-3,-33,44,4};
		System.out.println("Original Array - " + Arrays.toString(arr));
		arrRearangeDigit.rearangeDigit(arr);
	}

}
