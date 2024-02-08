//Print all the prime numbers in the give range, and print sum of all the primeNumbers.
package shridhar_k;

public class Assignment30 {
	boolean isPrimeNum(int num) {
		boolean isPrime = true;
		for (int i = 2; num/2 >= i ; i++) {
			if(num % i == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			System.out.println(num);
		}
		return isPrime;
	}
	
	void sumOfPrimeNum(int strNum, int endNum) {
		int count = 0;
		int sum = 0;
		for(int num = strNum; endNum >= num; num++) {
			boolean isPrime = isPrimeNum(num);
			if (isPrime) {
				count++;
				sum = sum + num;
			}
		}
		System.out.println();
		System.out.println("total prime numbers in the given range is " + count);
		System.out.println("Sum of all the prime numbers in the given range is " + sum );
	}

	public static void main(String[] args) {
		Assignment30 assignment30 = new Assignment30();
		assignment30.sumOfPrimeNum(50, 100);

	}

}
