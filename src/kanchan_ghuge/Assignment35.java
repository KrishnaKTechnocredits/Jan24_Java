package kanchan_ghuge;

/*Assignment - 35 : 4th Feb'2024

Return the sum of even index [0,2,4,6]

input : {3, 6, 9, 11, 15, 20, 4, 26}
Output : 56

hint 6, 20, 4, 26  */

class Assignment35 {

	int getSumEvenIndex(int[] input) {
		int sum = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] % 2 == 0) {
				sum += input[index];
			}
		}
		System.out.println("Sum of Even index in the Array is = " + sum);
		return sum;
	}

	public static void main(String[] args) {
		int input[] = { 3, 6, 9, 11, 15, 20, 4, 26 };
		new Assignment35().getSumEvenIndex(input);
	}
}
