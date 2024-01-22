/*Assignment - 9 : 21st Jan'2024


Write only one program having the following methods.

1. print all even numbers in a user defined range.

Hint : pass start and end index as a parameter.

Input : Range -> 10 to 15

Output : Even numbers are:

10

12

14*/

package madhura_kulkarni;

public class EvenNumbers {

	public static void main(String[] args) {
		EvenNumbers even = new EvenNumbers();
		even.checkeven(10, 15);
	}

	void checkeven(int startRange, int endRange) {
		System.out.println("Even numbers are:\n");
		for (int num = startRange; num <= endRange; num++) {
			if (num % 2 == 0)
				System.out.println(num + "\n");
		}
	}
}
