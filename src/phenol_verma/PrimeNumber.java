/*
 Assignment - 30 : 1st Feb'2024
Print all the prime numbers in the give range, and print sum of all the primeNumbers.
input : 50 -> 100
output : total prime numbers in the given range is xx
Sum of all the prime numbers in the given range is yy*/

package phenol_verma;

public class PrimeNumber {

	int sum = 0;
	int count = 0;

	void checkPrimeNum(int number) {
		boolean isprime = true;
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isprime = false;
				break;
			}
		}
		if (isprime == true) {
			count++;
			sum = sum + number;
		}
	}

	void printAllPrimeNum(int firstNum, int lastNum) {

		for (int index = firstNum; index <= lastNum; index++) {
			checkPrimeNum(index);
		}
		System.out.println("Total Prime Number from " + firstNum + " till " + lastNum + " = " + count);
		System.out.println("Sum of all the prime numbers in the given range is " + sum);
	}

	public static void main(String[] args) {
		PrimeNumber primeNumber = new PrimeNumber();
		primeNumber.printAllPrimeNum(50, 100);
	}
}