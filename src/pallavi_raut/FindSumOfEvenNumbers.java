/*Assignment - 35 : 4th Feb'2024

Return the sum of even numbers from the array

input : {3, 6, 9, 11, 15, 20, 4, 26}
Output : 56

hint 6, 20, 4, 26---------------------------*/

package pallavi_raut;

class FindSumOfEvenNumbers {

	public static void main(String[] args) {
		int[] arr = { 3, 6, 9, 11, 15, 20, 4, 26 };
		FindSumOfEvenNumbers findSumOfEvenNumbers = new FindSumOfEvenNumbers();
		findSumOfEvenNumbers.printSumOfEvenNumbers(arr);
	}

	int printSumOfEvenNumbers(int[] num) {
		int sum = 0;
		for (int index = 0; index < num.length; index++) {
			if (num[index] % 2 == 0) {
				sum = sum + num[index];
			}
		}
		System.out.println("Sum of even numbers in given array is = " + sum);
		return sum;
	}
}