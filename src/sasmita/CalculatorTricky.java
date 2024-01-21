package sasmita;

class CalculatorTricky{
	
	int answer;
	
	void add(int num1, int num2){
		int temp = num1 + num2;//10+20=30
		answer = answer + temp;//0+30=30
		System.out.println("Addition value is " + answer);
	}
	
	void sub(int num1, int num2){
		int temp = num1 - num2;//200-100=100
		answer = answer + temp;//30+100=130
		System.out.println("Substraction value is " + answer);
	}
	
	void mul(int num1, int num2){
		int temp = num1 * num2;//10*20=200
		answer = answer + temp;//330
		System.out.println("Multiplication value is " + answer);
	}
	
	void div(int num1, int num2){
		int temp = num1 / num2;//20/10=2
		answer = answer + temp;//330+2=332
		System.out.println("Division value is " + answer);
	}
	
	public static void main(String[]args){
		CalculatorTricky cal = new CalculatorTricky();
		cal.add(10,20);
		cal.sub(200,100);
		cal.mul(10,20);
		cal.div(20,10);
	}
}