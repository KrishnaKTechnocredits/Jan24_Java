package puja_poreddiwar;

public class PrimeNumber {

	int sum = 0;
	int count = 0;

	void isPrimeNumber(int num) {
		boolean flag = true;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				flag = false;
				break;
			}
		}
		if (flag == true) {
			//System.out.println(num + " is a prime number");
			sum = sum + num;
			count++;
		}
	}

	void printSumofAll(int startRange, int endRange) {
		for (int num = startRange; num <= endRange; num++) {
			isPrimeNumber(num);
		}
		System.out.println("Total prime numbers in the given range is : " + count);
		System.out.println("Total sum of all prime numbers is : " + sum);
	}

	public static void main(String[] args) {
		PrimeNumber primeNumber = new PrimeNumber();
		primeNumber.printSumofAll(50, 100);
	}

}
