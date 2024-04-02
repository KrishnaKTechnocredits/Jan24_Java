package ashwini_b;

import java.util.Arrays;

/*
 * Assignmetn76 -7th March
 * num1[] = {23,34,46,67,87};
   num2[] = {65,43,78,45,90};
 "please give this as assignment with condition,
- create array with max number
- create array with min number
- Create new array with elements of both array (lenght1 + length2) [union of arrays]
- add array element (index to index) and sort"
 */
public class Assign76_MinMaxSumUniArray {

	void maxNumArray(int[] num1Arr, int[] num2Arr) {
		int[] outputarr = new int[num1Arr.length];
		for (int i = 0; i < outputarr.length; i++) {
			if (num1Arr[i] > num2Arr[i]) {
				outputarr[i] = num1Arr[i];
			} else {
				outputarr[i] = num2Arr[i];
			}
		}
		System.out.println(Arrays.toString(outputarr));
	}

	void minNumintArray(int[] num1Arr, int[] num2Arr) {
		int[] outputArray = new int[num1Arr.length];
		for (int i = 0; i < outputArray.length; i++) {
			if (num1Arr[i] < num2Arr[i]) {
				outputArray[i] = num1Arr[i];
			} else {
				outputArray[i] = num2Arr[i];
			}
		}
		System.out.println(Arrays.toString(outputArray));
	}

	void arrayWithElementsOfBothArray(int[] num1Arr, int[] num2Arr) {
		int count = 0;
		int[] outputArray = new int[num1Arr.length + num2Arr.length];
		for (int i = 0; i < num1Arr.length; i++) {
			outputArray[i] = num1Arr[i];

		}
		for (int i = num1Arr.length; i < outputArray.length; i++) {
			outputArray[i] = num2Arr[count];
			count++;
		}
		System.out.println(Arrays.toString(outputArray));
	}

	void addArrayElement(int[] num1Arr, int[] num2Arr) {
		int[] outputArray = new int[num1Arr.length];
		for (int i = 0; i < num1Arr.length; i++) {
			outputArray[i] = num1Arr[i] + num2Arr[i];
		}
		Arrays.sort(outputArray);
		System.out.println(Arrays.toString(outputArray));
	}

	public static void main(String[] args) {
		int num1[] = { 23, 34, 46, 67, 87 };
		int num2[] = { 65, 43, 78, 45, 90 };
		Assign76_MinMaxSumUniArray assign76_MinMaxSumUniArray = new Assign76_MinMaxSumUniArray();
		System.out.print("array with max number:");
		assign76_MinMaxSumUniArray.maxNumArray(num1, num2);
		System.out.print("array with min number:");
		assign76_MinMaxSumUniArray.minNumintArray(num1, num2);
		System.out.print("Union of both array:");
		assign76_MinMaxSumUniArray.arrayWithElementsOfBothArray(num1, num2);
		System.out.print("add array element (index to index) and sort: ");
		assign76_MinMaxSumUniArray.addArrayElement(num1, num2);
	}

}
