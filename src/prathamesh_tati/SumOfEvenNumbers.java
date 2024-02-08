//Assignment 35
// Return the sum of even numbers

package prathamesh_tati;

public class SumOfEvenNumbers {

	static int sum;
	static int getAdditionOfEvenNums(int[] arr) {
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] % 2 == 0)
				sum = sum + arr[index];
		}
		return sum;
	}

	void displaySumOfNumbers(int[] nums) {
		getAdditionOfEvenNums(nums);
		System.out.println("Sum of Even Numbers = " + sum);
	}

	public static void main(String[] args) {
		SumOfEvenNumbers sumOfEvenNumbers = new SumOfEvenNumbers();
		int[] input = { 3, 6, 9, 11, 15, 20, 4, 26 };
		sumOfEvenNumbers.displaySumOfNumbers(input);
	}
}