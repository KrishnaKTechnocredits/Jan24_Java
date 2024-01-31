package ankita_s;

public class EvenNumberss {

	void printEvenNumbersForLoop(int firstnumber, int lastnumber) {
		int count = 0;
		for (int i = firstnumber; i < lastnumber; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
				count++;
			}
			if (count == 5)
				break;
		}
	}

	void printEvenNumbersWhileLoop() {
		int count = 0;
		int num = 0;
		while (count < 5) {
			if (num % 2 == 0) {
				System.out.println(num);
				count++;
			}
			num++;
		}
	}

	void printEvenNumbersDoWhileLoop() {
		int count = 0;
		int i = 0;
		do {
			if (i % 2 == 0) {
				System.out.println(i);
				count++;
			}
			i++;
		} while (count < 5);
	}

	public static void main(String[] args) {
		EvenNumberss evenNumbers = new EvenNumberss();
		System.out.println("First 5 even numbers using for loop:- ");
		evenNumbers.printEvenNumbersForLoop(0, 20);
		System.out.println("First 5 even numbers using while loop:- ");
		evenNumbers.printEvenNumbersWhileLoop();
		System.out.println("First 5 even numbers using do while loop:- ");
		evenNumbers.printEvenNumbersDoWhileLoop();
	}
}
