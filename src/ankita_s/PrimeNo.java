package ankita_s;

public class PrimeNo {
	int sum = 0, count = 0;

	void printPrimeNo(int num) {
		boolean flag = true;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				// System.out.println("number is not prime"+num);
				flag = false;
				break;
			}
		}
		if (flag == true) {
			// System.out.println(num);
			count++;
			sum = sum + num;
		}
	}

	void printprimenumbers(int startrange, int endrange) {
		for (int num = startrange; num <= endrange; num++) {
			printPrimeNo(num);
		}
		System.out.println("Sum of prime no is:- " + sum);
		System.out.println("Count of prime no is:-" + count);
	}

	public static void main(String[] args) {
		PrimeNo primeNo = new PrimeNo();
		primeNo.printprimenumbers(50, 100);
	}
}
