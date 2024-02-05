package kanchan_ghuge;

class Assignment30 {
	int sum = 0;
	int count = 0;

	void isPrimeNumber(int num) {
		boolean flag = true;
		for (int index = 2; index < num; index++) {
			if (num % index == 0) {
				flag = false;
				break;
			}
		}
		if (flag == true) {
			sum = sum + num;
			count++;
		}
	}

	void printSumOfAllNumbers(int startRange, int endRange) {
		for (int num = startRange; num <= endRange; num++) {
			isPrimeNumber(num);
		}
		System.out.println("Total prime numbers in the given range : " + count);
		System.out.println("Sum of all the prime numbers in the given range : " + sum);
	}

	public static void main(String[] args) {
		new Assignment30().printSumOfAllNumbers(50, 100);
	}
}
