//Assignment 36
// Return the sum of all the numbers which are divisible by 3 & 5

package prathamesh_tati;

public class SumOfNumsDivisibleByNums {
	int sum = 0;

	int divisibleNumsBy3And5(int[] arr) {
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] % 3 == 0 && arr[index] % 5 == 0)
				sum = sum + arr[index];
		}
		return sum;
	}

	void displaySum9(int[] num) {
		divisibleNumsBy3And5(num);
		System.out.println("sum of all the numbers which are divisible by 3 & 5 = " + sum);
	}

	public static void main(String[] args) {
		SumOfNumsDivisibleByNums sumOfNumsDivisibleByNums = new SumOfNumsDivisibleByNums();
		int[] input = { 6, 5, 3, 15, 19, 40, 30, 27, 11 };
		sumOfNumsDivisibleByNums.displaySum9(input);
	}
}