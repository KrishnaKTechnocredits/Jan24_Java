package aanand;

class Calculator{
	
	void addition(int num1, int num2 ){
		System.out.println("num1 is " + num1 + " num2 is " + num2 + ", addition = " + (num1 + num2));
	}
	
	void subtraction(int num1, int num2 ){
		System.out.println("num1 is " + num1 + " num2 is " + num2 + ", subtraction = " +(num1 - num2));
	}
	
	void division (int num1, int num2 ){
		System.out.println("num1 is " + num1 + " num2 is " + num2 + ", division = " + (num1 / num2));
	}
	
	void multiplication(int num1, int num2 ){
		System.out.println("num1 is " + num1 + " num2 is " + num2 + ", multiplication = "+ (num1 * num2));
	}
	
	public static void main(String[] args){
		Calculator calculator = new Calculator();
		calculator.addition(20, 30);
		calculator.subtraction(50, 22);
		calculator.division(200, 10);
		calculator.multiplication(50, 5);
 	}
}