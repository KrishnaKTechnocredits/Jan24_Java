/*Assignment - 76 : 7th March'2024
PhenolV_Assignment_79
please give this as assignment with condition,
- create array with max number
- create array with min number
- Create new array with elements of both array (lenght1 + length2) [union of arrays]
- add array element (index to index) and sort

arr1 = {23,34,46,67,87}
arr2 = {65,43,78,45,90}
*/

package phenol_verma;

import java.util.Arrays;

public class ArrayOutputForGivenCondition {

//	Condition 1 - create array with max number
	int[] arrWithMaxNumber(int[] arr1, int[] arr2) {
		int[] outputArr = new int[arr1.length];
		for (int index = 0; index < arr1.length; index++) {
			if (arr1[index] > arr2[index]) {
				outputArr[index] = arr1[index];
			} else {
				outputArr[index] = arr2[index];
			}
		}
		return outputArr;
	}

//	Condition 2 - create array with min number
	int[] arrWithMinNumber(int[] arr1, int[] arr2) {
		int[] outputArr = new int[arr1.length];
		for (int index = 0; index < arr1.length; index++) {
			if (arr1[index] < arr2[index]) {
				outputArr[index] = arr1[index];
			} else {
				outputArr[index] = arr2[index];
			}
		}
		return outputArr;
	}

//	Condition 3 - Create new array with elements of both array (lenght1 + length2) [union of arrays]
	int[] arrLenghtAdd(int[] arr1, int[] arr2) {
		int[] outputArr = new int[arr1.length + arr2.length];
		// Adding first array
		for (int index = 0; index < arr1.length; index++) {
			outputArr[index] = arr1[index];
		}
		// Adding second array
		for (int index = 0; index < arr1.length; index++) {
			outputArr[arr1.length + index] = arr2[index];
		}
		return outputArr;
	}

//	Condition 4 - add array element (index to index) and sort
	int[] arrAddNumber(int[] arr1, int[] arr2) {
		int[] outputArr = new int[arr1.length];
		for (int index = 0; index < arr1.length; index++) {
			outputArr[index] = arr1[index] + arr2[index];
		}
		return outputArr;
	}

	public static void main(String[] args) {
		ArrayOutputForGivenCondition arrReverStringPalandrom = new ArrayOutputForGivenCondition();

		int[] arr1 = { 23, 34, 46, 67, 87 };
		int[] arr2 = { 65, 43, 78, 45, 90 };
		System.out.println("Input Array");
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));

		System.out.print("Condition 1 output - create array with max number - ");
		System.out.println(Arrays.toString(arrReverStringPalandrom.arrWithMaxNumber(arr1, arr2)));

		System.out.print("Condition 2 output - create array with max number - ");
		System.out.println(Arrays.toString(arrReverStringPalandrom.arrWithMinNumber(arr1, arr2)));

		System.out.print("Condition 3 output - Create new array with elements of both array (lenght1 + length2) [union of arrays] - ");
		System.out.println(Arrays.toString(arrReverStringPalandrom.arrLenghtAdd(arr1, arr2)));

		System.out.print("Condition 4 output - add array element (index to index) and sort - ");
		System.out.println(Arrays.toString(arrReverStringPalandrom.arrAddNumber(arr1, arr2)));
	}
}
