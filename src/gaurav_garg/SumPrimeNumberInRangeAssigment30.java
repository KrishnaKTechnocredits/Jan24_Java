package gaurav_garg;

public class SumPrimeNumberInRangeAssigment30 {

	boolean isPrimeNumber(int numb1) {
		boolean flag = false;
		for (int i = 2; i < numb1; i++) {
			if (numb1 % i == 0) {
				flag = true;
				break;
			}
		}
		return flag;
	}

	void sumPrimeNumber(int numb1, int numb2) {
		int count = 0;
		int sum = 1;
		System.out.println("Prime number are -:");
		for (int i = numb1; i < numb2; i++) {
			boolean result = isPrimeNumber(i);
			if (result == false) {
				System.out.println(i);
				sum = sum + i;
				count = count + 1;
			}
		}
		System.out.println("total prime numbers in the given range is " + count);
		System.out.println("Sum of all the prime numbers in the given range is " + sum);
	}

	public static void main(String[] args) {
		SumPrimeNumberInRangeAssigment30 sumprimenumberinrangeassigment30 = new SumPrimeNumberInRangeAssigment30();
		sumprimenumberinrangeassigment30.sumPrimeNumber(50, 100);
	}
}
