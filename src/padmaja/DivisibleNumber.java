//Assignment 11 : On user defined range print all numbers which are divisible by 5 and divisible by 3.
package padmaja;

public class DivisibleNumber {
	void printDivisibleNumber(int startIndex, int endIndex) {
		for (int num = startIndex; num <= endIndex; num++) {
			if (num % 3 == 0 && num % 5 == 0)
				System.out.println("Number Divisible by 3 and 5 is " + num);
		}
	}

	public static void main(String[] args) {
		DivisibleNumber divisibleNumber = new DivisibleNumber();
		divisibleNumber.printDivisibleNumber(5, 40);
	}

}
