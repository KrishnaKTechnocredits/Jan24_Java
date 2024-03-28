/*
 * Assignment - 84 : 23th March'2024
Print numbers present uniquely from array using Array.
 */

package puja_poreddiwar;

public class Assignmnt84_1 {

	int getArrayUniqueNo(int[] arr, int num) {
		int count=0;
		for(int number : arr) {
			if(number == num) {
				count++;
			}
		}
		return count;
	}

	void getNumbers(int[] arr) {
		for (int num : arr) {
			int count = getArrayUniqueNo(arr, num);
			if (count == 1) {
				System.out.println(num);
			}
		}
	}

	public static void main(String[] args) {
		int[] data = { 10, 10, 3, 4, 3, 3, 3, 3, 55, 56 };
		new Assignmnt84_1().getNumbers(data);
	}
}
