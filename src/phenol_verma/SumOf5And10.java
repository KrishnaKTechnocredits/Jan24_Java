package phenol_verma;

public class SumOf5And10 {
	int sum = 0;

	void numberRange(int firstNum, int lastNum) {
		for (int num = firstNum; num <= lastNum; num++) {
			if (num % 5 == 0 && num % 10 == 0)
				sum = sum + num;
		}
		System.out.println("Expected sum is " + sum);
	}

	public static void main(String[] args) {
		SumOf5And10 sumOf5And10 = new SumOf5And10();
		sumOf5And10.numberRange(10, 50);
	}
}
