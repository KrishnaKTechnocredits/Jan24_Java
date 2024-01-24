//Assignment 16 : On user defined range print sum and average of numbers which is divisible by 5 & 7.

package padmaja;

public class SumAndAverage {
	void printSumAndAverage(int startIndex, int endIndex) {
		int sum = 0;
		int count = 0;
		int avg = 0;
		for (int num = startIndex; num <= endIndex; num++) {
			if (num % 5 == 0 && num % 7 == 0) {
				sum = sum + num;
				count++;
				avg = sum / count;
			}
		}
		System.out.println("Sum " + sum);
		System.out.println("Avg " + avg);
	}

	public static void main(String[] arge) {
		SumAndAverage sumAndAverage = new SumAndAverage();
		sumAndAverage.printSumAndAverage(1, 110);
	}
}
