/*
Assignment - 95.1 : 25th March'2024 [2 hrs] 
PhenolV_Assignment_103
1. find the second highest number from given array without using sorting and using array.
input : {2,22,3,55,66,77,77,34,26}
output : 66
 * 
 */

package phenol_verma;

import java.util.Arrays;

public class ArraySecondHighestNumber95_1 {

	int getHighestNumber(int[] array) {
		int Highestnum = 0;
		for (int index = 0; index < array.length; index++) {
			if (Highestnum < array[index]) {
				Highestnum = array[index];
			}
		}
		return Highestnum;
	}

	int[] replaceHighestNumber(int[] updatedArray, int digitToBereplaced) {
		for (int index = 0; index < updatedArray.length; index++) {
			if (updatedArray[index] == digitToBereplaced) {
				updatedArray[index] = Integer.MIN_VALUE;
			}
		}
		return updatedArray;
	}
	
	int getSecondHighestNumber(int[] array) {
		int maxNumber = getHighestNumber(array);
		int[] updatedArray = replaceHighestNumber(array, maxNumber);
		maxNumber = getHighestNumber(updatedArray);
		return maxNumber;
	}

	public static void main(String[] args) {
		ArraySecondHighestNumber95_1 arraySecondHighestNumber95_1 = new ArraySecondHighestNumber95_1();
		int[] array = { 2, 22, 3, 55, 66, 77, 77, 34, 26 };
		System.out.println("Original Array - " + Arrays.toString(array));
		System.out.println("Second highest number - " + arraySecondHighestNumber95_1.getSecondHighestNumber(array));
	}
}
