/*Assignment - 30 : 1st Feb'2024

Print all the prime numbers in the give range, and print sum of all the primeNumbers.

input : 50 -> 100
output : total prime numbers in the given range is xx
         Sum of all the prime numbers in the given range is yy*/

package padmaja;

public class PrimeNumber {
	int sumOfPrimeNumbers = 0;

	void isPrimeNumber(int num) {
		boolean flag = true;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				// System.out.println(num + "is not prime");
				flag = false;
				break;
			}
		}
		if (flag == true) {
			System.out.println(num + " is Prime");
			sumOfPrimeNumbers = sumOfPrimeNumbers + num;
		}
	}

	void printPrimeNumber(int startRange, int endRange) {
		for (int num = startRange; num <= endRange; num++) {
			isPrimeNumber(num);
		}
		System.out.println("Sum of Prime Numbers is " + sumOfPrimeNumbers);
	}

	public static void main(String[] args) {
		PrimeNumber primeNumber = new PrimeNumber();
		primeNumber.printPrimeNumber(50, 100);
	}
}
