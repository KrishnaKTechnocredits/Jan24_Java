package prathamesh_tati;

/*Write a program called CalculatorTricky, all 4 methods should be parameterized and write a method that will
print addition of answers get from all the methods.*/


class CalculatorTricky{
	
	int answer;
	
	void add(int num1, int num2){
		answer = answer + (num1 + num2);
	}
	
	void sub(int num1, int num2){
		answer = answer + (num1 - num2);
	}
	
	void mul(int num1, int num2){
		answer = answer + (num1 * num2);
	}
	
	void div(int num1, int num2){
		answer = answer + (num1/num2);
	}
	
	void output(){
		System.out.println("Addition of answers from all Methods = " +answer);
	}
	
	public static void main(String[] args){
		CalculatorTricky calculatorTricky = new CalculatorTricky();
		calculatorTricky.add(25,30);
		calculatorTricky.sub(40,35);
		calculatorTricky.mul(10,5);
		calculatorTricky.div(15,3);
		calculatorTricky.output();	
	}
}