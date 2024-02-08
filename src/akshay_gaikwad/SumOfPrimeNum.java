package akshay_gaikwad;

public class SumOfPrimeNum {

	boolean isPrime(int num) {
		boolean flag = true;
		for (int index = 2; index < num; index++) {
			if (num % index == 0) {
				flag = false;
			}
		}
		if (flag) {
			System.out.print(" "+ num);
			return flag;
		} else {
			return flag;
		}
	}

	void printSumOfPrime(int startNum, int endNum) {
		int sum = 0;
		System.out.print("List of prime numbers between " + startNum +" and " + endNum + " :");
		for (int index = startNum; index <= endNum; index++) {
			if (isPrime(index)) {
				sum += index;
				System.out.print(",");
			}
		}
		System.out.println();
		System.out.println("Sum of all prime numbers between " + startNum + " and " + endNum + " is " + sum);
	}

	public static void main(String[] args) {
		new SumOfPrimeNum().printSumOfPrime(50, 100);
	}
}
