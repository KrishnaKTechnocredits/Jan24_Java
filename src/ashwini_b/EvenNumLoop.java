package ashwini_b;

/*
1. write a program which print the first 5 even numbers.
[using for loop, while loop, do while loop]
*/

public class EvenNumLoop {
	void printEvennum() {
		int count = 1;
		int num = 0;
		for (num = 1; num <= 100; num++) {
			if (num % 2 == 0 && count <= 5) {
				count++;
				System.out.println(num);
			}
		}
	}

	void printEvenWhileLp() {
		int count = 1;
		int num = 1;
		while (num <= 100) {
			if(num % 2 == 0 && count <= 5) {
				count++;
				System.out.println(num);
			}
			num++;
		}
	}
	
	void printEvenDoWhileLp() {
		int count = 1;
		int num = 1;
		do {
			if(num % 2 == 0 && count <= 5) {
				count++;
				System.out.println(num);
			}
			num++;
		} while (num <= 100);
	}


	public static void main(String[] args) {
		EvenNumLoop evenNumLoop = new EvenNumLoop();
		System.out.println("First Five Number using for looop");
		evenNumLoop.printEvennum();
		System.out.println("First Five Number using while looop");
		evenNumLoop.printEvenWhileLp();
		System.out.println("First Five Number using do while looop");
		evenNumLoop.printEvenDoWhileLp();
	}
}
