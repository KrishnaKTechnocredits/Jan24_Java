/* Assignment - 9 : 21st Jan'2024
 print all even numbers in a user defined range.*/

package prathamesh_tati;

public class EvenNumbers {

	void givenRangePrintEvenNumbers(int startIndex, int endIndex) {
		System.out.println("Even numbers are:");
		for (int num = startIndex; num <= endIndex; num++){
			if (num % 2 == 0)
				System.out.println(num);
		}
	}

	public static void main(String[] args) {
		EvenNumbers evenNumbers = new EvenNumbers();
		evenNumbers.givenRangePrintEvenNumbers(10, 15);
	}
}