/*Assignment - 30 : 1st Feb'2024

Print all the prime numbers in the give range, and print sum of all the primeNumbers.

input : 50 -> 100
output : total prime numbers in the given range is xx
         Sum of all the prime numbers in the given range is yy
----------------------------------------------------------------------------------*/
package pallavi_raut;

class FindPrimeNumber {
	int count = 0;
	int sum = 0;

	int printPrimeNumbers(int startIndex, int endIndex) {
		System.out.println("Total prime numbers in between " + startIndex + " and " + endIndex + " are ");
		for (int number = startIndex; number <= endIndex; number++) {
			if (isPrime(number) == true) {
				sum = sum + number;
			}
		}
		System.out.println("Sum of all prime numbers in between " + startIndex + " and " + endIndex + " are " + sum);
		return sum;
	}

	boolean isPrime(int num) {
		boolean flag = true;
		for (int index = 2; index < num; index++) {
			if (num % index == 0) {
				flag = false;
				break;
			}
		}
		if (flag == true) {
			System.out.println(num);
		}
		return flag;
	}

	public static void main(String[] args) {
		FindPrimeNumber findPrimeNumber = new FindPrimeNumber();
		findPrimeNumber.printPrimeNumbers(50, 100);
	}
}