package aanand;

public class Assignment30 {
	int count = 0, sum = 0;

	void primNum(int number) {
		boolean flag = true;
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				// System.out.println(number + " number is not prim.");
				flag = false;
				break;
			}
		}
		if (flag == true) {
			System.out.println(number + " number is prime.");
			count++;
			sum = sum + number;
		}
	}

	void printAllPrimNumber(int startRange, int endRange) {
		for (int i = startRange; i <= endRange; i++) {
			primNum(i);
		}
		System.out.println("Total prime numbers in the given range is: " + count);
		System.out.println("Sum of all the prime numbers in the given range is: " + sum);
	}

	public static void main(String[] args) {
		Assignment30 assignment30 = new Assignment30();
		assignment30.printAllPrimNumber(50, 100);
	}
}
