/*Assignment 20 : 25th Jan'2024
write a program which print the first 5 even numbers. using for loop, while loop, do while loop*/

package prathamesh_tati;

public class PrintEvenNumbers {

	void evenNumbersForLoop() {
		int count = 0;
		System.out.println("using for loop:");

		for (int num = 1; num <= num++; num++) {
			if (num % 2 == 0) {
				System.out.print(+num + " ");
				count++;
			}
			if (count == 5)
				break;
		}
	}

	void evenNumbersWhileLoop() {
		System.out.println("\n\nusing while loop :");

		int num = 1;
		int count = 0;

		while (num <= num++) {
			if (num % 2 == 0) {
				System.out.print(+num + " ");
				count++;
			}
			if (count == 5)
				break;
		}
	}

	void evenNumbersDoWhileLoop() {
		System.out.println("\n\nusing do while loop :");

		int num = 1;
		int count = 0;

		do {
			if (num % 2 == 0) {
				System.out.print(+ num + " ");
				count++;
			}
			if (count == 5)
				break;
		} while (num <= num++);
	}

	public static void main(String[] args) {
		PrintEvenNumbers printEvenNumbers = new PrintEvenNumbers();
		System.out.println("first 5 even numbers\n");

		printEvenNumbers.evenNumbersForLoop();
		printEvenNumbers.evenNumbersWhileLoop();
		printEvenNumbers.evenNumbersDoWhileLoop();
	}
}