package akshay_gaikwad;

class CalculatorTricky{

	int ans;
	
	void add(int num1, int num2){
		
		ans = ans + (num1 + num2);
	}
	
	void sub(int num1, int num2){
		
		ans = ans + (num1 - num2);
	}
	
	void div(int num1, int num2){
		
		ans = ans + (num1 / num2);
	}
	
	void mul(int num1, int num2){
		
		ans = ans + (num1 * num2);
	}
	
	void printAnswer(){
		
		System.out.println("Addition of answers is : " + ans);
	}
	
	public static void main(String[] args){
		
		CalculatorTricky calculatorTricky = new CalculatorTricky();
		calculatorTricky.add(20,30);
		calculatorTricky.sub(50,25);
		calculatorTricky.div(40,4);
		calculatorTricky.mul(5,8);
		calculatorTricky.printAnswer();
	}
}