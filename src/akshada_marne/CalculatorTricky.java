package akshada_marne;

class CalculatorTricky{
	int answer;
	
	void addition(int num1, int num2){
		int temp=num1+num2;
		answer=answer+temp;
	}
	void subtraction(int num1, int num2){
		int temp=num1-num2;
		answer=answer+temp;
	}
	void multiplication(int num1, int num2){
		int temp=num1*num2;
		answer=answer+temp;
	}
	void division(int num1, int num2){
		int temp=num1/num2;
		answer=answer+temp;
	}
	void display(){
		System.out.println(answer);
	}
	public static void main (String args[]){
		CalculatorTricky calculatorTricky = new CalculatorTricky();
		calculatorTricky.addition(20,30);
		calculatorTricky.subtraction(50,20);
		calculatorTricky.multiplication(10,5);
		calculatorTricky.division(200,10);
		calculatorTricky.display();
	}
}