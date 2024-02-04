package suresh;

public class PrinAllThePrimeNumbers {
	
	int count = 0;
	int sum = 0;

	void getPrimeNumb(int num) {
		boolean flag = true;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				// System.out.println(num+" is not prime number");
				flag = false;
				break;
			}
		}
		if (flag == true) {

			// System.out.println(num+" is prime number");
			sum = sum + num;
			count = count + 1;
		}
	}

	void sumOfPrimeNumber(int startRange, int endRange) {
		for (int i = startRange; i < endRange; i++) {
			getPrimeNumb(i);
		}
		System.out.println("sum of the prime numbers given range is  " + sum);
		System.out.println("count of prime number  given range is " + count);
	}

	public static void main(String[] args) {
		PrinAllThePrimeNumbers prinAllThePrimeNumbers = new PrinAllThePrimeNumbers();
		// prinAllThePrimeNumbers. getPrimeNumb(17);
		prinAllThePrimeNumbers.sumOfPrimeNumber(50, 100);
	}
}
