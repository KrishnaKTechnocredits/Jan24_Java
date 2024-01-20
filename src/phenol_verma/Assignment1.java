/*Assignment - 1 : 15th Jan'2024

Write a Calculator program having 4 parameterized method to perform addition, subtraction, multiplication and division.

output should be: 
num1 is 20, num2 is 30, addition = 50
num1 is 50, num2 is 22, subtraction = 28
num1 is 200, num2 is 10, division = 20
num1 is 50, num2 is 5, multiplication = 250*/

package phenol_verma;

class Assignment1 {
	void addition(int num1, int num2) {
		int ans = num1 + num2;
		System.out.println("num1 is 20, num2 is 30, addition = " + ans);	
	}
	
	void subtraction(int num1, int num2) {
		int ans = num1 - num2;
		System.out.println("num1 is 50, num2 is 22, subtraction = " + ans);	
	}
	
	void division(int num1, int num2) {
		int ans = num1 / num2;
		System.out.println("num1 is 200, num2 is 10, division = " + ans);	
	}
	
	void multiplication(int num1, int num2) {
		int ans = num1 * num2;
		System.out.println("num1 is 50, num2 is 5, multiplication = " + ans);	
	}

	public static void main(String[] args) {
		
		Assignment1 assignment1 = new Assignment1();
		assignment1.addition(20, 30);
		assignment1.subtraction(50, 22);
		assignment1.division(200, 10);
		assignment1.multiplication(50, 5);
	}
}