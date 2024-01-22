package akshada_marne;

public class LastDivisibleNumBy5and9 {
	int count = 0;

	void divide(int start, int end) {
		for (int num = start; num <= end; num++) {
			if (num % 5 == 0 && num % 9 == 0)
				count = num;
		}
		System.out.println("Last number divisible by " + start + " and " + end + " is " + count);
	}

	public static void main(String[] args) {
		LastDivisibleNumBy5and9 lastDivisibleNumBy5and9 = new LastDivisibleNumBy5and9();
		lastDivisibleNumBy5and9.divide(5, 100);
	}
}