package shafaque;

public class PrimeNumbers {
	int sum = 0;
	int count = 0;

	void getPrimeNumbers(int num) {
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

	void printPrimeNumber(int startindex, int endindex) {
		for (int num = startindex; num < endindex; num++) {
			getPrimeNumbers(num);

		}
		System.out.println("Total Prime Numbers are : " + count);
		System.out.println("Sum of all Prime Numbers are : " + sum);
	}

	public static void main(String[] args) {
		new PrimeNumbers().printPrimeNumber(50, 100);
	}

}