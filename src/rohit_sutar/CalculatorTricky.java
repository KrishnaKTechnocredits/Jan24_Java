package rohit_sutar;

class CalculatorTricky{
	
	int total;
	
	void addition(int num1, int num2){
		total = total + (num1 + num2);
	}
	
	void substraction(int num1, int num2){
		total = total + (num1 - num2);
	}
	
	void multiplication(int num1, int num2){
		total = total + (num1 * num2);
	}
	
	void division(int num1, int num2){
		total = total + (num1 / num2);
	}
	
	void printTotal(){
		System.out.println("Addition of answers get from all the methods: "+total);
	}
	
	public static void main(String args[]){
		CalculatorTricky calculatorTricky = new CalculatorTricky();
		calculatorTricky.addition(100,10);
		calculatorTricky.substraction(200,20);
		calculatorTricky.multiplication(300,30);
		calculatorTricky.division(400,40);
		calculatorTricky.printTotal();
	}
}