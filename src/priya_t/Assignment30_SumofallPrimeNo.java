package priya_t;

public class Assignment30_SumofallPrimeNo {
	int sum = 0;

	static boolean isNumPrime(int number) {
		int count = 0;
		boolean flag = true;
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				flag = false;
				break;
			}
		}
		if (flag == true)
			System.out.println("Total prime numbers in the range[50,100] is: " + number);
		return flag;
	}

	public static int sumPrimes(int n) {
		int sum = 0;
		for (int i = 50; i < n; i++) {
			if (isNumPrime(i)) {
				sum += i;
			}
		}
		return sum;
	}

	void printAllPrimeNo(int startRange, int lastIndex) {
		for (int num = startRange; num <= lastIndex; num++) {
			isNumPrime(num);
		}
	}

	public static void main(String[] args) {
        Assignment30_SumofallPrimeNo number = new Assignment30_SumofallPrimeNo();
		number.printAllPrimeNo(50, 100);
		System.out.println("Sum of all the prime numbers in the given range is : " + sumPrimes(100));
	}

}
