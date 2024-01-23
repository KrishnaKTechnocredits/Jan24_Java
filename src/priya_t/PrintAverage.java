package priya_t;

public class PrintAverage {

	void printSumAverageDiv5and7(int startRange, int endRange) {
		int count = 0;
		int sum = 0;

		for (int num = startRange; num <= endRange; num++) {
			if (num % 5 == 0 && num % 7 == 0) {

				System.out.println("Numbers are : " + num);
				count++;
				sum = sum + num;
            }
       }

		System.out.println("Sum =" + sum);
		System.out.println("Average =" + sum / count);
	}

	public static void main(String[] args) {
		PrintAverage average = new PrintAverage();
		average.printSumAverageDiv5and7(1, 110);

	}

}
