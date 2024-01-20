package aanand;

class CalculatorTricky{

	int answer;
	
	void addition(int num1, int num2 ){
		answer = answer + (num1 + num2);
	}
	
	void subtraction(int num1, int num2 ){
		answer = answer + (num1 - num2);
	}
	
	void division(int num1, int num2 ){
		answer = answer + (num1 / num2);
	}
	
	void multiplication(int num1, int num2 ){
		answer = answer + (num1 * num2);
	}
	
	void printOfAdditional(){
		System.out.println("Addition of all operations "+answer);
	}
	
	public static void main(String[] args){
		CalculatorTricky calculatorTricky = new CalculatorTricky();
		calculatorTricky.addition(10,20);
		calculatorTricky.subtraction(10,2);
		calculatorTricky.division(200,10);
		calculatorTricky.multiplication(10,10);
		calculatorTricky.printOfAdditional();
		
	}
}