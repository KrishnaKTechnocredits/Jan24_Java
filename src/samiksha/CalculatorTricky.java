package samiksha;

class CalculatorTricky{
    int answer;
	void add(int num1, int num2){
		int ans=num1+num2;
		answer=answer+ans;
	}
	void sub(int num1,int num2){
		int ans=num1-num2;
	    answer=answer+ans;
	}
	void mul(int num1,int num2){
		int ans=num1*num2;
		answer=answer+ans;
	}
	void div(int num1,int num2){
		int ans=num1/num2;
		answer=answer+ans;
	}
	void display(){
		System.out.println("The sum of all answers is " + answer);
	}
	public static void main(String[] args){
		CalculatorTricky calculatorTricky = new CalculatorTricky();
		calculatorTricky.add(10,20);
		calculatorTricky.add(60,30);
		calculatorTricky.add(4,5);
		calculatorTricky.add(400,20);
		calculatorTricky.display();
	}
}