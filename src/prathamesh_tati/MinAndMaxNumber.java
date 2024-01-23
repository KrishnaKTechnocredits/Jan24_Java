/*Assignment - 7 : 18th Jan'2024
Write 2 methods, one method to find maximum number from 2 numbers, other to find minimum number from given 2 numbers.*/
package prathamesh_tati;

public class MinAndMaxNumber {

	void minNumber(int num1, int num2) {
		if (num1 < num2) {
			System.out.println(num1 + " is smaller between " + num1 + " and " + num2 + ".");
		} else {
			System.out.println(num2 + " is smaller between " + num1 + " and " + num2 + ".");
		}
	}

	void maxNumber(int num1, int num2) {
		if (num2 < num1) {
			System.out.println(num1 + " is larger between " + num1 + " and " + num2 + ".");
		} else {
			System.out.println(num2 + " is larger between " + num1 + " and " + num2 + ".");
		}
	}

	public static void main(String[] args) {
		MinAndMaxNumber minAndMaxNumber = new MinAndMaxNumber();
		minAndMaxNumber.minNumber(10, 17);
		minAndMaxNumber.maxNumber(10, 17);
	}
}
