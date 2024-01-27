/*Assignment - 2 : 16th Jan'2024
Write a program called CalculatorTricky, all 4 methods should be parameterized and write a method that will
print addition of answers get from all the methods.*/

package phenol_verma;

class CalculatorTricky {

	static int totalAmount = 0;

	void addition(int num1, int num2) {
		int ans = num1 + num2;
		totalAmount = totalAmount + ans;
	}

	void subtraction(int num1, int num2) {
		int ans = num1 - num2;
		totalAmount = totalAmount + ans;
	}

	void division(int num1, int num2) {
		int ans = num1 / num2;
		totalAmount = totalAmount + ans;
	}

	void multiplication(int num1, int num2) {
		int ans = num1 * num2;
		totalAmount = totalAmount + ans;
	}

	public static void main(String[] args) {

		CalculatorTricky calculatorTricky = new CalculatorTricky();
		calculatorTricky.addition(20, 30);
		calculatorTricky.subtraction(50, 22);
		calculatorTricky.division(200, 10);
		calculatorTricky.multiplication(50, 5);
		System.out.println("Total of all method = " + calculatorTricky.totalAmount);
	}
}