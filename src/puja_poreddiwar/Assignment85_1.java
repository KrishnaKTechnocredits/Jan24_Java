/*
 * Assignment - 85 : 23th March'2024
Print numbers not presented uniquely from array using Array.
Print numbers not presented uniquely from array using ArrayList.
Print numbers not presented uniquely from array using HashMap
 */

package puja_poreddiwar;

public class Assignment85_1 {

	int getCountOfNumbers(int[] arr, int num) {
		int count = 0;
		for (int number : arr) {
			if (number == num) {
				count++;
			}
		}
		return count;
	}

	boolean isNumberPresent(int[] arr, int targetNumber, int index) {
		for (int i = 0; i < index; i++) {
			if (targetNumber == arr[i]) {
				return true;
			}
		}
		return false;
	}

	void getDuplicateNum(int[] arr1) {
		int count = 0;
		for (int i = 0; i < arr1.length; i++) {
			count = getCountOfNumbers(arr1, arr1[i]);
			if (!isNumberPresent(arr1, arr1[i], i)) {
				if (count > 1) {
					System.out.println(arr1[i]);
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] data = { 10, 10, 3, 4, 3, 3, 3, 3, 55, 56 };
		new Assignment85_1().getDuplicateNum(data);
	}
}
