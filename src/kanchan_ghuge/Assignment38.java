/*Assignment - 38 : 4th Feb'2024

Return the max & min number from given array.

input : [10,20,50,60,30]
output : min : 10 max : 60  */

package kanchan_ghuge;

class Assignment38 {
	int max;
	int min;

	void findMaxNum(int input[]) {
		for (int index = 0; index < input.length; index++) {
			int temp = max;
			if (input[index] > temp) {
				max = input[index];
			}
		}
		System.out.println("Maximum number from given array : " + max);
	}

	void findMinNum(int input[]) {
		for (int index = 0; index < input.length; index++) {
			int temp = input[0];
			if (input[index] <= temp) {
				min = input[index];
			}
		}
		System.out.println("Minimum number from given array : " + min);
	}

	public static void main(String[] args) {
		int[] input = { 10, 20, 50, 60, 30 };
		new Assignment38().findMaxNum(input);
		new Assignment38().findMinNum(input);

	}
}
