package rupali_umagol;

class CalculatorPara{
	
	void add(int num1,int num2){
		System.out.println("num1 is "+ num1 + ", num2 is "+ num2 +", Addition = " + (num1 + num2));
	}
	void sub(int num1,int num2){
		System.out.println("num1 is "+ num1 + ", num2 is "+ num2 +", Subtraction = " + (num1 - num2));
	}
	void multi(int num1,int num2){
		System.out.println("num1 is "+ num1 + ", num2 is "+ num2 +", Multiplication = " + (num1 * num2));
	}
	void div(int num1,int num2){
		System.out.println("num1 is "+ num1 + ", num2 is "+ num2 +", Division = " + (num1 / num2));
	}
	
	public static void main(String[] args){
		CalculatorPara calculator=new CalculatorPara();
		calculator.add(20,30);
		calculator.sub(50,22);
		calculator.div(200,10);
		calculator.multi(50,5);
	}
}