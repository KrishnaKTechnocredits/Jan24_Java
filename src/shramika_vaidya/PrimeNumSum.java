package shramika_vaidya;

class PrimeNumSum {
	int count = 0;
	int sum = 0;

	void isNumPrime(int num) {
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

	void printPrimeNum(int startIndex, int endIndex) {
		for (int num = startIndex; num <= endIndex; num++) {
			isNumPrime(num);
		}
		System.out.println("Total prime numbers in the given range is = " + count);
		System.out.println("Sum of all the prime numbers in the given range is = " + sum);
	}

	public static void main(String[] args) {
		new PrimeNumSum().printPrimeNum(50, 100);
	}
}
