package shravani_rapelli;

class Calculator{
	
	void add(int num1, int num2){
		System.out.println("num1 is " + num1 + ", num2 is " + num2 + ", Addition = " + (num1 + num2));
	}
	
	void sub(int num1, int num2){
		System.out.println("num1 is " + num1 + ", num2 is " + num2 + ", Subtraction = " + (num1 - num2));
	}
	
	void mul(int num1, int num2){
		System.out.println("num1 is " + num1 + ", num2 is " + num2 + ", Multiplication = " + (num1 * num2));
	}
	
	void div(int num1, int num2){
		System.out.println("num1 is " + num1 + ", num2 is " + num2 + ", Division = " + (num1 / num2));
	}
	
	public static void main(String[] args){
		Calculator calculator = new Calculator();
		calculator.add(20,20);
		calculator.sub(50,25);
		calculator.mul(30,16);
		calculator.div(80,2);
	}
}
