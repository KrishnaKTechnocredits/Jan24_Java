package phenol_verma;

public class LastNumDivBy5And9 {
	int lastNumDiv = 0;

	void numberRange(int firstNum, int lastNum) {
		for (int num = firstNum; num <= lastNum; num++) {
			if (num % 5 == 0 && num % 9 == 0)
				lastNumDiv = num;
		}
		System.out.println(" Last number divisible by 5 & 9 is " + lastNumDiv);
	}

	public static void main(String[] args) {
		LastNumDivBy5And9 lastNumDivBy5And9 = new LastNumDivBy5And9();
		lastNumDivBy5And9.numberRange(5, 100);
	}
}