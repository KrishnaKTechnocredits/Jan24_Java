package phenol_verma;

public class SumAndAvg5And7 {
	int sum = 0;
	int count = 0;

	void numberRange(int firstNum, int lastNum) {
		for (int num = firstNum; num <= lastNum; num++) {
			if (num % 5 == 0 && num % 7 == 0) {
				System.out.println(num);
				count++;
				sum = sum + num;
			}
		}
		System.out.println("Found " + count + " numbers which are divible by 5 & 7");
		System.out.println("Sum = " + sum);
		System.out.println("Average = " + sum / count);

	}

	public static void main(String[] args) {
		SumAndAvg5And7 sumAndAvg5And7 = new SumAndAvg5And7();
		System.out.println("Numbers are, ");
		sumAndAvg5And7.numberRange(1, 110);
	}
}
