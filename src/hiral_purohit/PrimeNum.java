package hiral_purohit;

public class PrimeNum {
	int count;
	int sum = 0;

	void isPrimeNum(int number) {
		boolean flag = true;
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				flag = false;
				break;
			}
		}
		if (flag == true) {
			count++;
			sum = sum + number;
		}
	}

	void printPrime(int startRange, int endRange) {
		for (int num = startRange; num <= endRange; num++) {
			isPrimeNum(num);
		}
		System.out.println("total prime numbers in the given range is " + count);
		System.out.println("Sum of all the prime numbers in the given range is " + sum);
	}

	public static void main(String[] args) {
		new PrimeNum().printPrime(50, 100);
	}
}
