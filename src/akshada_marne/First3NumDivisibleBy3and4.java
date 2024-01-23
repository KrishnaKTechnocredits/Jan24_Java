package akshada_marne;

public class First3NumDivisibleBy3and4 {

	int count = 0;

	void divide(int start, int end) {

		for (int num = start; num <= end; num++) {
			if (num % 3 == 0 && num % 4 == 0) {
				System.out.println(num);
				count++;
			}
			if (count >= 3)
				break;
		}
	}

	public static void main(String args[]) {
		First3NumDivisibleBy3and4 first3NumDivisibleBy3and4 = new First3NumDivisibleBy3and4();
		first3NumDivisibleBy3and4.divide(10, 500);

	}
}
