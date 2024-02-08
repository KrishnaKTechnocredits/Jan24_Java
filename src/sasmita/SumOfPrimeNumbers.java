package sasmita;

public class SumOfPrimeNumbers {

	boolean isPrime(int number) {
		boolean flag = true;
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}

	void printPrime(int startRange, int endRange) {
		boolean flag;
		int sum = 0;
		int count = 0;
		for (int index = startRange; index <= endRange; index++) {
			flag = isPrime(index);
			if (flag == true) {
				sum = sum + index;
				count++;
			}
		}
		System.out.println("Total prime number in the gievn range is " + count);
		System.out.println("sum of all the prime number in the gievn range is " + sum);
	}

	public static void main(String[] args) {
		SumOfPrimeNumbers sumofprimenumbers = new SumOfPrimeNumbers();
		sumofprimenumbers.printPrime(50, 100);

	}

}
