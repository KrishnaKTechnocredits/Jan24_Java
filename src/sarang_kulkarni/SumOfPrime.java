/*Assignment - 30 : 1st Feb'2024
Print all the prime numbers in the give range, and print sum of all the primeNumbers.
input : 50 -> 100
output : total prime numbers in the given range is xx
         Sum of all the prime numbers in the given range is yy*/

package sarang_kulkarni;

public class SumOfPrime {

	static int count = 0, sum = 0;

	void isPrime(int num) {
		boolean flag = true;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				flag = false;
				break;
			}
		}
		if (flag == true) {
			count++;
			sum = sum + num;
		}
	}

	void printPrime(int start, int end) {
		for (int i = start; i <= end; i++) {

			isPrime(i);
		}
		System.out.println("Given Range is "+start+" & "+end);
		System.out.println("Total prime numbers in the given range is = " + count);
		System.out.println("Sum of all the prime numbers in the given range is = " + sum);
	}

	public static void main(String[] args) {
		SumOfPrime sumofprime = new SumOfPrime();
		sumofprime.printPrime(50, 100);
	}
}
