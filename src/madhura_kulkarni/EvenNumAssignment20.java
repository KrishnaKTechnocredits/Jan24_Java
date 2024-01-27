/*Assignment 20 : 25th Jan'2024
1. write a program which print the first 5 even numbers.
[using for loop, while loop, do while loop]
*/
package madhura_kulkarni;

public class EvenNumAssignment20 {

	public static void main(String[] args) {
		EvenNumAssignment20 even = new EvenNumAssignment20();
		even.formethod(0, 20);
		even.whilemethod(50);
		even.dowhilemethod(50);
	}

//To print first 5 even numbers using for loop
	void formethod(int n1, int n2) {
		int count = 0;
		System.out.println("Printing first 5 even numbers using for loop:\n");
		for (int index = n1; index <= n2; index++) {
			if (index % 2 == 0) {
				System.out.println(index);
				count++;
			}
			if (count == 5)
				break;
		}

	}

	// To print first 5 even numbers using while loop
	void whilemethod(int n1) {
		int count = 0, index = 0;
		System.out.println("Printing first 5 even numbers using while loop:\n");
		while (index <= n1) {
			System.out.println(+index);
			index = index + 2;
			count++;
			if (count == 5)
				break;
		}
	}

	// To print first 5 even numbers using do while loop
	void dowhilemethod(int n1) {
		int count = 0, index = 0;
		System.out.println("Printing first 5 even numbers using do while loop:\n");
		do {

			System.out.println(+index);
			index = index + 2;
			count++;
			if (count == 5)
				break;
		} while (index <= n1);
	}
}
