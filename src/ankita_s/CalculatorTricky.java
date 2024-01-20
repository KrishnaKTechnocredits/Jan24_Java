package ankita_s;

class  CalculatorTricky{
	int answer;
	
	void addition(int num1,int num2){
		answer= answer + (num1+num2);
    }

	void subtraction(int num1,int num2){
		answer=answer + (num1-num2);
    }
  
	void multiplication(int num1,int num2){
		answer= answer + (num1*num2);
    }
  
	void division(int num1,int num2){
		answer= answer + (num1/num2);
	}
	void print(){
		System.out.println("Here is the addition of answers get from all the methods:- " + answer);
	}
  
	public static void main(String[] agrs){
		CalculatorTricky calculatorTricky = new CalculatorTricky();
		calculatorTricky.addition(20,30);
		calculatorTricky.subtraction(50,22);
		calculatorTricky.multiplication(50,5);
		calculatorTricky.division(200,10);
		calculatorTricky.print();
    }
}