package kanchan_ghuge;

class CalculatorTricky{
	
	int answer;
	
	void add(int num1, int num2){
		answer = answer + ( num1 + num2);
		System.out.println("Addition = " + answer);
	}
	
	void sub(int num1, int num2){
		answer = answer + ( num1 - num2);
		System.out.println("Substraction = " + answer);
	}
	
	void mul(int num1, int num2){
		answer = answer + (num1 *  num2);
		System.out.println("Multiplication = " + answer);
	}

    void div(int num1, int num2){
		answer = answer + (num1 / num2);
		System.out.println("Division = " + answer);
	}
	
	void display(){
		System.out.println("Final Answer = " + answer);
	}
	
	public static void main(String [] args){
		CalculatorTricky calculatorTricky = new CalculatorTricky();
		calculatorTricky.add(10,20);
		calculatorTricky.sub(20,4);
		calculatorTricky.mul(10,5);
		calculatorTricky.div(10,2);
		calculatorTricky.display();
	}
}	

		