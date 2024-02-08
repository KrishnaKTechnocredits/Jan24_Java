/*Assignment - 30 : 1st Feb'2024

Print all the prime numbers in the give range, and print sum of all the primeNumbers.

input : 50 -> 100
output : total prime numbers in the given range is xx
         Sum of all the prime numbers in the given range is yy*/

package madhura_kulkarni;

public class Assignment30 {
	int sum = 0, count = 0;

	void toCheckNumIsPrime(int num) {
		boolean flag = true;

		for (int i = 2; i < num; i++) {
			if (num % i == 0)

			{
				flag = false;
				break;
			}
		}
		if (flag == true) {
			count++;
			sum = sum + num;
		}

	}

	void printPrimeNum(int startRange, int endRange) {
		for (int i = startRange; i < endRange; i++)
			toCheckNumIsPrime(i);
		System.out.println("Total prime numbers in the given range is " + count);
		System.out.println("Sum of all the prime numbers in the given range is " + sum);
	}

	public static void main(String[] args) {
		Assignment30 primeNum = new Assignment30();
		primeNum.printPrimeNum(50, 100);
	}

}
