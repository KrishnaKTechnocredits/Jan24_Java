package shridhar_k;

class CalculatorTricky{
	int totalSum;
	
	void add(int num1, int num2){
		totalSum = totalSum + (num1 + num2);
	}
	
	void sub(int num1, int num2){
		totalSum = totalSum + (num1 - num2);
	}
	
	void div(int num1, int num2){
		totalSum = totalSum + (num1 / num2);
	}
	
	void mul(int num1, int num2){
		totalSum = totalSum + (num1 * num2);
	}
	
	void displaySumOfAllMethods(){
		System.out.println("Sum of all method answere is "+ totalSum);
	}
	
	public static void main(String [] arg){
		CalculatorTricky calculatorTricky = new CalculatorTricky();
		calculatorTricky.add(30,20);
		calculatorTricky.sub(30,15);
		calculatorTricky.div(45,5);
		calculatorTricky.mul(10,2);
		calculatorTricky.displaySumOfAllMethods();
	}
}
