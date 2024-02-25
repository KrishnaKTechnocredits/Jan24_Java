package rohit_sutar;

/*
 * Print all the prime numbers in the give range, and print sum of all the primeNumbers.
 * input : 50 -> 100
 * output : total prime numbers in the given range is xx
 * Sum of all the prime numbers in the given range is yy
 */

public class Assignment30 {

	boolean isPrimeNumber(int num) {
		boolean flag = true;
		for(int i = 2; num/2 >=i ; i++) {
			if(num % i == 0) {
				flag = false;
				break;
			}
		}
		if(flag) {
			System.out.println(num);
		}
		return flag;
	}
	
	void printSumOfPrimeNumber(int startNum, int endNum) {
		int sum = 0;
		int count = 0;	
		for(int i = startNum ; i <= endNum ; i++) {
			boolean flag = isPrimeNumber(i);
			if(flag == true) {
				count++;
				sum = sum + i;
			}
		}
		System.out.println("Sum of prime number is : "+sum);
	}
	
	public static void main(String[] args) {
		Assignment30 assignment30 = new Assignment30();
		assignment30.printSumOfPrimeNumber(50, 100);
	}
}
