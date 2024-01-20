package shravani_rapelli;

class CalculatorTricky{

	int answer;
	
	void addition(int num1, int num2){
		answer = answer + (num1 + num2);
	}
	
	void subtraction(int num1, int num2){
		answer = answer + (num1 - num2);
	}
	
	void multiplication(int num1, int num2){
		answer = answer + (num1 * num2);
	}
	
	void division(int num1, int num2){
		answer = answer + (num1 / num2);
	}
	
	void displayTotal(){
		System.out.println(answer);
	}
	
	public static void main(String[] args){
		CalculatorTricky calculatortricky = new CalculatorTricky();
		calculatortricky.addition(100,100);
		calculatortricky.subtraction(100,50);
		calculatortricky.multiplication(20,12);
		calculatortricky.division(144,12);
		calculatortricky.displayTotal();
	}
}