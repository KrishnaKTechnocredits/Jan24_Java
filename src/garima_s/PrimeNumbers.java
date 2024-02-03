package garima_s;

public class PrimeNumbers {
	int sum;

	void IsPrimeNumber(int number) {
		boolean Flag = false;
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				Flag = true;
				break;
			}
		}
		if (Flag == false) {
			System.out.println(number + " is a Prime Number");
			sum = sum + number;
		}
	}

	void printPrimeNumber(int startRange, int endRange) {
		for (int index = startRange; index <= endRange; index++) {
			IsPrimeNumber(index);
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		new PrimeNumbers().printPrimeNumber(10, 20);
	}
}
