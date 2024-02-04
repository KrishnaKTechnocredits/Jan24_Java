package lovekesh_mishra;

class PrimeNumbersAssignment30 {

	int sum = 0;
	int count = 0;

	void primeNumbers(int num) {

		boolean isflag = true;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				isflag = false;
				break;

			}
		}
		if (isflag == true) {
			sum = sum + num;
			count++;
			System.out.println("prime numbers are--> " + num);

		}

	}

	void printPrimeNumbers(int startindex, int endindex) {

		for (int num = startindex; num <= endindex; num++) {
			primeNumbers(num);

		}
		System.out.println("sum of all prime numbers is---> " + sum);

	}

	public static void main(String[] args) {
		PrimeNumbersAssignment30 primeNumbersAssignment30 = new PrimeNumbersAssignment30();
		primeNumbersAssignment30.printPrimeNumbers(50, 100);

	}

}
