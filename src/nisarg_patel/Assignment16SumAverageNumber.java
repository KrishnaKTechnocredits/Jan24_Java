package nisarg_patel;

public class Assignment16SumAverageNumber {

	void printDivisibleSum(int startRange, int endRange) {
		int sum = 0;
		int avg = 0;
		int count = 0;
		System.out.println("Numbers are Divisible by 5 and 7 are : ");
		for (int num = startRange; num <= endRange; num++) {
			if (num % 5 == 0 && num % 7 == 0) {
				sum = sum + num;
				System.out.println(num);
				count++;
			}
		}
		System.out.println("Found " + count + " which is divisible by 5 and 7");
		avg = sum / count;
		System.out.println("Sum :" + sum);
		System.out.println("Average :" + avg);
	}

	public static void main(String[] args) {
		Assignment16SumAverageNumber assignment16SumAverageNumber = new Assignment16SumAverageNumber();
		assignment16SumAverageNumber.printDivisibleSum(10, 110);
	}
}
