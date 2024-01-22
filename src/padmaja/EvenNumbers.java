//Assignment 10 : Print all even numbers in a user defined range.
package padmaja;

class EvenNumbers {
	void printEvenNumbers(int startRange, int endRange) {
		for (int num = startRange; num <= endRange; num++) {
			if (num % 2 == 0)
				System.out.println(num);
		}
	}

	public static void main(String[] args) {
		EvenNumbers evenNumbers = new EvenNumbers();
		evenNumbers.printEvenNumbers(10, 15);
	}
}