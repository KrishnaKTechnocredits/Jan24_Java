//Assignment 20 :  write a program which print the first 5 even numbers.
//[using for loop, while loop, do while loop]

package padmaja;

public class FirstFiveEvenNos {

	void printEvenNos1(int startIndex, int endIndex) {
		int count = 0;
		System.out.println("First 5 even numbers through For Loop are as below ");
		for (int number = startIndex; number <= endIndex; number++) {
			if (number % 2 == 0) {
				System.out.println(number);
				count++;
				if (count == 5)
					break;
			}
		}
	}

	void printEvenNos2(int num) {
		int count = 0;
		System.out.println("First 5 even numbers through while Loop are as below ");
		while (num > 0) {
			if (num % 2 == 0) {
				System.out.println(num);
				count++;
				if (count == 5)
					break;
			}
			num++;
		}
	}

	void printEvenNos3(int num) {
		int count = 0;
		System.out.println("First 5 even numbers through do while Loop are as below ");
		do {
			if (num % 2 == 0) {
				System.out.println(num);
				count++;
				if (count == 5)
					break;
			}
			num++;
		} while (num > 0);
	}

	public static void main(String[] args) {
		FirstFiveEvenNos firstFiveEvenNos = new FirstFiveEvenNos();
		firstFiveEvenNos.printEvenNos1(1, 100);
		firstFiveEvenNos.printEvenNos2(1);
		firstFiveEvenNos.printEvenNos3(1);
	}
}
