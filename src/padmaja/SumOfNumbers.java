//Assignment 14 : On user defined range print sum of all the number which is divisible by 5 & 10.

package padmaja;

public class SumOfNumbers {
	int sum = 0;

	void printSum(int startIndex, int endIndex) {
		for (int num = startIndex; num <= endIndex; num++) {
			if (num % 5 == 0 && num % 10 == 0)
				sum = sum + num;
		}
		System.out.println(sum);
	}

	public static void main(String[] arge) {
		SumOfNumbers sumOfNumbers = new SumOfNumbers();
		sumOfNumbers.printSum(10, 50);
	}
}
