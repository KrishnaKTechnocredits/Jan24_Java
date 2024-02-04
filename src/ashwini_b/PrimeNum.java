package ashwini_b;

/*
 Assignment - 30 : 1st Feb'2024
Print all the prime numbers in the give range, and print sum of all the primeNumbers.
input : 50 -> 100
output : total prime numbers in the given range is xx
Sum of all the prime numbers in the given range is yy
 */
public class PrimeNum {
	int sum = 0;
	int count = 0;

	void checkPrimeNum(int number) {
		boolean isprime = true;
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				// System.out.println(number + " is not prime");
				isprime = false;
				break;
			}
		}
		if (isprime == true) {
			// System.out.println(number + " is prime");
			count++;
			sum = sum + number;
		}
	}

	void printAllPrimeNum(int startindex, int lastindex) {

		for (int index = startindex; index <= lastindex; index++) {
			checkPrimeNum(index);
		}
		System.out.println("total prime numbers in the given range is " + count);
		System.out.println("Sum of all the prime numbers in the given range is " + sum);
	}

	public static void main(String[] args) {
		PrimeNum primeNum = new PrimeNum();
		primeNum.printAllPrimeNum(50, 100);
	}
}
