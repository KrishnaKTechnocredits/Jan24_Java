package varsha;

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
		answer = answer + (num1 / num2);
	}

	void printInfo(){
		System.out.println("Answer : " + answer);
	}

	public static void main(String[] args){
		CalculatorTricky calculatorTricky = new CalculatorTricky();
		calculatorTricky.add(30,20);
		calculatorTricky.sub(20,10);
		calculatorTricky.mul(50,5);
		calculatorTricky.div(100,5);
		calculatorTricky.printInfo();
		}
}