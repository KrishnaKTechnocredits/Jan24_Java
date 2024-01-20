package prathamesh_tati;

class Calculator{
	
	void add(int num1, int num2){
		System.out.println("num1 is "+ num1 +", num2 is "+ num2 + ", addition = " +(num1+num2));
	}
	
	void sub(int num1, int num2){
		System.out.println("num1 is "+ num1 +", num2 is "+ num2 + ", subtraction = " +(num1-num2));
	}
	
	void mul(int num1, int num2){
		System.out.println("num1 is "+ num1 +", num2 is "+ num2+ ", multiplication = " +(num1*num2));
	}
	
	void div(int num1, int num2){
		System.out.println("num1 is "+ num1 +", num2 is "+ num2 + ", division = " +(num1/num2));
	}
	
	public static void main(String[] args){
		Calculator calculator = new Calculator();
		calculator.add(15,30);
		calculator.sub(70,30);
		calculator.div(60,12);
		calculator.mul(54,9);
	}
}