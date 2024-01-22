/* Assignment - 15 : 21st Jan'2024
  On user defined range print sum and average of numbers which is divisible by 5 & 7.*/

package prathamesh_tati;

public class SumAndAverage {

	int sum = 0;
	int count = 0;
	int num;

	void divisibleNumSumAndAverage(int startIndex, int endIndex) {
		System.out.println("Numbers are,");
		for (num = startIndex; num <= endIndex; num++) {
			if (num % 5 == 0 && num % 7 == 0) {
				System.out.println(num);
				count++;
				sum = sum + num;
			}
		}
		System.out.println("Found " + count + " numbers which are divisible by 5 & 7.");
		System.out.println("sum = " + sum);
		System.out.println("Average = " + sum / count);
	}

	public static void main(String[] args) {
		SumAndAverage sumAndAverage = new SumAndAverage();
		sumAndAverage.divisibleNumSumAndAverage(1, 110);
	}
}