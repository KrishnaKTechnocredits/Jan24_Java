package akshada_marne;

public class PrimeNumber {

	int sum = 0;

	void checkPrime(int num) {

		boolean isPrime = true;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				// System.out.println(num + " is not a prime number");
				isPrime = false;
				break;
			}
		}

		if (isPrime == true) {
			sum = sum + num;
			System.out.println(num + " is a prime number");
		}
	}

	void printPrimeNumbers(int startRange, int endRange) {
		for (int i = startRange; i <= endRange; i++) {
			checkPrime(i);
		}
		System.out.println("Sum of prime numbers between 50 to 100 is " + sum);

	}

	public static void main(String args[]) {
		PrimeNumber primeNumber = new PrimeNumber();
		primeNumber.printPrimeNumbers(50, 100);
	}
}
