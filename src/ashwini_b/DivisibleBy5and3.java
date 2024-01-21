package ashwini_b;

/*
 1. On user defined range print all numbers which are divisible by 5 and divisible by 3.
Hint : pass start and end index as a parameter.
Input : Range -> 5 to 40
Output : Divisible by 5 & 3, numbers are:
15
30
*/

public class DivisibleBy5and3 {
	void printDivisibleBy53(int startIndex, int endIndex) {
		System.out.println("Divisible by 5 & 3, numbers are: ");
		for (int index = startIndex; index <= endIndex; index++) {
			if (index % 5 == 0 && index % 3 == 0) {
				System.out.println(index);
			}
		}
	}

	public static void main(String[] args) {
		DivisibleBy5and3 divisibleBy5and3 = new DivisibleBy5and3();
		divisibleBy5and3.printDivisibleBy53(5, 40);

	}

}
