package rohini_deshmane;

/*
 * Assignment - 30 : 1st Feb'2024

Print all the prime numbers in the give range, and print sum of all the primeNumbers.

input : 50 -> 100
output : total prime numbers in the given range is xx
         Sum of all the prime numbers in the given range is yy
 */

public class PrimeNumberSumWithRange {
	
	boolean isPrime(int number) {
		boolean flag = true;
		for(int i=2; i<number; i++) {
			if(number%i==0) {
				flag = false;
				break;
			}
		}
		return flag;
	}
	
	void printPrime(int startNumber, int endNumber) {
		boolean flag;
		int sum=0, totalCount=0;
		for(int i=startNumber; i < endNumber; i++) {
			flag = isPrime(i);
			if(flag == true) {
				sum = sum +i;
				totalCount++;
			
			}
		}
		System.out.println("Total prime numbers in the given range is "+totalCount);
		System.out.println("Sum of all the prime numbers in the given range is "+sum);
	
	}
	
	public static void main(String[] args) {
		PrimeNumberSumWithRange primeRange = new PrimeNumberSumWithRange();
		primeRange.printPrime(3, 12);
		System.out.println();
		primeRange.printPrime(50, 100);
	}

}
