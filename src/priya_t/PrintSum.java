package priya_t;

public class PrintSum {

	void printSumDiv5and10(int startRange, int endRange) {
		int count = 0;
		int sum = 0;

		for (int num = startRange; num <= endRange; num++) {
			if (num % 5 == 0 && num % 10 == 0) {
				count++;
				sum = sum + num;
			}

		}

		System.out.println("Expected sum is " + sum);
	}

	public static void main(String[] args) {
		PrintSum sum = new PrintSum();
		sum.printSumDiv5and10(10, 50);

	}
}
